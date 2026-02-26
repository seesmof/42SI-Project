grammar Lexer;

start: assign EOF;
assign: ID '=' NUMBER;

WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z0-9_]+;
NUMBER: [0-9]+;
