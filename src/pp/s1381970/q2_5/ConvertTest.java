package pp.s1381970.q2_5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import pp.iloc.Assembler;
import pp.iloc.Simulator;
import pp.iloc.eval.Machine;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

/**
 * An adapted copy of FibTest to test convert.iloc
 */
public class ConvertTest {
	private Assembler assembler = Assembler.instance();
	private final static String BASE_DIR = "src/pp/s1381970/q2_5/";

	@Test
	public void testConvert(){
		Program p = assemble(BASE_DIR + "convert");
		Machine vm = new Machine();
		Simulator sim = new Simulator(p, vm);
		run(sim, "12\n2", "Next digit: 0\r\nNext digit: 0\r\nNext digit: 1\r\nNext digit: 1\r\nLength: 4");
		run(sim, "123\n4", "Next digit: 3\r\nNext digit: 2\r\nNext digit: 3\r\nNext digit: 1\r\nLength: 4");
		run(sim, "128\n2", "Next digit: 0\r\nNext digit: 0\r\nNext digit: 0\r\nNext digit: 0\r\nNext digit: 0\r\nNext digit: 0\r\nNext digit: 0\r\nNext digit: 1\r\nLength: 8");

	}
	private void run(Simulator sim, String input, String output){		
		Machine vm = sim.getVM();
		vm.clear();
		sim.setIn(new ByteArrayInputStream((input).getBytes()));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		sim.setOut(out);
		sim.run();
		assertEquals(output.trim(), out.toString().trim());
	}
	
	private Program assemble(String filename) {
		File file = new File(filename + ".iloc");
		try {
			return this.assembler.assemble(file);
		} catch (FormatException | IOException e) {
			fail(e.getMessage());
			return null;
		}
	}
}