import sys
from antlr4 import *

from TFTLexerErrorListener import TFTLexerErrorListener
from TFTParser import TFTParser
from TFTParserErrorListener import TFTParserErrorListener
from TFTLexer import TFTLexer
from TFTSemantico import TFTSemantico
from TFTSemanticoUtils import TFTSemanticoUtils
from Calculadora import Calculadora

# Código responsável por ler os tokens gerados pela analisador léxico e salvar em um arquivo
def main(argv): 
    # Recebendo o arquivo de entrada
    input_stream = FileStream(argv[1], encoding='utf-8')
    # Arquivo de saida
    output_stream = open(argv[2], 'w')
    # Gerando os tokens
    lexer = TFTLexer(input_stream)
    # # Gerando o parser (Analisador sintático)
    tokens = CommonTokenStream(lexer)
    parser = TFTParser(tokens)

    # arvore = parser.programa()
    # Tratamento de erros em python
    # Alterando os tratadores padrões de erro para os que criamos
    lexer.removeErrorListeners()
    lexer.addErrorListener(TFTLexerErrorListener())

    parser.removeErrorListeners()
    parser.addErrorListener(TFTParserErrorListener())

    try:
        arvore = parser.programa()
        # Executa o parser para análise sintática
        tftSemantico = TFTSemantico()
        
        tftSemantico.visitPrograma(arvore)
        for erro in TFTSemanticoUtils.errosSemanticos:
            output_stream.write(erro + "\n")
        if len(TFTSemanticoUtils.errosSemanticos) == 0:
            calculadora = Calculadora()
            calculadora.visitPrograma(arvore)
            
            for resposta in calculadora.respostas:
                output_stream.write(resposta)
        else:
            output_stream.write("\nFim da compilacao\n")
    except Exception as e:
        # Deteccao de erro sintatico e lexico
        # gracas aos listeners que implementamos
        output_stream.write(str(e))
        output_stream.write("\nFim da compilacao\n")
    output_stream.close()

if __name__ == '__main__':
    main(sys.argv)