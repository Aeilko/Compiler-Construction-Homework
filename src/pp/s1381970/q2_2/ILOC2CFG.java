package pp.s1381970.q2_2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

import pp.iloc.Assembler;
import pp.iloc.model.Instr;
import pp.iloc.model.Op;
import pp.iloc.model.OpCode;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

public class ILOC2CFG {
	/** The singleton instance of this class. */
	private static final ILOC2CFG instance = new ILOC2CFG();

	/** Returns the singleton instance of this class. */
	public static ILOC2CFG instance() {
		return instance;
	}

	/** Converts an ILOC file given as parameter and prints out the
	 * resulting CFG. 
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: filename");
		}
		try {
			Program prog = Assembler.instance().assemble(new File(args[0]));
			System.out.println(instance().convert(prog));
		} catch (FormatException | IOException exc) {
			exc.printStackTrace();
		}
	}

	/** Private constructor for the singleton instance. */
	private ILOC2CFG() {
		// empty by design
	}
	
	
	// My code
	public Graph convert(Program prog) {
		// Result
		Graph result = new Graph();
		
		// Help variables to identify basic blocks
		TreeMap<String, Node> nodes = new TreeMap<String, Node>();
		Node cur = null;
		
		// Map with edges which have to be created
		TreeMap<String, ArrayList<String>> edges = new TreeMap<String, ArrayList<String>>();
		
		// Create labels and link them.
		for(Instr line: prog.getInstr()){
			if(line.hasLabel()){
				// Line contains a label, so a new node is needed
				Node n = result.addNode(line.getLabel().toString());
				nodes.put(line.getLabel().toString(), n);
				// Create edges map
				edges.put(line.getLabel().toString(), new ArrayList<String>());
				
				// Don't create a link after you past a jump but didn't find a new label
				if(cur != null){
					// Add edge from previous node if it didn't pass a jump statement
					cur.addEdge(n);
				}
				cur = n;
			}
			Op cmd = line.iterator().next();
			if(cmd.getOpCode() == OpCode.jumpI){
				// Don't create a link after you past a jump but didn't find a new label
				if(cur != null){
					// Check if the to-node exists
					if(nodes.containsKey(cmd.getArgs().get(0).toString())){
						cur.addEdge(nodes.get(cmd.getArgs().get(0).toString()));
					}
					else{
						// The exit node doesn't exist (yet), make a note to add it later
						edges.get(cur.getId()).add(cmd.getArgs().get(0).toString());
					}
					cur = null;
				}
			}
			
			if(cmd.getOpCode() == OpCode.cbr){
				String l1 = cmd.getArgs().get(1).toString();
				String l2 = cmd.getArgs().get(2).toString();
				
				// Check if the to-node exists
				if(nodes.containsKey(l1)){
					cur.addEdge(nodes.get(l2));
				}
				else{
					// The exit node doesn't exist (yet), make a note to add it later
					edges.get(cur.getId()).add(l1);
				}
				
				// Check if the to-node exists
				if(nodes.containsKey(l1)){
					cur.addEdge(nodes.get(l2));
				}
				else{
					// The exit node doesn't exist (yet), make a note to add it later
					edges.get(cur.getId()).add(l2);
				}
				cur = null;
			}
		}
		
		// Add edges which couldn't be created in the first place
		for(String from: edges.keySet()){
			for(String to: edges.get(from)){
				nodes.get(from).addEdge(nodes.get(to));
			}
		}
		
		// Check which nodes are reachable from Node 1
		String start = prog.getInstr().get(0).getLabel().toString();
		TreeSet<String> reachable = new TreeSet<String>();
		reachable.add(start);
		reachable.addAll(checkNode(nodes.get(start), new ArrayList<String>()));
		
		// Create new nodes
		Graph updatedResult = new Graph();
		TreeMap<String, Node> updatedNodes = new TreeMap<String, Node>();
		for(String s: reachable){
			Node n = updatedResult.addNode(s);
			updatedNodes.put(s, n);
		}
		// Create new edges
		for(String s: updatedNodes.keySet()){
			for(Node to: nodes.get(s).getEdges()){
				if(updatedNodes.containsKey(to.getId()))
					updatedNodes.get(s).addEdge(to);
			}
		}
		
		return updatedResult;
	}
	
	// Recursive method
	private ArrayList<String> checkNode(Node n, ArrayList<String> visited){
		visited.add(n.getId());
		ArrayList<String> result = new ArrayList<String>();
		for(Node to: n.getEdges()){
			result.add(to.getId());
			if(!visited.contains(to.getId())){
				result.addAll(checkNode(to, visited));
			}
		}
		return result;
	}
}
