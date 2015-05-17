package pp.s1381970.q1_4;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import pp.s1381970.q1_4.SBNParser.ListBitContext;
import pp.s1381970.q1_4.SBNParser.MinContext;
import pp.s1381970.q1_4.SBNParser.NumberContext;
import pp.s1381970.q1_4.SBNParser.OneContext;
import pp.s1381970.q1_4.SBNParser.PlusContext;
import pp.s1381970.q1_4.SBNParser.SingleBitContext;
import pp.s1381970.q1_4.SBNParser.ZeroContext;

public class SBNListenerImp extends SBNBaseListener {
	private ParseTreeProperty<Integer> val;
	private ParseTreeProperty<Integer> position;
	private boolean negative;
	
	public void init(){
		this.val = new ParseTreeProperty<Integer>();
		this.position = new ParseTreeProperty<Integer>();
		this.negative = false;
	}
	
	@Override
	public void enterNumber(NumberContext ctx) {
		this.position.put(ctx.list(), 0);
	}
	
	@Override
	public void exitNumber(NumberContext ctx) {
		this.val.put(ctx, (negative ? (-1)*val(ctx.list()) : val(ctx.list())));
	}
	
	@Override
	public void exitMin(MinContext ctx) {
		this.negative = true;
	}
	
	@Override
	public void exitPlus(PlusContext ctx) {
		this.negative = false;
	}
	
	@Override
	public void enterListBit(ListBitContext ctx) {
		this.position.put(ctx.list(), position(ctx)+1);
		this.position.put(ctx.bit(), position(ctx));
	}
	
	@Override
	public void exitListBit(ListBitContext ctx) {
		this.val.put(ctx, val(ctx.list()) + val(ctx.bit()));
	}
	
	@Override
	public void enterSingleBit(SingleBitContext ctx) {
		this.position.put(ctx.bit(), position(ctx));
	}
	
	@Override
	public void exitSingleBit(SingleBitContext ctx) {
		this.val.put(ctx, val(ctx.bit()));
	}
	
	@Override
	public void exitZero(ZeroContext ctx) {
		this.val.put(ctx, 0);
	}
	
	@Override
	public void exitOne(OneContext ctx) {
		this.val.put(ctx, (int) Math.pow(2, position(ctx)));
	}
	
	
	// Queries
	public int val(ParseTree tree){
		return this.val.get(tree);
	}
	
	public int position(ParseTree tree){
		return this.position.get(tree);
	}
}