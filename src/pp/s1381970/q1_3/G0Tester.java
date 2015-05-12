package pp.s1381970.q1_3;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import pp.s1381970.LexerTester;

public class G0Tester{
	
	private static LexerTester tester = new LexerTester(G0Lexer.class);

	@Test
	public void testMatchingTrees() {
		String[] s = new String[2];
		s[0] = "a[i+1] + b.field";
		s[1] = "((Type) x).i - 10 + y";
		
		String[] trees = new String[2];
		trees[0] = "(e (e (f (g (g (a a)) [ (e (e (f (g (a i)))) + (f (g (a 1)))) ]))) + (f (g (g (a b)) . f i e l d)))";
		trees[1] = "(e (e (e (f (g (g (a ( (e (f (g (a ( (e (f (g (a T) y p e))) )) x))) ))) . i))) - (f (g (a 1) 0))) + (f (g (a y))))";
		
		for(int i = 0; i < 2; i++){
			tester.correct(s[i]);
			
			CharStream stream = new ANTLRInputStream(s[i]);
			Lexer lexer = new G0Lexer(stream);
			TokenStream tokens = new CommonTokenStream(lexer);
			G0Parser parser = new G0Parser(tokens);
			ParseTree tree = parser.e();
			
			System.out.println(tree.toStringTree(parser));
			assertEquals(tree.toStringTree(parser), trees[i]);
		}
	}
}