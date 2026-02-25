grammar RustLexicon;

WHITESPACE : [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' (BLOCK_COMMENT | .)*? '*/' -> skip;

start: expression EOF;

expression
    :
    | INT
    | expression (PLUS | MINUS) expression
    ;

PLUS  : '+';
MINUS : '-';
INT   : [0-9]+;
