grammar Grammar;

prog: expression EOF;
expression: expression ('+' | '-') expression | NUMBER | '(' expression ')' ;
NEW_LINE: [\r\n]+ -> skip;
NUMBER: [0-9]+;
WS: [ \t]+ -> skip;