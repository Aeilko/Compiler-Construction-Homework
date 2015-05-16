// Generated from SBNAttr.g4 by ANTLR 4.4
package pp.s1381970.q1_4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SBNAttrParser}.
 */
public interface SBNAttrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SBNAttrParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull SBNAttrParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SBNAttrParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull SBNAttrParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SBNAttrParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull SBNAttrParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SBNAttrParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull SBNAttrParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SBNAttrParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull SBNAttrParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SBNAttrParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull SBNAttrParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SBNAttrParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(@NotNull SBNAttrParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SBNAttrParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(@NotNull SBNAttrParser.BitContext ctx);
}