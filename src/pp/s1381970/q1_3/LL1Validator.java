package pp.s1381970.q1_3;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import org.junit.Test;

import pp.s1381970.Grammar;
import pp.s1381970.LLCalcImp;
import pp.s1381970.NonTerm;
import pp.s1381970.Rule;
import pp.s1381970.Symbol;
import pp.s1381970.Term;

public class LL1Validator {

	@Test
	public void testLL1(){
		// Non terminals
		NonTerm e = new NonTerm("E");
		NonTerm ep = new NonTerm("EP");
		NonTerm epp = new NonTerm("EPP");
		NonTerm f = new NonTerm("F");
		NonTerm fp = new NonTerm("FP");
		NonTerm fpp = new NonTerm("FPP");
		NonTerm g = new NonTerm("G");
		NonTerm gp = new NonTerm("GP");
		NonTerm a = new NonTerm("A");
		
		// Terminals
		Term ID = new Term("ID");
		Term NUM = new Term("NUM");
		Term BracketOpen = new Term("(");
		Term BracketClose = new Term(")");
		Term BlockOpen = new Term("[");
		Term BlockClose = new Term("]");
		Term Period = new Term(".");
		Term Plus = new Term("+");
		Term Min = new Term("-");
		
		// Create grammar
		Grammar g2 = new Grammar(e);
		g2.addRule(e, f, ep);
		g2.addRule(ep, Plus, f, ep);
		g2.addRule(ep, Min, f, ep);
		g2.addRule(ep, Symbol.EMPTY);
		g2.addRule(epp, gp, ep);
		g2.addRule(f, BracketOpen, fp);
		g2.addRule(f, g);
		g2.addRule(fp, ID, fpp);
		g2.addRule(fp, NUM, epp);
		g2.addRule(fp, BracketOpen, e, BracketClose, gp);
		g2.addRule(fpp, BracketClose, f);
		g2.addRule(fpp, epp, BracketClose, gp);
		g2.addRule(g, a, gp);
		g2.addRule(gp, BlockOpen, e, BlockClose, gp);
		g2.addRule(gp, Period, ID, gp);
		g2.addRule(gp, Symbol.EMPTY);
		g2.addRule(a, NUM);
		g2.addRule(a, ID);
		
		// Test for LL1
		LLCalcImp llcalc = new LLCalcImp(g2);
		Map<Rule, Set<Term>> firstp = llcalc.getFirstp();
		for(Rule r : firstp.keySet()){
			System.out.println(r + ":\t\t" + firstp.get(r));
			//System.out.println("\t" + firstp.get(r));
		}
		
		assertTrue(llcalc.isLL1());
	}
}