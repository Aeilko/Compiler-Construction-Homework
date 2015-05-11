// Generated from Literals.g4 by ANTLR 4.4
package pp.s1381970.q1_2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Literals extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_BINARY=1, INT_OCTAL=2, INT_DECIMAL=3, INT_HEXA=4, LONG_BINARY=5, LONG_OCTAL=6, 
		LONG_DECIMAL=7, LONG_HEXA=8, LONG=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"INT_BINARY", "INT_OCTAL", "INT_DECIMAL", "INT_HEXA", "LONG_BINARY", "LONG_OCTAL", 
		"LONG_DECIMAL", "LONG_HEXA", "LONG"
	};


	public Literals(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Literals.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\5\2 \n\2\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\5\3+\n\3\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4"+
		"\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\5\5B\n\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\2\2\13\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\13\4\2DDdd\3\2\62\63\3\2\639\3\2"+
		"\629\3\2\63;\3\2\62;\4\2\63;CH\4\2\62;CH\4\2NNnnX\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5!\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2"+
		"\2\13C\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21L\3\2\2\2\23O\3\2\2\2\25\26\7"+
		"\62\2\2\26\37\t\2\2\2\27 \7\62\2\2\30\34\7\63\2\2\31\33\t\3\2\2\32\31"+
		"\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34\3"+
		"\2\2\2\37\27\3\2\2\2\37\30\3\2\2\2 \4\3\2\2\2!*\7\62\2\2\"+\7\62\2\2#"+
		"\'\t\4\2\2$&\t\5\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2*\"\3\2\2\2*#\3\2\2\2+\6\3\2\2\2,\65\7\62\2\2-\61\t\6\2\2"+
		".\60\t\7\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\64,\3\2\2\2\64-\3\2\2\2\65\b\3\2\2\2\66\67\7\62\2"+
		"\2\678\7z\2\28A\3\2\2\29B\7\62\2\2:>\t\b\2\2;=\t\t\2\2<;\3\2\2\2=@\3\2"+
		"\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A9\3\2\2\2A:\3\2\2\2B\n\3"+
		"\2\2\2CD\5\3\2\2DE\5\23\n\2E\f\3\2\2\2FG\5\5\3\2GH\5\23\n\2H\16\3\2\2"+
		"\2IJ\5\7\4\2JK\5\23\n\2K\20\3\2\2\2LM\5\t\5\2MN\5\23\n\2N\22\3\2\2\2O"+
		"P\t\n\2\2P\24\3\2\2\2\13\2\34\37\'*\61\64>A\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}