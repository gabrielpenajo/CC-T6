# Generated from compilador/TFT.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .TFTParser import TFTParser
else:
    from TFTParser import TFTParser

# This class defines a complete generic visitor for a parse tree produced by TFTParser.

class TFTVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by TFTParser#caracteristica.
    def visitCaracteristica(self, ctx:TFTParser.CaracteristicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#unidade.
    def visitUnidade(self, ctx:TFTParser.UnidadeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#sinergia.
    def visitSinergia(self, ctx:TFTParser.SinergiaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#declaracao.
    def visitDeclaracao(self, ctx:TFTParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#declaracao_caracteristica.
    def visitDeclaracao_caracteristica(self, ctx:TFTParser.Declaracao_caracteristicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#declaracao_unidade.
    def visitDeclaracao_unidade(self, ctx:TFTParser.Declaracao_unidadeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#declaracao_sinergia.
    def visitDeclaracao_sinergia(self, ctx:TFTParser.Declaracao_sinergiaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#declaracoes.
    def visitDeclaracoes(self, ctx:TFTParser.DeclaracoesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#saida.
    def visitSaida(self, ctx:TFTParser.SaidaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#saida_sinergia.
    def visitSaida_sinergia(self, ctx:TFTParser.Saida_sinergiaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#saidas.
    def visitSaidas(self, ctx:TFTParser.SaidasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TFTParser#programa.
    def visitPrograma(self, ctx:TFTParser.ProgramaContext):
        return self.visitChildren(ctx)



del TFTParser