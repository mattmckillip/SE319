// Generated from Assembly.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENDINSTRUCION=1, COMMA=2, NEWLINE=3, WS=4, INT=5, RINSTRUCTION=6, TWOREGISTERIMM=7, 
		TWOREG=8, ONEREGIMM=9, SAVEDREGISTER=10, TEMPREGISTER=11, ZEROREGISTER=12, 
		FUNCTIONREGISTER=13, STACKPOINTER=14, RETURNADDRESS=15, RESULTREGISTERS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"ENDINSTRUCION", "COMMA", "NEWLINE", "WS", "INT", "RINSTRUCTION", "TWOREGISTERIMM", 
		"TWOREG", "ONEREGIMM", "SAVEDREGISTER", "TEMPREGISTER", "ZEROREGISTER", 
		"FUNCTIONREGISTER", "STACKPOINTER", "RETURNADDRESS", "RESULTREGISTERS"
	};


	public AssemblyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assembly.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		case 3: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\5\4)\n\4\3\4\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\5\3\5\3"+
		"\6\6\6\66\n\6\r\6\16\6\67\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00c3\n\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\4\5\2\13\f\17"+
		"\17\"\"\3\2\62;\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2\2\2\t.\3\2\2\2\13\65\3\2"+
		"\2\2\rM\3\2\2\2\17W\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25~\3\2\2\2\27\u009e"+
		"\3\2\2\2\31\u00a0\3\2\2\2\33\u00b2\3\2\2\2\35\u00b4\3\2\2\2\37\u00b8\3"+
		"\2\2\2!\u00c2\3\2\2\2#$\7=\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\')\7\17"+
		"\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\f\2\2+,\b\4\2\2,\b\3\2\2\2-/\t"+
		"\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\b\5\3\2\63\n\3\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28\f\3\2\2\29:\7C\2\2:;\7F\2\2;N\7F\2\2<=\7C\2\2"+
		"=>\7P\2\2>N\7F\2\2?@\7Q\2\2@N\7T\2\2AB\7U\2\2BC\7N\2\2CN\7V\2\2DE\7U\2"+
		"\2EF\7N\2\2FN\7N\2\2GH\7U\2\2HI\7T\2\2IN\7N\2\2JK\7Z\2\2KL\7Q\2\2LN\7"+
		"T\2\2M9\3\2\2\2M<\3\2\2\2M?\3\2\2\2MA\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3"+
		"\2\2\2N\16\3\2\2\2OP\7C\2\2PQ\7F\2\2QR\7F\2\2RX\7K\2\2ST\7U\2\2TU\7N\2"+
		"\2UV\7V\2\2VX\7K\2\2WO\3\2\2\2WS\3\2\2\2X\20\3\2\2\2YZ\7N\2\2Z^\7Y\2\2"+
		"[\\\7U\2\2\\^\7Y\2\2]Y\3\2\2\2][\3\2\2\2^\22\3\2\2\2_`\7N\2\2`a\7Y\2\2"+
		"ab\7K\2\2b\24\3\2\2\2cd\7&\2\2de\7u\2\2e\177\7\62\2\2fg\7&\2\2gh\7u\2"+
		"\2h\177\7\63\2\2ij\7&\2\2jk\7u\2\2k\177\7\64\2\2lm\7&\2\2mn\7u\2\2n\177"+
		"\7\65\2\2op\7&\2\2pq\7u\2\2q\177\7\66\2\2rs\7&\2\2st\7u\2\2t\177\7\67"+
		"\2\2uv\7&\2\2vw\7u\2\2w\177\78\2\2xy\7&\2\2yz\7u\2\2z\177\79\2\2{|\7&"+
		"\2\2|}\7u\2\2}\177\7:\2\2~c\3\2\2\2~f\3\2\2\2~i\3\2\2\2~l\3\2\2\2~o\3"+
		"\2\2\2~r\3\2\2\2~u\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\26\3\2\2\2\u0080\u0081"+
		"\7&\2\2\u0081\u0082\7v\2\2\u0082\u009f\7\62\2\2\u0083\u0084\7&\2\2\u0084"+
		"\u0085\7v\2\2\u0085\u009f\7\63\2\2\u0086\u0087\7&\2\2\u0087\u0088\7v\2"+
		"\2\u0088\u009f\7\64\2\2\u0089\u008a\7&\2\2\u008a\u008b\7v\2\2\u008b\u009f"+
		"\7\65\2\2\u008c\u008d\7&\2\2\u008d\u008e\7v\2\2\u008e\u009f\7\66\2\2\u008f"+
		"\u0090\7&\2\2\u0090\u0091\7v\2\2\u0091\u009f\7\67\2\2\u0092\u0093\7&\2"+
		"\2\u0093\u0094\7v\2\2\u0094\u009f\78\2\2\u0095\u0096\7&\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u009f\79\2\2\u0098\u0099\7&\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009f\7:\2\2\u009b\u009c\7&\2\2\u009c\u009d\7v\2\2\u009d\u009f\7;\2\2"+
		"\u009e\u0080\3\2\2\2\u009e\u0083\3\2\2\2\u009e\u0086\3\2\2\2\u009e\u0089"+
		"\3\2\2\2\u009e\u008c\3\2\2\2\u009e\u008f\3\2\2\2\u009e\u0092\3\2\2\2\u009e"+
		"\u0095\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009b\3\2\2\2\u009f\30\3\2\2"+
		"\2\u00a0\u00a1\7&\2\2\u00a1\u00a2\7|\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7q\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7\u00a8"+
		"\7c\2\2\u00a8\u00b3\7\62\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\u00b3\7\63\2\2\u00ac\u00ad\7&\2\2\u00ad\u00ae\7c\2\2\u00ae\u00b3\7\64"+
		"\2\2\u00af\u00b0\7&\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b3\7\65\2\2\u00b2"+
		"\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7&\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7"+
		"\7r\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7&\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7c\2\2\u00bb \3\2\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be\7x\2\2\u00be\u00c3"+
		"\7\62\2\2\u00bf\u00c0\7&\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c3\7\63\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\"\3\2\2\2\r\2(\60\67MW]~\u009e"+
		"\u00b2\u00c2\4\3\4\2\3\5\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}