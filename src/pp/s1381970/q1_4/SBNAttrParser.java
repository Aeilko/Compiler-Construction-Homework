// Generated from SBNAttr.g4 by ANTLR 4.4
package pp.s1381970.q1_4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SBNAttrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PLUS=2, MIN=3, ZERO=4, ONE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'+'", "'-'", "'0'", "'1'"
	};
	public static final int
		RULE_number = 0, RULE_sign = 1, RULE_list = 2, RULE_bit = 3;
	public static final String[] ruleNames = {
		"number", "sign", "list", "bit"
	};

	@Override
	public String getGrammarFileName() { return "SBNAttr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SBNAttrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumberContext extends ParserRuleContext {
		public int val;
		public SignContext s;
		public ListContext l;
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((NumberContext)_localctx).l.position=0; 
			setState(9); ((NumberContext)_localctx).s = sign();
			setState(10); ((NumberContext)_localctx).l = list();
			 ((NumberContext)_localctx).val = (((NumberContext)_localctx).s.negative ? ((NumberContext)_localctx).l.val*(-1) : ((NumberContext)_localctx).l.val); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public boolean negative;
		public TerminalNode MIN() { return getToken(SBNAttrParser.MIN, 0); }
		public TerminalNode PLUS() { return getToken(SBNAttrParser.PLUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sign);
		try {
			setState(17);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(13); match(PLUS);
				((SignContext)_localctx).negative =  false; 
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); match(MIN);
				((SignContext)_localctx).negative =  true; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public int val;
		public int position;
		public BitContext b;
		public ListContext l;
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((ListContext)_localctx).b.position = _localctx.position; ((ListContext)_localctx).l.position = _localctx.position+1; 
				setState(20); ((ListContext)_localctx).b = bit();
				setState(21); ((ListContext)_localctx).l = list();
				((ListContext)_localctx).val =  ((ListContext)_localctx).l.val + ((ListContext)_localctx).b.val; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((ListContext)_localctx).b.position = _localctx.position; 
				setState(25); ((ListContext)_localctx).b = bit();
				((ListContext)_localctx).val =  ((ListContext)_localctx).b.val; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitContext extends ParserRuleContext {
		public int val;
		public int position;
		public TerminalNode ZERO() { return getToken(SBNAttrParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(SBNAttrParser.ONE, 0); }
		public BitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).enterBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNAttrListener ) ((SBNAttrListener)listener).exitBit(this);
		}
	}

	public final BitContext bit() throws RecognitionException {
		BitContext _localctx = new BitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bit);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(ZERO);
				((BitContext)_localctx).val =  (int) Math.pow(2, _localctx.position); 
				}
				break;
			case ONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); match(ONE);
				((BitContext)_localctx).val =  0; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\24\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\5\5%\n\5\3"+
		"\5\2\2\6\2\4\6\b\2\2%\2\n\3\2\2\2\4\23\3\2\2\2\6\36\3\2\2\2\b$\3\2\2\2"+
		"\n\13\b\2\1\2\13\f\5\4\3\2\f\r\5\6\4\2\r\16\b\2\1\2\16\3\3\2\2\2\17\20"+
		"\7\4\2\2\20\24\b\3\1\2\21\22\7\5\2\2\22\24\b\3\1\2\23\17\3\2\2\2\23\21"+
		"\3\2\2\2\24\5\3\2\2\2\25\26\b\4\1\2\26\27\5\b\5\2\27\30\5\6\4\2\30\31"+
		"\b\4\1\2\31\37\3\2\2\2\32\33\b\4\1\2\33\34\5\b\5\2\34\35\b\4\1\2\35\37"+
		"\3\2\2\2\36\25\3\2\2\2\36\32\3\2\2\2\37\7\3\2\2\2 !\7\6\2\2!%\b\5\1\2"+
		"\"#\7\7\2\2#%\b\5\1\2$ \3\2\2\2$\"\3\2\2\2%\t\3\2\2\2\5\23\36$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}