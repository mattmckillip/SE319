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
		T__0=1, COMMA=2, NEWLINE=3, WS=4, INT=5, INSTRUCTION=6, REGISTER=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"T__0", "COMMA", "NEWLINE", "WS", "INT", "INSTRUCTION", "REGISTER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tZ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\5\4"+
		"\27\n\4\3\4\3\4\3\5\6\5\34\n\5\r\5\16\5\35\3\5\3\5\3\6\6\6#\n\6\r\6\16"+
		"\6$\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"Y\n\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\5\2\13\f\17\17\"\"\3\2"+
		"\62;k\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\26\3\2\2\2\t\33\3\2"+
		"\2\2\13\"\3\2\2\2\rN\3\2\2\2\17X\3\2\2\2\21\22\7=\2\2\22\4\3\2\2\2\23"+
		"\24\7.\2\2\24\6\3\2\2\2\25\27\7\17\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\7\f\2\2\31\b\3\2\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \b\5\2\2 \n\3"+
		"\2\2\2!#\t\3\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\f\3\2\2\2"+
		"&\'\7C\2\2\'(\7F\2\2(O\7F\2\2)*\7C\2\2*+\7F\2\2+,\7F\2\2,O\7K\2\2-.\7"+
		"C\2\2./\7P\2\2/O\7F\2\2\60\61\7Q\2\2\61O\7T\2\2\62\63\7U\2\2\63\64\7N"+
		"\2\2\64O\7V\2\2\65\66\7U\2\2\66\67\7N\2\2\678\7V\2\28O\7K\2\29:\7U\2\2"+
		":;\7N\2\2;O\7N\2\2<=\7U\2\2=>\7T\2\2>O\7N\2\2?@\7Z\2\2@A\7Q\2\2AO\7T\2"+
		"\2BC\7N\2\2CO\7Y\2\2DE\7N\2\2EF\7Y\2\2FO\7K\2\2GH\7U\2\2HO\7Y\2\2IJ\7"+
		"R\2\2JK\7T\2\2KL\7K\2\2LM\7P\2\2MO\7V\2\2N&\3\2\2\2N)\3\2\2\2N-\3\2\2"+
		"\2N\60\3\2\2\2N\62\3\2\2\2N\65\3\2\2\2N9\3\2\2\2N<\3\2\2\2N?\3\2\2\2N"+
		"B\3\2\2\2ND\3\2\2\2NG\3\2\2\2NI\3\2\2\2O\16\3\2\2\2PQ\7T\2\2QY\7\63\2"+
		"\2RS\7T\2\2SY\7\64\2\2TU\7T\2\2UY\7\65\2\2VW\7T\2\2WY\7\66\2\2XP\3\2\2"+
		"\2XR\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\20\3\2\2\2\b\2\26\35$NX\3\3\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}