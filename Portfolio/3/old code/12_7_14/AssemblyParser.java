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
		T__0=1, COMMA=2, NEWLINE=3, WS=4, INT=5, INSTRUCTION=6, REGISTER=7;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "','", "NEWLINE", "WS", "INT", "INSTRUCTION", "REGISTER"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"start", "expr"
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
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4); expr();
				setState(5); match(T__0);
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INSTRUCTION );
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
		public TerminalNode INSTRUCTION() { return getToken(AssemblyParser.INSTRUCTION, 0); }
		public TerminalNode REGISTER(int i) {
			return getToken(AssemblyParser.REGISTER, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(AssemblyParser.REGISTER); }
		public List<TerminalNode> COMMA() { return getTokens(AssemblyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AssemblyParser.COMMA, i);
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
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11); match(INSTRUCTION);
				{
				setState(12); match(REGISTER);
				setState(13); match(COMMA);
				setState(14); match(REGISTER);
				setState(15); match(COMMA);
				setState(16); match(REGISTER);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17); match(INSTRUCTION);
				{
				setState(18); match(REGISTER);
				setState(19); match(COMMA);
				setState(20); match(REGISTER);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21); match(INSTRUCTION);
				{
				setState(22); match(REGISTER);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23); match(INSTRUCTION);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\35\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\3\2\2\4\2\4\2\2\36\2\t\3\2\2\2\4\32"+
		"\3\2\2\2\6\7\5\4\3\2\7\b\7\3\2\2\b\n\3\2\2\2\t\6\3\2\2\2\n\13\3\2\2\2"+
		"\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\7\b\2\2\16\17\7\t\2\2\17\20"+
		"\7\4\2\2\20\21\7\t\2\2\21\22\7\4\2\2\22\33\7\t\2\2\23\24\7\b\2\2\24\25"+
		"\7\t\2\2\25\26\7\4\2\2\26\33\7\t\2\2\27\30\7\b\2\2\30\33\7\t\2\2\31\33"+
		"\7\b\2\2\32\r\3\2\2\2\32\23\3\2\2\2\32\27\3\2\2\2\32\31\3\2\2\2\33\5\3"+
		"\2\2\2\4\13\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}