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
        4,1,14,99,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,1,0,1,0,
        1,1,1,1,1,2,1,2,1,3,1,3,1,3,3,3,36,8,3,1,4,1,4,1,4,1,5,1,5,1,5,1,
        5,1,5,1,5,5,5,47,8,5,10,5,12,5,50,9,5,1,6,1,6,1,6,1,6,1,6,1,6,1,
        7,5,7,59,8,7,10,7,12,7,62,9,7,1,8,1,8,1,8,3,8,67,8,8,1,9,1,9,1,9,
        1,9,1,9,5,9,74,8,9,10,9,12,9,77,9,9,1,10,1,10,1,10,1,10,1,10,5,10,
        84,8,10,10,10,12,10,87,9,10,1,11,5,11,90,8,11,10,11,12,11,93,9,11,
        1,12,1,12,1,12,1,12,1,12,0,0,13,0,2,4,6,8,10,12,14,16,18,20,22,24,
        0,0,93,0,26,1,0,0,0,2,28,1,0,0,0,4,30,1,0,0,0,6,35,1,0,0,0,8,37,
        1,0,0,0,10,40,1,0,0,0,12,51,1,0,0,0,14,60,1,0,0,0,16,63,1,0,0,0,
        18,68,1,0,0,0,20,78,1,0,0,0,22,91,1,0,0,0,24,94,1,0,0,0,26,27,5,
        14,0,0,27,1,1,0,0,0,28,29,5,14,0,0,29,3,1,0,0,0,30,31,5,14,0,0,31,
        5,1,0,0,0,32,36,3,8,4,0,33,36,3,10,5,0,34,36,3,12,6,0,35,32,1,0,
        0,0,35,33,1,0,0,0,35,34,1,0,0,0,36,7,1,0,0,0,37,38,5,1,0,0,38,39,
        3,0,0,0,39,9,1,0,0,0,40,41,5,2,0,0,41,42,3,2,1,0,42,43,5,3,0,0,43,
        48,3,0,0,0,44,45,5,4,0,0,45,47,3,0,0,0,46,44,1,0,0,0,47,50,1,0,0,
        0,48,46,1,0,0,0,48,49,1,0,0,0,49,11,1,0,0,0,50,48,1,0,0,0,51,52,
        5,5,0,0,52,53,3,4,2,0,53,54,5,6,0,0,54,55,5,13,0,0,55,56,3,0,0,0,
        56,13,1,0,0,0,57,59,3,6,3,0,58,57,1,0,0,0,59,62,1,0,0,0,60,58,1,
        0,0,0,60,61,1,0,0,0,61,15,1,0,0,0,62,60,1,0,0,0,63,66,5,7,0,0,64,
        67,3,18,9,0,65,67,3,20,10,0,66,64,1,0,0,0,66,65,1,0,0,0,67,17,1,
        0,0,0,68,69,5,8,0,0,69,70,5,9,0,0,70,75,3,2,1,0,71,72,5,4,0,0,72,
        74,3,2,1,0,73,71,1,0,0,0,74,77,1,0,0,0,75,73,1,0,0,0,75,76,1,0,0,
        0,76,19,1,0,0,0,77,75,1,0,0,0,78,79,5,10,0,0,79,80,5,9,0,0,80,85,
        3,4,2,0,81,82,5,4,0,0,82,84,3,4,2,0,83,81,1,0,0,0,84,87,1,0,0,0,
        85,83,1,0,0,0,85,86,1,0,0,0,86,21,1,0,0,0,87,85,1,0,0,0,88,90,3,
        16,8,0,89,88,1,0,0,0,90,93,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,
        23,1,0,0,0,93,91,1,0,0,0,94,95,3,14,7,0,95,96,3,22,11,0,96,97,5,
        0,0,1,97,25,1,0,0,0,7,35,48,60,66,75,85,91
    ]

class TFTParser ( Parser ):

    grammarFileName = "TFT.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'caracteristica'", "'unidade'", "'representa'", 
                     "','", "'sinergia'", "'requer'", "'encontrar'", "'sinergias'", 
                     "'para'", "'composicao'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "COMENTARIO", 
                      "WS", "NUMERO", "IDENT" ]

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
    RULE_saida_composicao = 10
    RULE_saidas = 11
    RULE_programa = 12

    ruleNames =  [ "caracteristica", "unidade", "sinergia", "declaracao", 
                   "declaracao_caracteristica", "declaracao_unidade", "declaracao_sinergia", 
                   "declaracoes", "saida", "saida_sinergia", "saida_composicao", 
                   "saidas", "programa" ]

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
    T__9=10
    COMENTARIO=11
    WS=12
    NUMERO=13
    IDENT=14

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
            self.state = 26
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
            self.state = 28
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
            self.state = 30
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
            self.state = 35
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 32
                self.declaracao_caracteristica()
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 33
                self.declaracao_unidade()
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 3)
                self.state = 34
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
            self.state = 37
            self.match(TFTParser.T__0)
            self.state = 38
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
            self.state = 40
            self.match(TFTParser.T__1)
            self.state = 41
            self.unidade()
            self.state = 42
            self.match(TFTParser.T__2)
            self.state = 43
            self.caracteristica()
            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 44
                self.match(TFTParser.T__3)
                self.state = 45
                self.caracteristica()
                self.state = 50
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
            self.state = 51
            self.match(TFTParser.T__4)
            self.state = 52
            self.sinergia()
            self.state = 53
            self.match(TFTParser.T__5)
            self.state = 54
            self.match(TFTParser.NUMERO)
            self.state = 55
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
            self.state = 60
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 38) != 0):
                self.state = 57
                self.declaracao()
                self.state = 62
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


        def saida_composicao(self):
            return self.getTypedRuleContext(TFTParser.Saida_composicaoContext,0)


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
            self.state = 63
            self.match(TFTParser.T__6)
            self.state = 66
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.state = 64
                self.saida_sinergia()
                pass
            elif token in [10]:
                self.state = 65
                self.saida_composicao()
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
            self.state = 68
            self.match(TFTParser.T__7)
            self.state = 69
            self.match(TFTParser.T__8)
            self.state = 70
            self.unidade()
            self.state = 75
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 71
                self.match(TFTParser.T__3)
                self.state = 72
                self.unidade()
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Saida_composicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sinergia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TFTParser.SinergiaContext)
            else:
                return self.getTypedRuleContext(TFTParser.SinergiaContext,i)


        def getRuleIndex(self):
            return TFTParser.RULE_saida_composicao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSaida_composicao" ):
                return visitor.visitSaida_composicao(self)
            else:
                return visitor.visitChildren(self)




    def saida_composicao(self):

        localctx = TFTParser.Saida_composicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_saida_composicao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(TFTParser.T__9)
            self.state = 79
            self.match(TFTParser.T__8)
            self.state = 80
            self.sinergia()
            self.state = 85
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 81
                self.match(TFTParser.T__3)
                self.state = 82
                self.sinergia()
                self.state = 87
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
        self.enterRule(localctx, 22, self.RULE_saidas)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 91
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==7:
                self.state = 88
                self.saida()
                self.state = 93
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
        self.enterRule(localctx, 24, self.RULE_programa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 94
            self.declaracoes()
            self.state = 95
            self.saidas()
            self.state = 96
            self.match(TFTParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





