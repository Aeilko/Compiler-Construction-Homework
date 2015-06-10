package pp.homework.q2_2;

import java.io.File;
import java.io.IOException;
import pp.iloc.Assembler;
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

	public Graph convert(Program prog) {
		// TODO: Fill in
		throw new UnsupportedOperationException();
	}
}
