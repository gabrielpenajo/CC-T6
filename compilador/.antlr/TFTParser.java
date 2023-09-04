// Generated from /home/gabriel/Documentos/Compiladores/T6/compilador/TFT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TFTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		COMENTARIO=10, WS=11, NUMERO=12, IDENT=13;
	public static final int
		RULE_caracteristica = 0, RULE_unidade = 1, RULE_sinergia = 2, RULE_declaracao = 3, 
		RULE_declaracao_caracteristica = 4, RULE_declaracao_unidade = 5, RULE_declaracao_sinergia = 6, 
		RULE_declaracoes = 7, RULE_saida = 8, RULE_saida_sinergia = 9, RULE_saidas = 10, 
		RULE_programa = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"caracteristica", "unidade", "sinergia", "declaracao", "declaracao_caracteristica", 
			"declaracao_unidade", "declaracao_sinergia", "declaracoes", "saida", 
			"saida_sinergia", "saidas", "programa"
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

	@Override
	public String getGrammarFileName() { return "TFT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TFTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CaracteristicaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TFTParser.IDENT, 0); }
		public CaracteristicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteristica; }
	}

	public final CaracteristicaContext caracteristica() throws RecognitionException {
		CaracteristicaContext _localctx = new CaracteristicaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_caracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(IDENT);
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

	public static class UnidadeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TFTParser.IDENT, 0); }
		public UnidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade; }
	}

	public final UnidadeContext unidade() throws RecognitionException {
		UnidadeContext _localctx = new UnidadeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IDENT);
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

	public static class SinergiaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TFTParser.IDENT, 0); }
		public SinergiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinergia; }
	}

	public final SinergiaContext sinergia() throws RecognitionException {
		SinergiaContext _localctx = new SinergiaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sinergia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(IDENT);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public Declaracao_caracteristicaContext declaracao_caracteristica() {
			return getRuleContext(Declaracao_caracteristicaContext.class,0);
		}
		public Declaracao_unidadeContext declaracao_unidade() {
			return getRuleContext(Declaracao_unidadeContext.class,0);
		}
		public Declaracao_sinergiaContext declaracao_sinergia() {
			return getRuleContext(Declaracao_sinergiaContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				declaracao_caracteristica();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				declaracao_unidade();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				declaracao_sinergia();
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

	public static class Declaracao_caracteristicaContext extends ParserRuleContext {
		public CaracteristicaContext caracteristica() {
			return getRuleContext(CaracteristicaContext.class,0);
		}
		public Declaracao_caracteristicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_caracteristica; }
	}

	public final Declaracao_caracteristicaContext declaracao_caracteristica() throws RecognitionException {
		Declaracao_caracteristicaContext _localctx = new Declaracao_caracteristicaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_caracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			caracteristica();
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

	public static class Declaracao_unidadeContext extends ParserRuleContext {
		public UnidadeContext unidade() {
			return getRuleContext(UnidadeContext.class,0);
		}
		public List<CaracteristicaContext> caracteristica() {
			return getRuleContexts(CaracteristicaContext.class);
		}
		public CaracteristicaContext caracteristica(int i) {
			return getRuleContext(CaracteristicaContext.class,i);
		}
		public Declaracao_unidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_unidade; }
	}

	public final Declaracao_unidadeContext declaracao_unidade() throws RecognitionException {
		Declaracao_unidadeContext _localctx = new Declaracao_unidadeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_unidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__1);
			setState(39);
			unidade();
			setState(40);
			match(T__2);
			setState(41);
			caracteristica();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(42);
				match(T__3);
				setState(43);
				caracteristica();
				}
				}
				setState(48);
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

	public static class Declaracao_sinergiaContext extends ParserRuleContext {
		public SinergiaContext sinergia() {
			return getRuleContext(SinergiaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(TFTParser.NUMERO, 0); }
		public CaracteristicaContext caracteristica() {
			return getRuleContext(CaracteristicaContext.class,0);
		}
		public Declaracao_sinergiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_sinergia; }
	}

	public final Declaracao_sinergiaContext declaracao_sinergia() throws RecognitionException {
		Declaracao_sinergiaContext _localctx = new Declaracao_sinergiaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_sinergia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__4);
			setState(50);
			sinergia();
			setState(51);
			match(T__5);
			setState(52);
			match(NUMERO);
			setState(53);
			caracteristica();
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4))) != 0)) {
				{
				{
				setState(55);
				declaracao();
				}
				}
				setState(60);
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

	public static class SaidaContext extends ParserRuleContext {
		public Saida_sinergiaContext saida_sinergia() {
			return getRuleContext(Saida_sinergiaContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__6);
			{
			setState(62);
			saida_sinergia();
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

	public static class Saida_sinergiaContext extends ParserRuleContext {
		public List<UnidadeContext> unidade() {
			return getRuleContexts(UnidadeContext.class);
		}
		public UnidadeContext unidade(int i) {
			return getRuleContext(UnidadeContext.class,i);
		}
		public Saida_sinergiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida_sinergia; }
	}

	public final Saida_sinergiaContext saida_sinergia() throws RecognitionException {
		Saida_sinergiaContext _localctx = new Saida_sinergiaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_saida_sinergia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__7);
			setState(65);
			match(T__8);
			setState(66);
			unidade();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(67);
				match(T__3);
				setState(68);
				unidade();
				}
				}
				setState(73);
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

	public static class SaidasContext extends ParserRuleContext {
		public List<SaidaContext> saida() {
			return getRuleContexts(SaidaContext.class);
		}
		public SaidaContext saida(int i) {
			return getRuleContext(SaidaContext.class,i);
		}
		public SaidasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saidas; }
	}

	public final SaidasContext saidas() throws RecognitionException {
		SaidasContext _localctx = new SaidasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_saidas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(74);
				saida();
				}
				}
				setState(79);
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

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public SaidasContext saidas() {
			return getRuleContext(SaidasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TFTParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			declaracoes();
			setState(81);
			saidas();
			setState(82);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5$\n\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7/\n\7\f\7\16\7\62\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\7\t;\n\t\f\t\16\t>\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13H\n\13\f\13\16\13K\13\13\3\f\7\fN\n\f\f\f\16\fQ\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2P\2\32\3\2\2\2\4\34"+
		"\3\2\2\2\6\36\3\2\2\2\b#\3\2\2\2\n%\3\2\2\2\f(\3\2\2\2\16\63\3\2\2\2\20"+
		"<\3\2\2\2\22?\3\2\2\2\24B\3\2\2\2\26O\3\2\2\2\30R\3\2\2\2\32\33\7\17\2"+
		"\2\33\3\3\2\2\2\34\35\7\17\2\2\35\5\3\2\2\2\36\37\7\17\2\2\37\7\3\2\2"+
		"\2 $\5\n\6\2!$\5\f\7\2\"$\5\16\b\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\t\3"+
		"\2\2\2%&\7\3\2\2&\'\5\2\2\2\'\13\3\2\2\2()\7\4\2\2)*\5\4\3\2*+\7\5\2\2"+
		"+\60\5\2\2\2,-\7\6\2\2-/\5\2\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\r\3\2\2\2\62\60\3\2\2\2\63\64\7\7\2\2\64\65\5\6\4\2\65"+
		"\66\7\b\2\2\66\67\7\16\2\2\678\5\2\2\28\17\3\2\2\29;\5\b\5\2:9\3\2\2\2"+
		";>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\21\3\2\2\2><\3\2\2\2?@\7\t\2\2@A\5\24"+
		"\13\2A\23\3\2\2\2BC\7\n\2\2CD\7\13\2\2DI\5\4\3\2EF\7\6\2\2FH\5\4\3\2G"+
		"E\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\25\3\2\2\2KI\3\2\2\2LN\5\22\n"+
		"\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\27\3\2\2\2QO\3\2\2\2RS\5\20"+
		"\t\2ST\5\26\f\2TU\7\2\2\3U\31\3\2\2\2\7#\60<IO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}