grammar TFT;

// Comentarios e espacos em branco
fragment
ESC_SEQ	: '\\"' | '\\n';

// Comentários são iniciados por '//' e se estendem por uma linha
COMENTARIO: ('//' ~('\n' | '\r')*) -> skip;

// Espaços em branco são ignorados.
WS: ( ' ' | '\t' | '\r' | '\n') -> skip;

// Detecção de números
NUMERO : ('0'..'9')+ ;

// Variáveis
IDENT : ('a'..'z'|'A'..'Z' | '_') ('_' | 'a'..'z'|'A'..'Z'|'0'..'9')* ;
caracteristica: IDENT;
unidade: IDENT;
sinergia: IDENT;

// Regras de produção da gramática TFT.

declaracao: declaracao_caracteristica | declaracao_unidade | declaracao_sinergia;
declaracao_caracteristica: 'caracteristica' caracteristica;
declaracao_unidade: 'unidade' unidade 'representa' caracteristica (',' caracteristica)*;
declaracao_sinergia: 'sinergia' sinergia 'requer' NUMERO caracteristica;
declaracoes: (declaracao)*;

saida: 'encontrar' (saida_sinergia);
saida_sinergia: 'sinergias' 'para' unidade (',' unidade)*;  
saidas: (saida)*;

programa: declaracoes saidas EOF;
