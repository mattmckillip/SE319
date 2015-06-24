// Generated from Assembly.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMA=2, NEWLINE=3, WS=4, INT=5, THREEREGINSTRCUTION=6, TWOREGISTERIMM=7, 
		TWOREG=8, ONEREGIMM=9, SAVEDREGISTER=10, TEMPREGISTER=11, ZEROREGISTER=12, 
		FUNCTIONREGISTER=13, STACKPOINTER=14, RETURNADDRESS=15, RESULTREGISTERS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "','", "NEWLINE", "WS", "INT", "THREEREGINSTRCUTION", 
		"TWOREGISTERIMM", "TWOREG", "'LWI'", "SAVEDREGISTER", "TEMPREGISTER", 
		"'$zero'", "FUNCTIONREGISTER", "'$sp'", "'$ra'", "RESULTREGISTERS"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_threeRegArg = 2, RULE_twoRegArg = 3, 
		RULE_twoRegImmArg = 4, RULE_oneRegImmArg = 5, RULE_register = 6;
	public static final String[] ruleNames = {
		"start", "expr", "threeRegArg", "twoRegArg", "twoRegImmArg", "oneRegImmArg", 
		"register"
	};

	@Override
	public String getGrammarFileName() { return "Assembly.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); expr();
				setState(15); match(T__0);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THREEREGINSTRCUTION) | (1L << TWOREGISTERIMM) | (1L << TWOREG) | (1L << ONEREGIMM))) != 0) );
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

	public static class ExprContext extends ParserRuleContext {
		public OneRegImmArgContext oneRegImmArg() {
			return getRuleContext(OneRegImmArgContext.class,0);
		}
		public TwoRegArgContext twoRegArg() {
			return getRuleContext(TwoRegArgContext.class,0);
		}
		public TwoRegImmArgContext twoRegImmArg() {
			return getRuleContext(TwoRegImmArgContext.class,0);
		}
		public ThreeRegArgContext threeRegArg() {
			return getRuleContext(ThreeRegArgContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(25);
			switch (_input.LA(1)) {
			case THREEREGINSTRCUTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); threeRegArg();
				}
				break;
			case TWOREG:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); twoRegArg();
				}
				break;
			case TWOREGISTERIMM:
				enterOuterAlt(_localctx, 3);
				{
				setState(23); twoRegImmArg();
				}
				break;
			case ONEREGIMM:
				enterOuterAlt(_localctx, 4);
				{
				setState(24); oneRegImmArg();
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

	public static class ThreeRegArgContext extends ParserRuleContext {
		public TerminalNode THREEREGINSTRCUTION() { return getToken(AssemblyParser.THREEREGINSTRCUTION, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(AssemblyParser.COMMA); }
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AssemblyParser.COMMA, i);
		}
		public ThreeRegArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threeRegArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterThreeRegArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitThreeRegArg(this);
		}
	}

	public final ThreeRegArgContext threeRegArg() throws RecognitionException {
		ThreeRegArgContext _localctx = new ThreeRegArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_threeRegArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(THREEREGINSTRCUTION);
			setState(28); register();
			setState(29); match(COMMA);
			setState(30); register();
			setState(31); match(COMMA);
			setState(32); register();
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

	public static class TwoRegArgContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public TerminalNode COMMA() { return getToken(AssemblyParser.COMMA, 0); }
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode TWOREG() { return getToken(AssemblyParser.TWOREG, 0); }
		public TwoRegArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoRegArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterTwoRegArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitTwoRegArg(this);
		}
	}

	public final TwoRegArgContext twoRegArg() throws RecognitionException {
		TwoRegArgContext _localctx = new TwoRegArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_twoRegArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(TWOREG);
			setState(35); register();
			setState(36); match(COMMA);
			setState(37); register();
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

	public static class TwoRegImmArgContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(AssemblyParser.COMMA); }
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode INT() { return getToken(AssemblyParser.INT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(AssemblyParser.COMMA, i);
		}
		public TerminalNode TWOREGISTERIMM() { return getToken(AssemblyParser.TWOREGISTERIMM, 0); }
		public TwoRegImmArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoRegImmArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterTwoRegImmArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitTwoRegImmArg(this);
		}
	}

	public final TwoRegImmArgContext twoRegImmArg() throws RecognitionException {
		TwoRegImmArgContext _localctx = new TwoRegImmArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_twoRegImmArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(TWOREGISTERIMM);
			setState(40); register();
			setState(41); match(COMMA);
			setState(42); register();
			setState(43); match(COMMA);
			setState(44); match(INT);
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

	public static class OneRegImmArgContext extends ParserRuleContext {
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TerminalNode ONEREGIMM() { return getToken(AssemblyParser.ONEREGIMM, 0); }
		public TerminalNode COMMA() { return getToken(AssemblyParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(AssemblyParser.INT, 0); }
		public OneRegImmArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneRegImmArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterOneRegImmArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitOneRegImmArg(this);
		}
	}

	public final OneRegImmArgContext oneRegImmArg() throws RecognitionException {
		OneRegImmArgContext _localctx = new OneRegImmArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_oneRegImmArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(ONEREGIMM);
			setState(47); register();
			setState(48); match(COMMA);
			setState(49); match(INT);
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

	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode SAVEDREGISTER() { return getToken(AssemblyParser.SAVEDREGISTER, 0); }
		public TerminalNode ZEROREGISTER() { return getToken(AssemblyParser.ZEROREGISTER, 0); }
		public TerminalNode FUNCTIONREGISTER() { return getToken(AssemblyParser.FUNCTIONREGISTER, 0); }
		public TerminalNode RETURNADDRESS() { return getToken(AssemblyParser.RETURNADDRESS, 0); }
		public TerminalNode RESULTREGISTERS() { return getToken(AssemblyParser.RESULTREGISTERS, 0); }
		public TerminalNode TEMPREGISTER() { return getToken(AssemblyParser.TEMPREGISTER, 0); }
		public TerminalNode STACKPOINTER() { return getToken(AssemblyParser.STACKPOINTER, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAVEDREGISTER) | (1L << TEMPREGISTER) | (1L << ZEROREGISTER) | (1L << FUNCTIONREGISTER) | (1L << STACKPOINTER) | (1L << RETURNADDRESS) | (1L << RESULTREGISTERS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\228\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\f\22\64\2\23\3\2\2\2\4\33\3\2\2\2\6"+
		"\35\3\2\2\2\b$\3\2\2\2\n)\3\2\2\2\f\60\3\2\2\2\16\65\3\2\2\2\20\21\5\4"+
		"\3\2\21\22\7\3\2\2\22\24\3\2\2\2\23\20\3\2\2\2\24\25\3\2\2\2\25\23\3\2"+
		"\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\34\5\6\4\2\30\34\5\b\5\2\31\34\5\n"+
		"\6\2\32\34\5\f\7\2\33\27\3\2\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2"+
		"\2\2\34\5\3\2\2\2\35\36\7\b\2\2\36\37\5\16\b\2\37 \7\4\2\2 !\5\16\b\2"+
		"!\"\7\4\2\2\"#\5\16\b\2#\7\3\2\2\2$%\7\n\2\2%&\5\16\b\2&\'\7\4\2\2\'("+
		"\5\16\b\2(\t\3\2\2\2)*\7\t\2\2*+\5\16\b\2+,\7\4\2\2,-\5\16\b\2-.\7\4\2"+
		"\2./\7\7\2\2/\13\3\2\2\2\60\61\7\13\2\2\61\62\5\16\b\2\62\63\7\4\2\2\63"+
		"\64\7\7\2\2\64\r\3\2\2\2\65\66\t\2\2\2\66\17\3\2\2\2\4\25\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}