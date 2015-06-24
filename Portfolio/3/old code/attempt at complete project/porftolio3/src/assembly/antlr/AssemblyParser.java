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
		ENDINSTRUCION=1, COMMA=2, NEWLINE=3, WS=4, INT=5, RINSTRUCTION=6, TWOREGISTERIMM=7, 
		TWOREG=8, ONEREGIMM=9, SAVEDREGISTER=10, TEMPREGISTER=11, ZEROREGISTER=12, 
		FUNCTIONREGISTER=13, STACKPOINTER=14, RETURNADDRESS=15, RESULTREGISTERS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "','", "NEWLINE", "WS", "INT", "RINSTRUCTION", "TWOREGISTERIMM", 
		"TWOREG", "'LWI'", "SAVEDREGISTER", "TEMPREGISTER", "'$zero'", "FUNCTIONREGISTER", 
		"'$sp'", "'$ra'", "RESULTREGISTERS"
	};
	public static final int
		RULE_start = 0, RULE_instruction = 1, RULE_rtype = 2, RULE_itype = 3, 
		RULE_register = 4, RULE_immediate = 5;
	public static final String[] ruleNames = {
		"start", "instruction", "rtype", "itype", "register", "immediate"
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
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); instruction();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RINSTRUCTION) | (1L << TWOREGISTERIMM) | (1L << TWOREG) | (1L << ONEREGIMM))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public RtypeContext rtype() {
			return getRuleContext(RtypeContext.class,0);
		}
		public TerminalNode ENDINSTRUCION() { return getToken(AssemblyParser.ENDINSTRUCION, 0); }
		public ItypeContext itype() {
			return getRuleContext(ItypeContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(23);
			switch (_input.LA(1)) {
			case RINSTRUCTION:
			case TWOREG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(17); rtype();
				setState(18); match(ENDINSTRUCION);
				}
				}
				break;
			case TWOREGISTERIMM:
			case ONEREGIMM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(20); itype();
				setState(21); match(ENDINSTRUCION);
				}
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

	public static class RtypeContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(AssemblyParser.COMMA); }
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode TWOREG() { return getToken(AssemblyParser.TWOREG, 0); }
		public TerminalNode RINSTRUCTION() { return getToken(AssemblyParser.RINSTRUCTION, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(AssemblyParser.COMMA, i);
		}
		public RtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterRtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitRtype(this);
		}
	}

	public final RtypeContext rtype() throws RecognitionException {
		RtypeContext _localctx = new RtypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rtype);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case RINSTRUCTION:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(25); match(RINSTRUCTION);
				setState(26); register();
				setState(27); match(COMMA);
				setState(28); register();
				setState(29); match(COMMA);
				setState(30); register();
				}
				}
				break;
			case TWOREG:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(32); match(TWOREG);
				setState(33); register();
				setState(34); match(COMMA);
				setState(35); register();
				}
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

	public static class ItypeContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public TerminalNode ONEREGIMM() { return getToken(AssemblyParser.ONEREGIMM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AssemblyParser.COMMA); }
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AssemblyParser.COMMA, i);
		}
		public TerminalNode TWOREGISTERIMM() { return getToken(AssemblyParser.TWOREGISTERIMM, 0); }
		public ItypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterItype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitItype(this);
		}
	}

	public final ItypeContext itype() throws RecognitionException {
		ItypeContext _localctx = new ItypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_itype);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case TWOREGISTERIMM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(39); match(TWOREGISTERIMM);
				setState(40); register();
				setState(41); match(COMMA);
				setState(42); register();
				setState(43); match(COMMA);
				setState(44); immediate();
				}
				}
				break;
			case ONEREGIMM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(46); match(ONEREGIMM);
				setState(47); register();
				setState(48); match(COMMA);
				setState(49); immediate();
				}
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
		enterRule(_localctx, 8, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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

	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AssemblyParser.INT, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitImmediate(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\f\229\2\17\3\2\2\2"+
		"\4\31\3\2\2\2\6\'\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16\20\5"+
		"\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3"+
		"\2\2\2\23\24\5\6\4\2\24\25\7\3\2\2\25\32\3\2\2\2\26\27\5\b\5\2\27\30\7"+
		"\3\2\2\30\32\3\2\2\2\31\23\3\2\2\2\31\26\3\2\2\2\32\5\3\2\2\2\33\34\7"+
		"\b\2\2\34\35\5\n\6\2\35\36\7\4\2\2\36\37\5\n\6\2\37 \7\4\2\2 !\5\n\6\2"+
		"!(\3\2\2\2\"#\7\n\2\2#$\5\n\6\2$%\7\4\2\2%&\5\n\6\2&(\3\2\2\2\'\33\3\2"+
		"\2\2\'\"\3\2\2\2(\7\3\2\2\2)*\7\t\2\2*+\5\n\6\2+,\7\4\2\2,-\5\n\6\2-."+
		"\7\4\2\2./\5\f\7\2/\66\3\2\2\2\60\61\7\13\2\2\61\62\5\n\6\2\62\63\7\4"+
		"\2\2\63\64\5\f\7\2\64\66\3\2\2\2\65)\3\2\2\2\65\60\3\2\2\2\66\t\3\2\2"+
		"\2\678\t\2\2\28\13\3\2\2\29:\7\7\2\2:\r\3\2\2\2\6\21\31\'\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}