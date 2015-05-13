package pp.s1381970.q1_3;

import static org.junit.Assert.*;

import org.junit.Test;

import pp.s1381970.Grammar;
import pp.s1381970.LLCalcImp;
import pp.s1381970.NonTerm;

public class LL1Validator {

	@Test
	public void testLL1(){
		NonTerm e = new NonTerm("E");
		
		Grammar g = new Grammar(e);
		LLCalcImp llcalc = new LLCalcImp(g);
		fail("Not yet implemented");
	}
}