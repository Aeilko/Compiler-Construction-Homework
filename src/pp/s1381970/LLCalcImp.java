package pp.s1381970;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LLCalcImp implements LLCalc {
	
	// The grammar used
	private Grammar g;
	
	// Maps for first, follow and firts+
	private HashMap<Symbol, Set<Term>> first;
	private HashMap<NonTerm, Set<Term>> follow;
	private HashMap<Rule, Set<Term>> firstP;
	
	
	// Constructor
	/**
	 * Creates a new instance of the LLCalculator
	 * @param g The grammar used.
	 */
	public LLCalcImp(Grammar g){
		this.g = g;
		this.calcFirst();
		this.calcFollow();
		this.calcFirstP();
	}
	
	
	// Commands
	/**
	 * Calculate the first values of the given grammar.
	 */
	private void calcFirst(){
		// Creates the first map, initialize it with empty values.
		HashMap<Symbol, Set<Term>> curFirst = new HashMap<Symbol, Set<Term>>();
		for(NonTerm nt: g.getNonterminals()){
			curFirst.put(nt, new HashSet<Term>());
		}
		
		// Value to detect changes in first
		int hash = -1;
		// While first is changing
		while(hash != curFirst.hashCode()){
			hash = curFirst.hashCode();
			// Re-calculate first
			curFirst = recursiveFirst(curFirst);
		}
		this.first = curFirst;
	}
	
	/**
	 * The recursive part of calcFirst
	 * @param first The current state of first
	 * @return The new state of first
	 */
	private HashMap<Symbol, Set<Term>> recursiveFirst(HashMap<Symbol, Set<Term>> first){
		// Loop through rules
		for(Rule r: this.g.getRules()){
			// Load symbol from the LHS
			NonTerm lhs = r.getLHS();
			// Load the current first 
			Set<Term> lhsFirst = first.get(lhs);
			
			// Load symbols from the right hand side.
			List<Symbol> rhs = r.getRHS();
			// Check if the first symbol is a terminal
			if(rhs.get(0) instanceof Term){
				// First symbol is a terminal, add it to the first of the LHS
				lhsFirst.add((Term) rhs.get(0));
			}
			else{
				// First symbol is a non terminal, add it's first to your first.
				Set<Term> symbolFirst = first.get(rhs.get(0));
				lhsFirst.addAll(symbolFirst);
				// Check if it contains epsilon
				if(symbolFirst.contains(Symbol.EMPTY) && rhs.size() > 1){
					// Contains epsilon, check the second symbol.
					if(rhs.get(1) instanceof Term){
						// Second symbol is a terminal, add it.
						lhsFirst.add((Term) rhs.get(1));
					}
					else{
						// Second symbol is a non terminal, add it's first.
						// No need to check for epsilon, if it contains epsilon the possible third symbol is added in the next iteration.
						lhsFirst.addAll(first.get(rhs.get(1)));
					}
				}
			}
			// Save the first value
			first.put(lhs, lhsFirst);
		}
		
		// Return updated first
		return first;
	}
	
	
	/**
	 * Calculates the follow values for the given grammar.
	 */
	private void calcFollow(){
		// Create follow map, initialize it with empty values.
		HashMap<NonTerm, Set<Term>> curFollow = new HashMap<NonTerm, Set<Term>>();
		for(NonTerm nt : this.g.getNonterminals()){
			curFollow.put(nt, new HashSet<Term>());
		}
		// Initialize start symbol with EOF
		Set<Term> start = curFollow.get(this.g.getStart());
		start.add(Term.EOF);
		
		// While the follow set is changing
		int hash = -1;
		while(hash != curFollow.hashCode()){
			hash = curFollow.hashCode();
			// Re-calculate follow
			curFollow = recursiveFollow(curFollow, g);
		}
		
		// Follow didn't change after last iteration, save it.
		this.follow = curFollow;
	}
	
	/**
	 * Help method for calcFollow, executes the recursive part.
	 * @param curFollow The current state of follow.
	 * @param g The grammar used
	 * @return An updated version of curFollow
	 */
	private HashMap<NonTerm, Set<Term>> recursiveFollow(HashMap<NonTerm, Set<Term>>curFollow, Grammar g){
		// Loop through all grammar rules
		for(Rule r: g.getRules()){
			// Get the symbols of the right hand side
			List<Symbol> rhs = r.getRHS();
			// Loop through the symbols right to left
			for(int i = rhs.size()-1; i >= 0; i--){
				Symbol s = rhs.get(i);
				// Follow is only for non terminals
				if(s instanceof NonTerm){
					Set<Term> temp = curFollow.get(s);
					// Check if it's the last symbol of the rule
					if(i == rhs.size()-1){
						// Copy follow of the LHS
						temp.addAll(curFollow.get(r.getLHS()));
					}
					else{
						// Check if the symbol on the right is terminal
						if(rhs.get(i+1) instanceof Term){
							// Symbol on the right is terminal
							temp.add((Term) rhs.get(i+1));
						}
						else{
							// Symbol on the right is Non terminal, load it's First
							Set<Term> rightFirst = this.first.get(rhs.get(i+1));
							// Add first to the follow of the current symbol
							temp.addAll(rightFirst);
							// Check if it contains epsilon
							if(rightFirst.contains(Symbol.EMPTY)){
								temp.remove(Symbol.EMPTY);
								// Also copy the follow of this symbol without epsilon
								temp.addAll(curFollow.get(rhs.get(i+1)));
							}
						}
					}
					curFollow.put((NonTerm) s, temp);
				}
			}
		}
		return curFollow;
	}
	
	/**
	 * Calculates FIRST+ for the current grammar.
	 */
	private void calcFirstP(){
		// Result map
		HashMap<Rule, Set<Term>> curFirstP = new HashMap<Rule, Set<Term>>();
		// Loop through rules of the grammar
		for(Rule r: this.g.getRules()){
			// Add the empty set.
			HashSet<Term> temp = new HashSet<Term>();
			// Check the symbols on the right hand side until a non-epsilon symbol is found.
			for(Symbol s: r.getRHS()){
				if(s instanceof Term){
					// Symbol is terminal, add it.
					temp.add((Term) s);
					// If it's not epsilon stop.
					if(!(s == Symbol.EMPTY))
						break;
				}
				else{
					// Symbol is non terminal, load it's first value.
					Set<Term> symbolFirst = this.first.get(s);
					// Add first value to first of the LHS.
					temp.addAll(symbolFirst);
					// Check if it contains epsilon
					if(symbolFirst.contains(Symbol.EMPTY)){
						// Contains epsilon, add FOLLOW of the non terminal
						temp.addAll(this.follow.get(s));
					}
					break;
				}
			}
			
			// Check if first of this rule contains epsilon, if so add the follow of the LHS.
			if(temp.contains(Symbol.EMPTY)){
				temp.addAll(this.follow.get(r.getLHS()));
			}
			
			// Save current rule
			curFirstP.put(r, temp);
		}
		
		// Save FIRST+
		this.firstP = curFirstP;
	}
	
	
	// Queries
	@Override
	public Map<Symbol, Set<Term>> getFirst() {
		return this.first;
	}

	@Override
	public Map<NonTerm, Set<Term>> getFollow() {
		return this.follow;
	}

	@Override
	public Map<Rule, Set<Term>> getFirstp() {
		return this.firstP;
	}

	@Override
	public boolean isLL1() {
		boolean result = true;
		
		// Create map with LHS as key and a set of TERM's which are already found.
		HashMap<NonTerm, Set<Term>> check = new HashMap<NonTerm, Set<Term>>();
		for(NonTerm nt: this.g.getNonterminals()){
			check.put(nt, new HashSet<Term>());
		}
		
		// Loop through the FIRST+ of all rules
		for(Rule r: this.firstP.keySet()){
			// Get the Term's of the LHS
			Set<Term> val = this.firstP.get(r);
			Set<Term> lhsCheck = check.get(r.getLHS());
			
			// Check if any Term value was already in the FIRST+ of another rule with the same LHS
			boolean temp = false;
			for(Term t: lhsCheck){
				if(val.contains(t))
					temp = true;
			}
			
			// If it matched it's not LL(1)
			if(temp){
				// It's not LL(1), return false
				result = false;
				break;
			}
			else{
				// Add the FIRST+ and continue to the next rule.
				lhsCheck.addAll(val);
				check.put(r.getLHS(), lhsCheck);
			}
		}
		
		return result;
	}
}