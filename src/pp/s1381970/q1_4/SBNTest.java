package pp.s1381970.q1_4;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import pp.s1381970.q1_4.SBNAttrParser.NumberContext;

public class SBNTest {

	@Test
	public void test() {
		// In the attribute grammar the most significant bit is the rightmost
		testAttribute(0, "+0");
		testAttribute(10, "+0101");
		testAttribute(15, "+1111");
		testAttribute(-10, "-0101");
		testAttribute(-15, "-1111");
		// In the listener grammar the most significant bit is the leftmost, as it should be.
		testListener(0, "+0");
		testListener(10, "+1010");
		testListener(15, "+1111");
		testListener(-10, "-1010");
		testListener(-15, "-1111");
	}
	
	public void testAttribute(int expected, String in){
		assertEquals(expected, parseSBNAttr(in).val);
	}
	
	public void testListener(int expected, String in){
		ParseTree tree = parseSBN(in);
		SBN.init();
		walker.walk(SBN, tree);
		assertEquals(expected, SBN.val(tree));
	}
	
	private final ParseTreeWalker walker = new ParseTreeWalker();
	private final SBNListenerImp SBN = new SBNListenerImp();

	private ParseTree parseSBN(String text) {
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new SBNLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		SBNParser parser = new SBNParser(tokens);
		return parser.number();
	}

	private NumberContext parseSBNAttr(String text) {
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new SBNAttrLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		SBNAttrParser parser = new SBNAttrParser(tokens);
		return parser.number();
	}
}
