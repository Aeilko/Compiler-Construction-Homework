package pp.s1381970.q1_5;

import java.io.FileReader;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pp.s1381970.q1_5.TypeUseParser.AssignContext;
import pp.s1381970.q1_5.TypeUseParser.DeclContext;
import pp.s1381970.q1_5.TypeUseParser.ProgramContext;
import pp.s1381970.q1_5.TypeUseParser.SeriesContext;

public class TypeChecker extends TypeUseBaseListener {
	
	private TypeUseSymbolTable table;
	private ArrayList<String> errors;
	
	@Override
	public void enterProgram(ProgramContext ctx) {
		this.table = new TypeUseSymbolTable();
		this.errors = new ArrayList<String>();
	}
	
	@Override
	public void exitProgram(ProgramContext ctx) {
		for(String s: this.errors){
			System.err.println(s);
		}
	}
	
	@Override
	public void enterSeries(SeriesContext ctx) {
		this.table.openScope();
	}
	
	@Override
	public void exitSeries(SeriesContext ctx) {
		this.table.closeScope();
	}
	
	@Override
	public void exitDecl(DeclContext ctx) {
		String id = ctx.ID().get(0).getText();
		String type = ctx.ID().get(1).getText();
		if(!this.table.add(id, type)){
			this.errors.add("Couldn't declare \"" + id + ": " + type + "\" on line: " + ctx.ID().get(0).getSymbol().getLine() + " at column: "+ ctx.ID().get(0).getSymbol().getCharPositionInLine());
		}
	}
	
	@Override
	public void exitAssign(AssignContext ctx) {
		String left = ctx.ID().get(0).getText();
		String right = ctx.ID().get(1).getText();
		if(!(this.table.contains(left) && this.table.contains(right) && this.table.getType(left).equals(this.table.getType(right)))){
			this.errors.add("Couldn't assign \"" + left + " := " + right + "\" on line: " + ctx.ID().get(0).getSymbol().getLine() + " at column: "+ ctx.ID().get(0).getSymbol().getCharPositionInLine());
		}
	}
	
	
	// Queries
	public ArrayList<String> getErrors(){
		return this.errors;
	}
	
	public static void main(String[] args){
		try{
			CharStream chars = new ANTLRInputStream(new FileReader("src/pp/s1381970/q1_5/typeuse-1.txt"));
			Lexer lexer = new TypeUseLexer(chars);
			TokenStream tokens = new CommonTokenStream(lexer);
			TypeUseParser parser = new TypeUseParser(tokens);
			ParseTreeWalker walker = new ParseTreeWalker();
			TypeChecker listener = new TypeChecker();
			ParseTree sentence1 = parser.program();
			walker.walk(listener, sentence1);
		}
		catch(Exception e){ e.printStackTrace(); }
	}
}