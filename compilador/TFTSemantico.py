from TFTVisitor import TFTVisitor
from TabelaDeSimbolos import TabelaDeSimbolos, Tipo
from TFTSemanticoUtils import TFTSemanticoUtils
from TFTParser import TFTParser
# from compilador.TFTParser import TFTParser

# Análise semântica do compilador
# implementamos algumas funções da classe visitor gerada pelo antlr.
class TFTSemantico(TFTVisitor) :

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
        if self.tabela.existe(id_caracteristica):
            TFTSemanticoUtils.adicionarErroSemantico(caracteristica.start, f'identificador {id_caracteristica} ja declarado anteriormente')
        else:
            self.tabela.adicionar(id_caracteristica, Tipo.CARACTERISTICA)
        return super().visitDeclaracao_caracteristica(ctx)
    
    def visitDeclaracao_sinergia(self, ctx:TFTParser.Declaracao_sinergiaContext):
        sinergia: TFTParser.SinergiaContext = ctx.sinergia()
        id_sinergia = sinergia.getText()
        if self.tabela.existe(id_sinergia):
            TFTSemanticoUtils.adicionarErroSemantico(sinergia.start, f'identificador {id_sinergia} ja declarado anteriormente')
        else:
            caracteristica = ctx.caracteristica().getText()
            if not self.tabela.existe(caracteristica):
                TFTSemanticoUtils.adicionarErroSemantico(sinergia.start, f'caracteristica {caracteristica} nao declarada')
            else:
                quantidade = int(ctx.NUMERO().getText())
                self.tabela.adicionar(id_sinergia, Tipo.SINERGIA, quantidade=quantidade, caracteristicas=list(caracteristica))
        return super().visitDeclaracao_sinergia(ctx)
    
    def visitDeclaracao_unidade(self, ctx:TFTParser.Declaracao_unidadeContext):
        unidade: TFTParser.UnidadeContext = ctx.unidade()
        id_unidade = unidade.getText()
        if self.tabela.existe(id_unidade):
            TFTSemanticoUtils.adicionarErroSemantico(unidade.start, f'identificador {id_unidade} ja declarado anteriormente')
        else:
            caracteristicas: list[str] = list()
            for caracteristica in ctx.caracteristica():
                id_caracteristica = caracteristica.getText()
                caracteristicas.append(id_caracteristica)
            self.tabela.adicionar(id_unidade, Tipo.UNIDADE, caracteristicas=caracteristicas)
        return super().visitDeclaracao_unidade(ctx)
    
    def visitSaida(self, ctx: TFTParser.SaidaContext):
        return super().visitSaida(ctx)
    
    def visitSaida_sinergia(self, ctx: TFTParser.Saida_sinergiaContext):
        for unidade in ctx.unidade():
            tipo = self.tabela.verificar(unidade.getText())
            if not self.tabela.existe(unidade.getText()):
                TFTSemanticoUtils.adicionarErroSemantico(unidade.start, f'unidade {unidade.getText()} nao declarada')
            elif tipo != Tipo.UNIDADE:
                TFTSemanticoUtils.adicionarErroSemantico(unidade.start, f'identificador {unidade.getText()} nao representa uma unidade\n  tipo esperado: unidade\n  tipo encontrado: { TFTSemanticoUtils.getTipoString(tipo) }')
        return super().visitSaida_sinergia(ctx)