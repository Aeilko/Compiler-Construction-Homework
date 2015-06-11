package pp.s1381970.q2_3;

import static org.junit.Assert.*;

import org.junit.Test;

import pp.iloc.Simulator;

public class CalcTest {
	
	private CalcCompiler cc;
	private Simulator sim;
	
	@Test
	public void test() {
		run("1+-3*4", -11);
		run("5*2+3+-6*5", -17);
		run("1+1+-2+1", 1);
		run("5*5+-9+2", 18);
	}
	
	public void run(String input, int output){
		cc = new CalcCompiler();
		sim = new Simulator(cc.compile(input));
		System.out.println(sim.getProgram().prettyPrint());
		sim.run();
		assertEquals(output, sim.getVM().getReg("r_1"));
	}
}