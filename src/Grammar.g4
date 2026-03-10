grammar Grammar;

WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z]+;
prog: ID+ EOF;