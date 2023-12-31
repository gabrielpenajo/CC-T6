// Generated from /home/gabriel/Documentos/Compiladores/T6/compilador/TFT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TFTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		COMENTARIO=10, WS=11, NUMERO=12, IDENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ESC_SEQ", "COMENTARIO", "WS", "NUMERO", "IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'caracteristica'", "'unidade'", "'representa'", "','", "'sinergia'", 
			"'requer'", "'encontrar'", "'sinergias'", "'para'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "COMENTARIO", 
			"WS", "NUMERO", "IDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TFTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TFT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13q\n\13\3\f\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6\16\u0083\n\16\r\16\16\16\u0084\3\17"+
		"\3\17\7\17\u0089\n\17\f\17\16\17\u008c\13\17\2\2\20\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\2\27\f\31\r\33\16\35\17\3\2\6\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u008f\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\3\37\3\2\2\2\5.\3\2\2\2\7\66\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\r"+
		"L\3\2\2\2\17S\3\2\2\2\21]\3\2\2\2\23g\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2"+
		"\31}\3\2\2\2\33\u0082\3\2\2\2\35\u0086\3\2\2\2\37 \7e\2\2 !\7c\2\2!\""+
		"\7t\2\2\"#\7c\2\2#$\7e\2\2$%\7v\2\2%&\7g\2\2&\'\7t\2\2\'(\7k\2\2()\7u"+
		"\2\2)*\7v\2\2*+\7k\2\2+,\7e\2\2,-\7c\2\2-\4\3\2\2\2./\7w\2\2/\60\7p\2"+
		"\2\60\61\7k\2\2\61\62\7f\2\2\62\63\7c\2\2\63\64\7f\2\2\64\65\7g\2\2\65"+
		"\6\3\2\2\2\66\67\7t\2\2\678\7g\2\289\7r\2\29:\7t\2\2:;\7g\2\2;<\7u\2\2"+
		"<=\7g\2\2=>\7p\2\2>?\7v\2\2?@\7c\2\2@\b\3\2\2\2AB\7.\2\2B\n\3\2\2\2CD"+
		"\7u\2\2DE\7k\2\2EF\7p\2\2FG\7g\2\2GH\7t\2\2HI\7i\2\2IJ\7k\2\2JK\7c\2\2"+
		"K\f\3\2\2\2LM\7t\2\2MN\7g\2\2NO\7s\2\2OP\7w\2\2PQ\7g\2\2QR\7t\2\2R\16"+
		"\3\2\2\2ST\7g\2\2TU\7p\2\2UV\7e\2\2VW\7q\2\2WX\7p\2\2XY\7v\2\2YZ\7t\2"+
		"\2Z[\7c\2\2[\\\7t\2\2\\\20\3\2\2\2]^\7u\2\2^_\7k\2\2_`\7p\2\2`a\7g\2\2"+
		"ab\7t\2\2bc\7i\2\2cd\7k\2\2de\7c\2\2ef\7u\2\2f\22\3\2\2\2gh\7r\2\2hi\7"+
		"c\2\2ij\7t\2\2jk\7c\2\2k\24\3\2\2\2lm\7^\2\2mq\7$\2\2no\7^\2\2oq\7p\2"+
		"\2pl\3\2\2\2pn\3\2\2\2q\26\3\2\2\2rs\7\61\2\2st\7\61\2\2tx\3\2\2\2uw\n"+
		"\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\b"+
		"\f\2\2|\30\3\2\2\2}~\t\3\2\2~\177\3\2\2\2\177\u0080\b\r\2\2\u0080\32\3"+
		"\2\2\2\u0081\u0083\4\62;\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\34\3\2\2\2\u0086\u008a\t\4\2"+
		"\2\u0087\u0089\t\5\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\36\3\2\2\2\u008c\u008a\3\2\2\2\7\2"+
		"px\u0084\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}