# Generated from compilador/TFT.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,13,85,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,1,1,1,1,
        2,1,2,1,3,1,3,1,3,3,3,34,8,3,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,
        5,5,45,8,5,10,5,12,5,48,9,5,1,6,1,6,1,6,1,6,1,6,1,6,1,7,5,7,57,8,
        7,10,7,12,7,60,9,7,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,5,9,70,8,9,10,
        9,12,9,73,9,9,1,10,5,10,76,8,10,10,10,12,10,79,9,10,1,11,1,11,1,
        11,1,11,1,11,0,0,12,0,2,4,6,8,10,12,14,16,18,20,22,0,0,78,0,24,1,
        0,0,0,2,26,1,0,0,0,4,28,1,0,0,0,6,33,1,0,0,0,8,35,1,0,0,0,10,38,
        1,0,0,0,12,49,1,0,0,0,14,58,1,0,0,0,16,61,1,0,0,0,18,64,1,0,0,0,
        20,77,1,0,0,0,22,80,1,0,0,0,24,25,5,13,0,0,25,1,1,0,0,0,26,27,5,
        13,0,0,27,3,1,0,0,0,28,29,5,13,0,0,29,5,1,0,0,0,30,34,3,8,4,0,31,
        34,3,10,5,0,32,34,3,12,6,0,33,30,1,0,0,0,33,31,1,0,0,0,33,32,1,0,
        0,0,34,7,1,0,0,0,35,36,5,1,0,0,36,37,3,0,0,0,37,9,1,0,0,0,38,39,
        5,2,0,0,39,40,3,2,1,0,40,41,5,3,0,0,41,46,3,0,0,0,42,43,5,4,0,0,
        43,45,3,0,0,0,44,42,1,0,0,0,45,48,1,0,0,0,46,44,1,0,0,0,46,47,1,
        0,0,0,47,11,1,0,0,0,48,46,1,0,0,0,49,50,5,5,0,0,50,51,3,4,2,0,51,
        52,5,6,0,0,52,53,5,12,0,0,53,54,3,0,0,0,54,13,1,0,0,0,55,57,3,6,
        3,0,56,55,1,0,0,0,57,60,1,0,0,0,58,56,1,0,0,0,58,59,1,0,0,0,59,15,
        1,0,0,0,60,58,1,0,0,0,61,62,5,7,0,0,62,63,3,18,9,0,63,17,1,0,0,0,
        64,65,5,8,0,0,65,66,5,9,0,0,66,71,3,2,1,0,67,68,5,4,0,0,68,70,3,
        2,1,0,69,67,1,0,0,0,70,73,1,0,0,0,71,69,1,0,0,0,71,72,1,0,0,0,72,
        19,1,0,0,0,73,71,1,0,0,0,74,76,3,16,8,0,75,74,1,0,0,0,76,79,1,0,
        0,0,77,75,1,0,0,0,77,78,1,0,0,0,78,21,1,0,0,0,79,77,1,0,0,0,80,81,
        3,14,7,0,81,82,3,20,10,0,82,83,5,0,0,1,83,23,1,0,0,0,5,33,46,58,
        71,77
    ]

class TFTParser ( Parser ):

    grammarFileName = "TFT.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'caracteristica'", "'unidade'", "'representa'", 
                     "','", "'sinergia'", "'requer'", "'encontrar'", "'sinergias'", 
                     "'para'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "COMENTARIO", "WS", "NUMERO", 
                      "IDENT" ]

    RULE_caracteristica = 0
    RULE_unidade = 1
    RULE_sinergia = 2
    RULE_declaracao = 3
    RULE_declaracao_caracteristica = 4
    RULE_declaracao_unidade = 5
    RULE_declaracao_sinergia = 6
    RULE_declaracoes = 7
    RULE_saida = 8
    RULE_saida_sinergia = 9
    RULE_saidas = 10
    RULE_programa = 11

    ruleNames =  [ "caracteristica", "unidade", "sinergia", "declaracao", 
                   "declaracao_caracteristica", "declaracao_unidade", "declaracao_sinergia", 
                   "declaracoes", "saida", "saida_sinergia", "saidas", "programa" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    COMENTARIO=10
    WS=11
    NUMERO=12
    IDENT=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class CaracteristicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(TFTParser.IDENT, 0)

        def getRuleIndex(self):
            return TFTParser.RULE_caracteristica

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCaracteristica" ):
                return visitor.visitCaracteristica(self)
            else:
                return visitor.visitChildren(self)




    def caracteristica(self):

        localctx = TFTParser.CaracteristicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_caracteristica)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(TFTParser.IDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UnidadeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(TFTParser.IDENT, 0)

        def getRuleIndex(self):
            return TFTParser.RULE_unidade

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnidade" ):
                return visitor.visitUnidade(self)
            else:
                return visitor.visitChildren(self)




    def unidade(self):

        localctx = TFTParser.UnidadeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_unidade)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(TFTParser.IDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SinergiaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(TFTParser.IDENT, 0)

        def getRuleIndex(self):
            return TFTParser.RULE_sinergia

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSinergia" ):
                return visitor.visitSinergia(self)
            else:
                return visitor.visitChildren(self)




    def sinergia(self):

        localctx = TFTParser.SinergiaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_sinergia)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.match(TFTParser.IDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declaracao_caracteristica(self):
            return self.getTypedRuleContext(TFTParser.Declaracao_caracteristicaContext,0)


        def declaracao_unidade(self):
            return self.getTypedRuleContext(TFTParser.Declaracao_unidadeContext,0)


        def declaracao_sinergia(self):
            return self.getTypedRuleContext(TFTParser.Declaracao_sinergiaContext,0)


        def getRuleIndex(self):
            return TFTParser.RULE_declaracao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracao" ):
                return visitor.visitDeclaracao(self)
            else:
                return visitor.visitChildren(self)




    def declaracao(self):

        localctx = TFTParser.DeclaracaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_declaracao)
        try:
            self.state = 33
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 30
                self.declaracao_caracteristica()
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 31
                self.declaracao_unidade()
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 3)
                self.state = 32
                self.declaracao_sinergia()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Declaracao_caracteristicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def caracteristica(self):
            return self.getTypedRuleContext(TFTParser.CaracteristicaContext,0)


        def getRuleIndex(self):
            return TFTParser.RULE_declaracao_caracteristica

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracao_caracteristica" ):
                return visitor.visitDeclaracao_caracteristica(self)
            else:
                return visitor.visitChildren(self)




    def declaracao_caracteristica(self):

        localctx = TFTParser.Declaracao_caracteristicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_declaracao_caracteristica)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(TFTParser.T__0)
            self.state = 36
            self.caracteristica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Declaracao_unidadeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unidade(self):
            return self.getTypedRuleContext(TFTParser.UnidadeContext,0)


        def caracteristica(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TFTParser.CaracteristicaContext)
            else:
                return self.getTypedRuleContext(TFTParser.CaracteristicaContext,i)


        def getRuleIndex(self):
            return TFTParser.RULE_declaracao_unidade

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracao_unidade" ):
                return visitor.visitDeclaracao_unidade(self)
            else:
                return visitor.visitChildren(self)




    def declaracao_unidade(self):

        localctx = TFTParser.Declaracao_unidadeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_declaracao_unidade)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(TFTParser.T__1)
            self.state = 39
            self.unidade()
            self.state = 40
            self.match(TFTParser.T__2)
            self.state = 41
            self.caracteristica()
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 42
                self.match(TFTParser.T__3)
                self.state = 43
                self.caracteristica()
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Declaracao_sinergiaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sinergia(self):
            return self.getTypedRuleContext(TFTParser.SinergiaContext,0)


        def NUMERO(self):
            return self.getToken(TFTParser.NUMERO, 0)

        def caracteristica(self):
            return self.getTypedRuleContext(TFTParser.CaracteristicaContext,0)


        def getRuleIndex(self):
            return TFTParser.RULE_declaracao_sinergia

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracao_sinergia" ):
                return visitor.visitDeclaracao_sinergia(self)
            else:
                return visitor.visitChildren(self)




    def declaracao_sinergia(self):

        localctx = TFTParser.Declaracao_sinergiaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_declaracao_sinergia)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(TFTParser.T__4)
            self.state = 50
            self.sinergia()
            self.state = 51
            self.match(TFTParser.T__5)
            self.state = 52
            self.match(TFTParser.NUMERO)
            self.state = 53
            self.caracteristica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracoesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declaracao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TFTParser.DeclaracaoContext)
            else:
                return self.getTypedRuleContext(TFTParser.DeclaracaoContext,i)


        def getRuleIndex(self):
            return TFTParser.RULE_declaracoes

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracoes" ):
                return visitor.visitDeclaracoes(self)
            else:
                return visitor.visitChildren(self)




    def declaracoes(self):

        localctx = TFTParser.DeclaracoesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_declaracoes)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 38) != 0):
                self.state = 55
                self.declaracao()
                self.state = 60
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SaidaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def saida_sinergia(self):
            return self.getTypedRuleContext(TFTParser.Saida_sinergiaContext,0)


        def getRuleIndex(self):
            return TFTParser.RULE_saida

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSaida" ):
                return visitor.visitSaida(self)
            else:
                return visitor.visitChildren(self)




    def saida(self):

        localctx = TFTParser.SaidaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_saida)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(TFTParser.T__6)

            self.state = 62
            self.saida_sinergia()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Saida_sinergiaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unidade(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TFTParser.UnidadeContext)
            else:
                return self.getTypedRuleContext(TFTParser.UnidadeContext,i)


        def getRuleIndex(self):
            return TFTParser.RULE_saida_sinergia

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSaida_sinergia" ):
                return visitor.visitSaida_sinergia(self)
            else:
                return visitor.visitChildren(self)




    def saida_sinergia(self):

        localctx = TFTParser.Saida_sinergiaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_saida_sinergia)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(TFTParser.T__7)
            self.state = 65
            self.match(TFTParser.T__8)
            self.state = 66
            self.unidade()
            self.state = 71
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 67
                self.match(TFTParser.T__3)
                self.state = 68
                self.unidade()
                self.state = 73
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SaidasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def saida(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TFTParser.SaidaContext)
            else:
                return self.getTypedRuleContext(TFTParser.SaidaContext,i)


        def getRuleIndex(self):
            return TFTParser.RULE_saidas

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSaidas" ):
                return visitor.visitSaidas(self)
            else:
                return visitor.visitChildren(self)




    def saidas(self):

        localctx = TFTParser.SaidasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_saidas)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==7:
                self.state = 74
                self.saida()
                self.state = 79
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declaracoes(self):
            return self.getTypedRuleContext(TFTParser.DeclaracoesContext,0)


        def saidas(self):
            return self.getTypedRuleContext(TFTParser.SaidasContext,0)


        def EOF(self):
            return self.getToken(TFTParser.EOF, 0)

        def getRuleIndex(self):
            return TFTParser.RULE_programa

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = TFTParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_programa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 80
            self.declaracoes()
            self.state = 81
            self.saidas()
            self.state = 82
            self.match(TFTParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





