from TFTVisitor import TFTVisitor
from TabelaDeSimbolos import TabelaDeSimbolos, Tipo, InfoTipo
from TFTSemanticoUtils import TFTSemanticoUtils
from TFTParser import TFTParser
# from compilador.TFTParser import TFTParser

# Análise semântica do compilador
# implementamos algumas funções da classe visitor gerada pelo antlr.
class Calculadora(TFTVisitor) :

    tabela: TabelaDeSimbolos = TabelaDeSimbolos(Tipo.__INTERNAL__)
    respostas: list[str] = []

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
    
    def visitSaida_sinergia(self, ctx: TFTParser.Saida_sinergiaContext):
        possibilidades = []
        unidades = []
        # Atualizar a quantidade de unidades disponiveis para cada caracteristica
        for unidade in ctx.unidade():
            unidades.append(unidade.getText())
            infoUnidade = self.tabela.tabela.get(unidade.getText())
            quantidades = self.getCaracteristicasCount(infoUnidade)
            # Inicializar uma entrada no vetor de possibilidades apenas se uma unidade passada na query de saida
            # possuir tal caracteristica
            for chave, entrada in zip(self.tabela.tabela.keys(), self.tabela.tabela.values()):
                for tipoDisponivel in quantidades.keys():
                    if tipoDisponivel in entrada.caracteristicas and entrada.tipo == Tipo.SINERGIA:
                        possibilidades.append({ 'sinergia': chave, 'quantidade': entrada.quantidade, 'tipo': tipoDisponivel })
        # Calcular de modo guloso
        tiposUtilizados = {}
        for possibilidade in possibilidades:
            if tiposUtilizados.get(possibilidade['tipo']) == None:
                tiposUtilizados[possibilidade['tipo']] = { 'sinergia': possibilidade['sinergia'], 'quantidade': possibilidade['quantidade'] }
            elif possibilidade['quantidade'] > tiposUtilizados[possibilidade['tipo']]['quantidade']:
                tiposUtilizados[possibilidade['tipo']] = { 'sinergia': possibilidade['sinergia'], 'quantidade': possibilidade['quantidade'] }
        # Montando a string contendo a lista de unidades
        unidadesString = ''
        for i in range(len(unidades)):
            unidadesString += unidades[i]
            if i < len(unidades) - 2:
                unidadesString += ', '
            elif i < len(unidades) - 1:
                unidadesString += ' e '
        # Montando a string contendo as sinergias ativadas
        sinergiasString = ''
        contador = 0
        for entrada in tiposUtilizados.values():
            sinergiasString += entrada['sinergia']
            if contador < len(tiposUtilizados.values()) - 2:
                sinergiasString += ', '
            elif contador < len(tiposUtilizados.values()) - 1:
                sinergiasString += ' e '
            contador += 1
        self.respostas.append(f'as unidades {unidadesString} ativam as sinergias {sinergiasString}')
        return super().visitSaida_sinergia(ctx)

    def getCaracteristicasCount(self, infoTipo: InfoTipo):
        quantidades: dict[str, int] = {}
        for caracteristica in infoTipo.caracteristicas:
            if quantidades.get(caracteristica) == None:
                quantidades[caracteristica] = 1
            else:
                quantidades[caracteristica] += 1
        return quantidades