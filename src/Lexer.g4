grammar Lexer;

start: block;

block: '{' data '}' ;

data: [0-9] ;