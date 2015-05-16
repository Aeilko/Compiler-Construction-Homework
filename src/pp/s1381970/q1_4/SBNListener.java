// Generated from SBN.g4 by ANTLR 4.4
package pp.s1381970.q1_4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SBNParser}.
 */
public interface SBNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code zero}
	 * labeled alternative in {@link SBNParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterZero(@NotNull SBNParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zero}
	 * labeled alternative in {@link SBNParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitZero(@NotNull SBNParser.ZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SBNParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull SBNParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SBNParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull SBNParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code min}
	 * labeled alternative in {@link SBNParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterMin(@NotNull SBNParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code min}
	 * labeled alternative in {@link SBNParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitMin(@NotNull SBNParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listBit}
	 * labeled alternative in {@link SBNParser#list}.
	 * @param ctx the parse tree
	 */
	void enterListBit(@NotNull SBNParser.ListBitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listBit}
	 * labeled alternative in {@link SBNParser#list}.
	 * @param ctx the parse tree
	 */
	void exitListBit(@NotNull SBNParser.ListBitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code one}
	 * labeled alternative in {@link SBNParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterOne(@NotNull SBNParser.OneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code one}
	 * labeled alternative in {@link SBNParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitOne(@NotNull SBNParser.OneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SBNParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull SBNParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SBNParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull SBNParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleBit}
	 * labeled alternative in {@link SBNParser#list}.
	 * @param ctx the parse tree
	 */
	void enterSingleBit(@NotNull SBNParser.SingleBitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleBit}
	 * labeled alternative in {@link SBNParser#list}.
	 * @param ctx the parse tree
	 */
	void exitSingleBit(@NotNull SBNParser.SingleBitContext ctx);
}