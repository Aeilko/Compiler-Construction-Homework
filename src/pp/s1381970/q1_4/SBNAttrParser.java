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
			setState(8); ((NumberContext)_localctx).s = sign();
			setState(9); ((NumberContext)_localctx).l = list(0);
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
			setState(16);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); match(PLUS);
				((SignContext)_localctx).negative =  false; 
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(14); match(MIN);
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
		public int pos;
		public int val;
		public BitContext b;
		public ListContext l;
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListContext(ParserRuleContext parent, int invokingState, int pos) {
			super(parent, invokingState);
			this.pos = pos;
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

	public final ListContext list(int pos) throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState(), pos);
		enterRule(_localctx, 4, RULE_list);
		try {
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); ((ListContext)_localctx).b = bit(_localctx.pos);
				setState(19); ((ListContext)_localctx).l = list(_localctx.pos+1);
				((ListContext)_localctx).val =  ((ListContext)_localctx).l.val + ((ListContext)_localctx).b.val; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); ((ListContext)_localctx).b = bit(_localctx.pos);
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
		public int pos;
		public int val;
		public TerminalNode ZERO() { return getToken(SBNAttrParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(SBNAttrParser.ONE, 0); }
		public BitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BitContext(ParserRuleContext parent, int invokingState, int pos) {
			super(parent, invokingState);
			this.pos = pos;
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

	public final BitContext bit(int pos) throws RecognitionException {
		BitContext _localctx = new BitContext(_ctx, getState(), pos);
		enterRule(_localctx, 6, RULE_bit);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); match(ZERO);
				((BitContext)_localctx).val =  0; 
				}
				break;
			case ONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); match(ONE);
				((BitContext)_localctx).val =  (int) Math.pow(2, _localctx.pos); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\23\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\5\5\"\n\5\3\5\2\2\6\2"+
		"\4\6\b\2\2\"\2\n\3\2\2\2\4\22\3\2\2\2\6\33\3\2\2\2\b!\3\2\2\2\n\13\5\4"+
		"\3\2\13\f\5\6\4\2\f\r\b\2\1\2\r\3\3\2\2\2\16\17\7\4\2\2\17\23\b\3\1\2"+
		"\20\21\7\5\2\2\21\23\b\3\1\2\22\16\3\2\2\2\22\20\3\2\2\2\23\5\3\2\2\2"+
		"\24\25\5\b\5\2\25\26\5\6\4\2\26\27\b\4\1\2\27\34\3\2\2\2\30\31\5\b\5\2"+
		"\31\32\b\4\1\2\32\34\3\2\2\2\33\24\3\2\2\2\33\30\3\2\2\2\34\7\3\2\2\2"+
		"\35\36\7\6\2\2\36\"\b\5\1\2\37 \7\7\2\2 \"\b\5\1\2!\35\3\2\2\2!\37\3\2"+
		"\2\2\"\t\3\2\2\2\5\22\33!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}