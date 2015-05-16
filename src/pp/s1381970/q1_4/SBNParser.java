// Generated from SBN.g4 by ANTLR 4.4
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
public class SBNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MIN=2, ZERO=3, ONE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'0'", "'1'"
	};
	public static final int
		RULE_number = 0, RULE_sign = 1, RULE_list = 2, RULE_bit = 3;
	public static final String[] ruleNames = {
		"number", "sign", "list", "bit"
	};

	@Override
	public String getGrammarFileName() { return "SBN.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SBNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumberContext extends ParserRuleContext {
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
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); sign();
			setState(9); list(0);
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
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	 
		public SignContext() { }
		public void copyFrom(SignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinContext extends SignContext {
		public TerminalNode MIN() { return getToken(SBNParser.MIN, 0); }
		public MinContext(SignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitMin(this);
		}
	}
	public static class PlusContext extends SignContext {
		public TerminalNode PLUS() { return getToken(SBNParser.PLUS, 0); }
		public PlusContext(SignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitPlus(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sign);
		try {
			setState(13);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11); match(PLUS);
				}
				break;
			case MIN:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12); match(MIN);
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
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListBitContext extends ListContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListBitContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterListBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitListBit(this);
		}
	}
	public static class SingleBitContext extends ListContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public SingleBitContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterSingleBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitSingleBit(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		return list(0);
	}

	private ListContext list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListContext _localctx = new ListContext(_ctx, _parentState);
		ListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleBitContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(16); bit();
			}
			_ctx.stop = _input.LT(-1);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListBitContext(new ListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(18);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(19); bit();
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitContext extends ParserRuleContext {
		public BitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit; }
	 
		public BitContext() { }
		public void copyFrom(BitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZeroContext extends BitContext {
		public TerminalNode ZERO() { return getToken(SBNParser.ZERO, 0); }
		public ZeroContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitZero(this);
		}
	}
	public static class OneContext extends BitContext {
		public TerminalNode ONE() { return getToken(SBNParser.ONE, 0); }
		public OneContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SBNListener ) ((SBNListener)listener).exitOne(this);
		}
	}

	public final BitContext bit() throws RecognitionException {
		BitContext _localctx = new BitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bit);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case ZERO:
				_localctx = new ZeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25); match(ZERO);
				}
				break;
			case ONE:
				_localctx = new OneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(ONE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\5\3\20\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\27\n\4\f\4\16\4\32\13\4\3\5\3\5\5\5\36\n\5\3\5\2\3\6\6\2\4\6\b\2"+
		"\2\36\2\n\3\2\2\2\4\17\3\2\2\2\6\21\3\2\2\2\b\35\3\2\2\2\n\13\5\4\3\2"+
		"\13\f\5\6\4\2\f\3\3\2\2\2\r\20\7\3\2\2\16\20\7\4\2\2\17\r\3\2\2\2\17\16"+
		"\3\2\2\2\20\5\3\2\2\2\21\22\b\4\1\2\22\23\5\b\5\2\23\30\3\2\2\2\24\25"+
		"\f\4\2\2\25\27\5\b\5\2\26\24\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\7\3\2\2\2\32\30\3\2\2\2\33\36\7\5\2\2\34\36\7\6\2\2\35\33"+
		"\3\2\2\2\35\34\3\2\2\2\36\t\3\2\2\2\5\17\30\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}