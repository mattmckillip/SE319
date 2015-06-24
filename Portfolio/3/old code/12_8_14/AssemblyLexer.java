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
		T__0=1, COMMA=2, NEWLINE=3, WS=4, INT=5, THREEREGINSTRCUTION=6, TWOREGISTERIMM=7, 
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
		"T__0", "COMMA", "NEWLINE", "WS", "INT", "THREEREGINSTRCUTION", "TWOREGISTERIMM", 
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
		case 3: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\5\4)\n\4\3\4\3\4\3\5\6\5.\n\5\r\5\16\5/\3\5\3\5\3\6\6\6"+
		"\65\n\6\r\6\16\6\66\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bW\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0083\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a3"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00b7\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\2\2\22\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3"+
		"\2\4\5\2\13\f\17\17\"\"\3\2\62;\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2\2\2\t-\3\2"+
		"\2\2\13\64\3\2\2\2\rL\3\2\2\2\17V\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25\u0082"+
		"\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2\33\u00b6\3\2\2\2\35\u00b8\3"+
		"\2\2\2\37\u00bc\3\2\2\2!\u00c6\3\2\2\2#$\7=\2\2$\4\3\2\2\2%&\7.\2\2&\6"+
		"\3\2\2\2\')\7\17\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\f\2\2+\b\3\2\2"+
		"\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\b\5\2\2\62\n\3\2\2\2\63\65\t\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\f\3\2\2\289\7C\2\29:\7F\2\2:M\7F\2\2;<\7"+
		"C\2\2<=\7P\2\2=M\7F\2\2>?\7Q\2\2?M\7T\2\2@A\7U\2\2AB\7N\2\2BM\7V\2\2C"+
		"D\7U\2\2DE\7N\2\2EM\7N\2\2FG\7U\2\2GH\7T\2\2HM\7N\2\2IJ\7Z\2\2JK\7Q\2"+
		"\2KM\7T\2\2L8\3\2\2\2L;\3\2\2\2L>\3\2\2\2L@\3\2\2\2LC\3\2\2\2LF\3\2\2"+
		"\2LI\3\2\2\2M\16\3\2\2\2NO\7C\2\2OP\7F\2\2PQ\7F\2\2QW\7K\2\2RS\7U\2\2"+
		"ST\7N\2\2TU\7V\2\2UW\7K\2\2VN\3\2\2\2VR\3\2\2\2W\20\3\2\2\2XY\7N\2\2Y"+
		"b\7Y\2\2Z[\7U\2\2[b\7Y\2\2\\]\7R\2\2]^\7T\2\2^_\7K\2\2_`\7P\2\2`b\7V\2"+
		"\2aX\3\2\2\2aZ\3\2\2\2a\\\3\2\2\2b\22\3\2\2\2cd\7N\2\2de\7Y\2\2ef\7K\2"+
		"\2f\24\3\2\2\2gh\7&\2\2hi\7u\2\2i\u0083\7\62\2\2jk\7&\2\2kl\7u\2\2l\u0083"+
		"\7\63\2\2mn\7&\2\2no\7u\2\2o\u0083\7\64\2\2pq\7&\2\2qr\7u\2\2r\u0083\7"+
		"\65\2\2st\7&\2\2tu\7u\2\2u\u0083\7\66\2\2vw\7&\2\2wx\7u\2\2x\u0083\7\67"+
		"\2\2yz\7&\2\2z{\7u\2\2{\u0083\78\2\2|}\7&\2\2}~\7u\2\2~\u0083\79\2\2\177"+
		"\u0080\7&\2\2\u0080\u0081\7u\2\2\u0081\u0083\7:\2\2\u0082g\3\2\2\2\u0082"+
		"j\3\2\2\2\u0082m\3\2\2\2\u0082p\3\2\2\2\u0082s\3\2\2\2\u0082v\3\2\2\2"+
		"\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\26\3\2\2\2\u0084"+
		"\u0085\7&\2\2\u0085\u0086\7v\2\2\u0086\u00a3\7\62\2\2\u0087\u0088\7&\2"+
		"\2\u0088\u0089\7v\2\2\u0089\u00a3\7\63\2\2\u008a\u008b\7&\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u00a3\7\64\2\2\u008d\u008e\7&\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u00a3\7\65\2\2\u0090\u0091\7&\2\2\u0091\u0092\7v\2\2\u0092\u00a3\7\66"+
		"\2\2\u0093\u0094\7&\2\2\u0094\u0095\7v\2\2\u0095\u00a3\7\67\2\2\u0096"+
		"\u0097\7&\2\2\u0097\u0098\7v\2\2\u0098\u00a3\78\2\2\u0099\u009a\7&\2\2"+
		"\u009a\u009b\7v\2\2\u009b\u00a3\79\2\2\u009c\u009d\7&\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u00a3\7:\2\2\u009f\u00a0\7&\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a3\7;\2\2\u00a2\u0084\3\2\2\2\u00a2\u0087\3\2\2\2\u00a2\u008a\3\2"+
		"\2\2\u00a2\u008d\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2"+
		"\u0096\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7&\2\2\u00a5\u00a6\7|\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7q\2\2\u00a9\32\3\2\2\2\u00aa\u00ab"+
		"\7&\2\2\u00ab\u00ac\7c\2\2\u00ac\u00b7\7\62\2\2\u00ad\u00ae\7&\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b7\7\63\2\2\u00b0\u00b1\7&\2\2\u00b1\u00b2\7c\2"+
		"\2\u00b2\u00b7\7\64\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b7"+
		"\7\65\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b0\3\2\2\2"+
		"\u00b6\u00b3\3\2\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7&\2\2\u00b9\u00ba\7"+
		"u\2\2\u00ba\u00bb\7r\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7c\2\2\u00bf \3\2\2\2\u00c0\u00c1\7&\2\2\u00c1\u00c2"+
		"\7x\2\2\u00c2\u00c7\7\62\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\7x\2\2\u00c5"+
		"\u00c7\7\63\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\"\3\2\2"+
		"\2\r\2(/\66LVa\u0082\u00a2\u00b6\u00c6\3\3\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}