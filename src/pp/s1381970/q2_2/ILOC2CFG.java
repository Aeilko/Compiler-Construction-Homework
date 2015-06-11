package pp.s1381970.q2_2;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

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
		else{
			try {
				Program prog = Assembler.instance().assemble(new File(args[0]));
				System.out.println(instance().convert(prog));
			}
			catch (FormatException | IOException exc) { exc.printStackTrace(); }
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
		
		// Create all labels
		for(Instr line: prog.getInstr()){
			if(line.hasLabel())
				nodes.put(line.getLabel().toString(), result.addNode(line.getLabel().toString()));
		}
		
		// Add links between labels
		for(Instr line: prog.getInstr()){
			if(line.hasLabel()){
				Node n = nodes.get(line.getLabel().toString());
				// Check for unreachable code
				if(cur != null){
					cur.addEdge(n);
				}
				cur = n;
			}
			
			Op cmd = line.iterator().next();
			if(cmd.getOpCode() == OpCode.jumpI){
				// Check for unreachable code
				if(cur != null){
					cur.addEdge(nodes.get(cmd.getArgs().get(0).toString()));
					cur = null;
				}
			}
			
			if(cmd.getOpCode() == OpCode.cbr){
				String l1 = cmd.getArgs().get(1).toString();
				String l2 = cmd.getArgs().get(2).toString();
				cur.addEdge(nodes.get(l1));
				cur.addEdge(nodes.get(l2));
				cur = null;
			}
		}
		return result;
	}
}
