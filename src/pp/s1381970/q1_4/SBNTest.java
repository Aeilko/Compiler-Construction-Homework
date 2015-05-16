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
		test(0, "+0");
		test(10, "+0101");
		test(15, "+1111");
		test(-10, "-0101");
		test(-15, "-1111");
	}
	
	public void test(int expected, String in){
		assertEquals(expected, parseSBNAttr(in).val);
	}
	
	/*private final ParseTreeWalker walker = new ParseTreeWalker();
	private final TGrammarListenerImp tGram = new TGrammarListenerImp();

	private ParseTree parseTGrammar(String text) {
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new TGrammarLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		TGrammarParser parser = new TGrammarParser(tokens);
		return parser.t();
	}*/

	private NumberContext parseSBNAttr(String text) {
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new SBNAttrLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		SBNAttrParser parser = new SBNAttrParser(tokens);
		return parser.number();
	}
}
