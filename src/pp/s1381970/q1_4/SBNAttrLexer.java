// Generated from SBNAttr.g4 by ANTLR 4.4
package pp.s1381970.q1_4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SBNAttrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PLUS=2, MIN=3, ZERO=4, ONE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'"
	};
	public static final String[] ruleNames = {
		"WS", "PLUS", "MIN", "ZERO", "ONE"
	};


	public SBNAttrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SBNAttr.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7\34\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\3\5\2\13"+
		"\f\17\17\"\"\34\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\3\16\3\2\2\2\5\24\3\2\2\2\7\26\3\2\2\2\t\30\3\2\2\2\13\32\3\2\2"+
		"\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2"+
		"\21\22\3\2\2\2\22\23\b\2\2\2\23\4\3\2\2\2\24\25\7-\2\2\25\6\3\2\2\2\26"+
		"\27\7/\2\2\27\b\3\2\2\2\30\31\7\62\2\2\31\n\3\2\2\2\32\33\7\63\2\2\33"+
		"\f\3\2\2\2\4\2\20\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}