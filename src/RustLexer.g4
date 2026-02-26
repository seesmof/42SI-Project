lexer grammar Interpreter;

WS: [ \t\r\n]+ -> skip;
SINGLE_COMMENT: '//' ~[\r\n]* -> skip;
DOUBLE_COMMETN: '/*' .*? '*/' -> skip;

// Key words
FN: 'fn';
LET: 'let';
MUT: 'mut';
STRUCT: 'struct';
IMPL: 'impl';
IF: 'if';
ELSE: 'else';
LOOP: 'loop';
WHILE: 'while';
FOR: 'for';
IN: 'in';
RETURN: 'return';

// Data types
INTEGER: 'i8' | 'i16' | 'i32' | 'i64' | 'i128' | 'isize';
UNSIGNED_INTEGER: 'u8' | 'u16' | 'u32' | 'u64' | 'u128' | 'usize';
FLOAT: 'f32' | 'f64';
BOOL: 'bool';
CHAR: 'char';
STRING: 'str' | 'String';

// Brackets
LCURLYBRACE: '{';
RCURLYBRACE: '}';
LSQUAREBRACKET: '[';
RSQUAREBRACKET: ']';
LPARAN: '(';
RPARAN: ')';

// Symbols
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
CARET: '^';
NOT: '!';
AND: '&';
OR: '|';
AND_AND: '&&';
OR_OR: '||';
PLUS_EQ: '+=';
MINUS_EQ: '-=';
STAR_EQ: '*=';
SLASH_EQ: '/=';
PERCENT_EQ: '%=';
CARET_EQ: '^=';
AND_EQ: '&=';
OR_EQ: '|=';
SHIFT_LEFT_EQ: '<<=';
SHIFT_RIGHT_EQ: '>>=';
EQ: '=';
EQ_EQ: '==';
NE: '!=';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
AT: '@';
UNDERSCORE: '_';
DOT: '.';
DOTDOT: '..';
COMMA: ',';
SEMI: ';';
COLON: ':';
PATH_SEPARATOR: '::';
RIGHT_ARROW: '->';
POUND: '#';
DOLLAR: '$';
QUESTION: '?';

// Vector macro
VEC_MACRO: 'vec!';

// Literals and identifiers
BOOL_LIT: 'true' | 'false';
INT_LIT: [0-9]+;
FLOAT_LIT: [0-9]+ '.' [0-9]+;
STRING_LIT: '"' (~["\\] | '\\' .)* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;
