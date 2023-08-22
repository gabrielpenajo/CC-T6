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
		T__9=10, COMENTARIO=11, WS=12, NUMERO=13, IDENT=14;
	public static final int
		RULE_caracteristica = 0, RULE_unidade = 1, RULE_sinergia = 2, RULE_declaracao = 3, 
		RULE_declaracao_caracteristica = 4, RULE_declaracao_unidade = 5, RULE_declaracao_sinergia = 6, 
		RULE_declaracoes = 7, RULE_saida = 8, RULE_saida_sinergia = 9, RULE_saida_composicao = 10, 
		RULE_saidas = 11, RULE_programa = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"caracteristica", "unidade", "sinergia", "declaracao", "declaracao_caracteristica", 
			"declaracao_unidade", "declaracao_sinergia", "declaracoes", "saida", 
			"saida_sinergia", "saida_composicao", "saidas", "programa"
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
			setState(30);
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
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				declaracao_caracteristica();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				declaracao_unidade();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
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
			setState(37);
			match(T__0);
			setState(38);
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
			setState(40);
			match(T__1);
			setState(41);
			unidade();
			setState(42);
			match(T__2);
			setState(43);
			caracteristica();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(44);
				match(T__3);
				setState(45);
				caracteristica();
				}
				}
				setState(50);
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
			setState(51);
			match(T__4);
			setState(52);
			sinergia();
			setState(53);
			match(T__5);
			setState(54);
			match(NUMERO);
			setState(55);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4))) != 0)) {
				{
				{
				setState(57);
				declaracao();
				}
				}
				setState(62);
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
		public Saida_composicaoContext saida_composicao() {
			return getRuleContext(Saida_composicaoContext.class,0);
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
			setState(63);
			match(T__6);
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(64);
				saida_sinergia();
				}
				break;
			case T__9:
				{
				setState(65);
				saida_composicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(68);
			match(T__7);
			setState(69);
			match(T__8);
			setState(70);
			unidade();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(71);
				match(T__3);
				setState(72);
				unidade();
				}
				}
				setState(77);
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

	public static class Saida_composicaoContext extends ParserRuleContext {
		public List<SinergiaContext> sinergia() {
			return getRuleContexts(SinergiaContext.class);
		}
		public SinergiaContext sinergia(int i) {
			return getRuleContext(SinergiaContext.class,i);
		}
		public Saida_composicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida_composicao; }
	}

	public final Saida_composicaoContext saida_composicao() throws RecognitionException {
		Saida_composicaoContext _localctx = new Saida_composicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_saida_composicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__9);
			setState(79);
			match(T__8);
			setState(80);
			sinergia();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(81);
				match(T__3);
				setState(82);
				sinergia();
				}
				}
				setState(87);
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
		enterRule(_localctx, 22, RULE_saidas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(88);
				saida();
				}
				}
				setState(93);
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
		enterRule(_localctx, 24, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			declaracoes();
			setState(95);
			saidas();
			setState(96);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5&\n\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\7\t=\n\t\f\t\16\t@\13\t\3\n\3\n\3\n\5\nE\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\fV\n\f\f\f\16\fY\13\f\3\r\7\r\\\n\r\f\r\16\r_\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2_\2\34\3\2\2\2"+
		"\4\36\3\2\2\2\6 \3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2\f*\3\2\2\2\16\65\3\2\2"+
		"\2\20>\3\2\2\2\22A\3\2\2\2\24F\3\2\2\2\26P\3\2\2\2\30]\3\2\2\2\32`\3\2"+
		"\2\2\34\35\7\20\2\2\35\3\3\2\2\2\36\37\7\20\2\2\37\5\3\2\2\2 !\7\20\2"+
		"\2!\7\3\2\2\2\"&\5\n\6\2#&\5\f\7\2$&\5\16\b\2%\"\3\2\2\2%#\3\2\2\2%$\3"+
		"\2\2\2&\t\3\2\2\2\'(\7\3\2\2()\5\2\2\2)\13\3\2\2\2*+\7\4\2\2+,\5\4\3\2"+
		",-\7\5\2\2-\62\5\2\2\2./\7\6\2\2/\61\5\2\2\2\60.\3\2\2\2\61\64\3\2\2\2"+
		"\62\60\3\2\2\2\62\63\3\2\2\2\63\r\3\2\2\2\64\62\3\2\2\2\65\66\7\7\2\2"+
		"\66\67\5\6\4\2\678\7\b\2\289\7\17\2\29:\5\2\2\2:\17\3\2\2\2;=\5\b\5\2"+
		"<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\21\3\2\2\2@>\3\2\2\2AD\7\t\2"+
		"\2BE\5\24\13\2CE\5\26\f\2DB\3\2\2\2DC\3\2\2\2E\23\3\2\2\2FG\7\n\2\2GH"+
		"\7\13\2\2HM\5\4\3\2IJ\7\6\2\2JL\5\4\3\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2N\25\3\2\2\2OM\3\2\2\2PQ\7\f\2\2QR\7\13\2\2RW\5\6\4\2ST\7\6"+
		"\2\2TV\5\6\4\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\27\3\2\2\2YW\3"+
		"\2\2\2Z\\\5\22\n\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\31\3\2\2"+
		"\2_]\3\2\2\2`a\5\20\t\2ab\5\30\r\2bc\7\2\2\3c\33\3\2\2\2\t%\62>DMW]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}