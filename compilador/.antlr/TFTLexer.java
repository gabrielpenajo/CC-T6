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
		T__9=10, COMENTARIO=11, WS=12, NUMERO=13, IDENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ESC_SEQ", "COMENTARIO", "WS", "NUMERO", "IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'caracteristica'", "'unidade'", "'representa'", "','", "'sinergia'", 
			"'requer'", "'encontrar'", "'sinergias'", "'para'", "'composicao'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "COMENTARIO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3\r\7\r\u0084\n\r\f\r\16\r\u0087\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\6\17\u0090\n\17\r\17\16\17\u0091\3"+
		"\20\3\20\7\20\u0096\n\20\f\20\16\20\u0099\13\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\r\33\16\35\17\37\20\3\2\6\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u009c\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5\60\3\2\2\2\78\3\2\2\2\tC\3"+
		"\2\2\2\13E\3\2\2\2\rN\3\2\2\2\17U\3\2\2\2\21_\3\2\2\2\23i\3\2\2\2\25n"+
		"\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u008a\3\2\2\2\35\u008f\3\2\2\2"+
		"\37\u0093\3\2\2\2!\"\7e\2\2\"#\7c\2\2#$\7t\2\2$%\7c\2\2%&\7e\2\2&\'\7"+
		"v\2\2\'(\7g\2\2()\7t\2\2)*\7k\2\2*+\7u\2\2+,\7v\2\2,-\7k\2\2-.\7e\2\2"+
		"./\7c\2\2/\4\3\2\2\2\60\61\7w\2\2\61\62\7p\2\2\62\63\7k\2\2\63\64\7f\2"+
		"\2\64\65\7c\2\2\65\66\7f\2\2\66\67\7g\2\2\67\6\3\2\2\289\7t\2\29:\7g\2"+
		"\2:;\7r\2\2;<\7t\2\2<=\7g\2\2=>\7u\2\2>?\7g\2\2?@\7p\2\2@A\7v\2\2AB\7"+
		"c\2\2B\b\3\2\2\2CD\7.\2\2D\n\3\2\2\2EF\7u\2\2FG\7k\2\2GH\7p\2\2HI\7g\2"+
		"\2IJ\7t\2\2JK\7i\2\2KL\7k\2\2LM\7c\2\2M\f\3\2\2\2NO\7t\2\2OP\7g\2\2PQ"+
		"\7s\2\2QR\7w\2\2RS\7g\2\2ST\7t\2\2T\16\3\2\2\2UV\7g\2\2VW\7p\2\2WX\7e"+
		"\2\2XY\7q\2\2YZ\7p\2\2Z[\7v\2\2[\\\7t\2\2\\]\7c\2\2]^\7t\2\2^\20\3\2\2"+
		"\2_`\7u\2\2`a\7k\2\2ab\7p\2\2bc\7g\2\2cd\7t\2\2de\7i\2\2ef\7k\2\2fg\7"+
		"c\2\2gh\7u\2\2h\22\3\2\2\2ij\7r\2\2jk\7c\2\2kl\7t\2\2lm\7c\2\2m\24\3\2"+
		"\2\2no\7e\2\2op\7q\2\2pq\7o\2\2qr\7r\2\2rs\7q\2\2st\7u\2\2tu\7k\2\2uv"+
		"\7e\2\2vw\7c\2\2wx\7q\2\2x\26\3\2\2\2yz\7^\2\2z~\7$\2\2{|\7^\2\2|~\7p"+
		"\2\2}y\3\2\2\2}{\3\2\2\2~\30\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7"+
		"\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\n\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\r\2\2\u0089\32\3\2\2\2\u008a\u008b"+
		"\t\3\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\16\2\2\u008d\34\3\2\2\2\u008e"+
		"\u0090\4\62;\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\36\3\2\2\2\u0093\u0097\t\4\2\2\u0094\u0096"+
		"\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098 \3\2\2\2\u0099\u0097\3\2\2\2\7\2}\u0085\u0091\u0097"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}