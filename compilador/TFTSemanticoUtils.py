from TFTParser import TFTParser as LAParser
from TabelaDeSimbolos import TabelaDeSimbolos, Tipo

def debug(string: str, msg_prefix):
    if string.find('&') != -1 and False:
        print(f'{msg_prefix}: {string}')

# Classe responsável por verificação de erros, avaliamos, recursivamente, os principais componentes da gramática LA.
class TFTSemanticoUtils:
    errosSemanticos: list[str] = []
    
    @staticmethod
    def adicionarErroSemantico(token, mensagem: str):
        linha: int = token.line
        TFTSemanticoUtils.errosSemanticos.append(f"Linha {linha}: {mensagem}")
