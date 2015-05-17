// Generated from TypeUse.g4 by ANTLR 4.4
package pp.s1381970.q1_5;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeUseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, WS=7;
	public static final String[] tokenNames = {
		"<INVALID>", "':='", "'('", "')'", "':'", "';'", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_series = 1, RULE_unit = 2, RULE_decl = 3, RULE_assign = 4;
	public static final String[] ruleNames = {
		"program", "series", "unit", "decl", "assign"
	};

	@Override
	public String getGrammarFileName() { return "TypeUse.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeUseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(T__3);
			setState(11); series();
			setState(12); match(T__2);
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

	public static class SeriesContext extends ParserRuleContext {
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).exitSeries(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_series);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==ID) {
				{
				{
				setState(14); unit();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class UnitContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unit);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22); match(T__3);
				setState(23); series();
				setState(24); match(T__2);
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

	public static class DeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TypeUseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TypeUseParser.ID, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(ID);
			setState(29); match(T__1);
			setState(30); match(ID);
			setState(31); match(T__0);
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TypeUseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TypeUseParser.ID, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeUseListener ) ((TypeUseListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(ID);
			setState(34); match(T__4);
			setState(35); match(ID);
			setState(36); match(T__0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2&\2\f\3\2\2\2\4\23\3\2\2\2\6\34\3\2"+
		"\2\2\b\36\3\2\2\2\n#\3\2\2\2\f\r\7\4\2\2\r\16\5\4\3\2\16\17\7\5\2\2\17"+
		"\3\3\2\2\2\20\22\5\6\4\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23"+
		"\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2\2\2\26\35\5\b\5\2\27\35\5\n\6\2\30"+
		"\31\7\4\2\2\31\32\5\4\3\2\32\33\7\5\2\2\33\35\3\2\2\2\34\26\3\2\2\2\34"+
		"\27\3\2\2\2\34\30\3\2\2\2\35\7\3\2\2\2\36\37\7\b\2\2\37 \7\6\2\2 !\7\b"+
		"\2\2!\"\7\7\2\2\"\t\3\2\2\2#$\7\b\2\2$%\7\3\2\2%&\7\b\2\2&\'\7\7\2\2\'"+
		"\13\3\2\2\2\4\23\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}