from enum import Enum


class Tipo(Enum):
    UNIDADE = "unidade"
    SINERGIA = "sinergia"
    CARACTERISTICA = "caracteristica"
    __INTERNAL__ = "__internal__"

class InfoTipo:
    def __init__(self, tipo: Tipo, quantidade: int, caracteristicas: list[str]):
        self.tipo = tipo
        self.quantidade = quantidade
        self.caracteristicas = caracteristicas
    
    def __str__(self) -> str:
        return f'tipo={self.tipo} quantidade={self.quantidade} caracteristicas={self.caracteristicas}'

class TabelaDeSimbolos():
    def __init__(self, tipo: Tipo):
        self.tabela: dict[str, InfoTipo] = {}
        self.tipo = tipo

    class EntradaTabelaSimbolos():
        def __init__(self, nome: str, tipo: Tipo, quantidade: int, caracteristicas: list[str]):
            self.nome = nome
            self.infoTipo =  InfoTipo(tipo, quantidade, caracteristicas)

    def adicionar(self, nome: str, tipo: Tipo, quantidade: int = 0, caracteristicas: list[str] = list()):
        entrada = TabelaDeSimbolos.EntradaTabelaSimbolos(nome, tipo, quantidade, caracteristicas)
        self.tabela[entrada.nome] = entrada.infoTipo
    
    def existe(self, nome: str) -> bool:
        return self.tabela.get(nome) != None
    
    def verificar(self, nome : str):
        if not self.tabela.get(nome):
            return None
        return self.tabela.get(nome).tipo
