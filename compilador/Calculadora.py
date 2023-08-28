from TFTVisitor import TFTVisitor
from TabelaDeSimbolos import TabelaDeSimbolos, Tipo, InfoTipo
from TFTSemanticoUtils import TFTSemanticoUtils
from TFTParser import TFTParser
# from compilador.TFTParser import TFTParser

# Análise semântica do compilador
# implementamos algumas funções da classe visitor gerada pelo antlr.
class Calculadora(TFTVisitor) :

    tabela: TabelaDeSimbolos = TabelaDeSimbolos(Tipo.__INTERNAL__)

    # Começo da árvore gerada pela análise sintática
    def visitPrograma(self, ctx: TFTParser.ProgramaContext):
        return super().visitPrograma(ctx)

    # A linguagem TFT contém apenas declarações simples de escopo único
    def visitDeclaracao(self, ctx:TFTParser.DeclaracaoContext):
        return super().visitDeclaracao(ctx)
    
    def visitDeclaracao_caracteristica(self, ctx:TFTParser.Declaracao_caracteristicaContext):
        caracteristica: TFTParser.CaracteristicaContext = ctx.caracteristica()
        id_caracteristica = caracteristica.getText()
        self.tabela.adicionar(id_caracteristica, Tipo.CARACTERISTICA)
        return super().visitDeclaracao_caracteristica(ctx)
    
    def visitDeclaracao_sinergia(self, ctx:TFTParser.Declaracao_sinergiaContext):
        sinergia: TFTParser.SinergiaContext = ctx.sinergia()
        id_sinergia = sinergia.getText()
        caracteristica = ctx.caracteristica().getText()
        quantidade = int(ctx.NUMERO().getText())
        self.tabela.adicionar(id_sinergia, Tipo.SINERGIA, quantidade=quantidade, caracteristicas=[caracteristica])
        print('adicionado', self.tabela.tabela[id_sinergia])
        return super().visitDeclaracao_sinergia(ctx)
    
    def visitDeclaracao_unidade(self, ctx:TFTParser.Declaracao_unidadeContext):
        unidade: TFTParser.UnidadeContext = ctx.unidade()
        id_unidade = unidade.getText()
        caracteristicas: list[str] = list()
        for caracteristica in ctx.caracteristica():
            id_caracteristica = caracteristica.getText()
            caracteristicas.append(id_caracteristica)
        self.tabela.adicionar(id_unidade, Tipo.UNIDADE, caracteristicas=caracteristicas)
        return super().visitDeclaracao_unidade(ctx)
    
    def visitSaida(self, ctx: TFTParser.SaidaContext):
        return super().visitSaida(ctx)
    
    def visitSaida_composicao(self, ctx: TFTParser.Saida_composicaoContext):
        for sinergia in ctx.sinergia():
            entrada: InfoTipo = self.tabela.tabela.get(sinergia.getText())
            print(sinergia.getText(), entrada.tipo)
            # TODO: implementar calculo de unidades que podem ser utilizadas
        return super().visitSaida_composicao(ctx)
    
    def visitSaida_sinergia(self, ctx: TFTParser.Saida_sinergiaContext):
        for unidade in ctx.unidade():
            entrada = self.tabela.tabela.get(unidade.getText())
            print(unidade.getText(), entrada)
            # TODO: implementar calculo de sinergias ativadas
        return super().visitSaida_sinergia(ctx)