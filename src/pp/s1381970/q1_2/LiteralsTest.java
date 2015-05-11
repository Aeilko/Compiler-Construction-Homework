package pp.s1381970.q1_2;

import org.junit.Test;

public class LiteralsTest {

	private static LexerTester tester = new LexerTester(Literals.class);
	
	@Test
	public void testIntegers(){
		tester.yields("0", Literals.INT_DECIMAL);
		tester.yields("0b0", Literals.INT_BINARY);
		tester.yields("0x0", Literals.INT_HEXA);
		tester.yields("00", Literals.INT_OCTAL);
		tester.yields("2971", Literals.INT_DECIMAL);
		tester.yields("0b10100110", Literals.INT_BINARY);
		tester.yields("0xA5E631", Literals.INT_HEXA);
		tester.yields("012675", Literals.INT_OCTAL);
	}
	
	@Test
	public void testLongs(){
		tester.yields("0L", Literals.LONG_DECIMAL);
		tester.yields("0b0L", Literals.LONG_BINARY);
		tester.yields("0x0L", Literals.LONG_HEXA);
		tester.yields("00L", Literals.LONG_OCTAL);
		tester.yields("2971l", Literals.LONG_DECIMAL);
		tester.yields("0b10100110l", Literals.LONG_BINARY);
		tester.yields("0xA5E631l", Literals.LONG_HEXA);
		tester.yields("012675l", Literals.LONG_OCTAL);
	}
}