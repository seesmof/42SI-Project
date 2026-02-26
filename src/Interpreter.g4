grammar Interpreter;

start: expression EOF;

expression: DIGIT | expression (PLUS | MINUS) expression;

WS: [ \t\r\n]+ -> skip;
SINGLE_COMMENT: '//' ~[\r\n]* -> skip;
DOUBLE_COMMETN: '/*' .*? '*/' -> skip;
NEW_LINE: '\n';
FUNCTION: 'fn';
LET: 'let';
CONST: 'const';
MUT: 'mut';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
LETTER: [a-zA-Z_];
DIGIT: [0-9];

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