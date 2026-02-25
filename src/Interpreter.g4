grammar Interpreter;

start: expression EOF;

expression: INT | expression (PLUS | MINUS) expression;

PLUS: '+';
MINUS: '-';
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
FUNCTION: 'fn';
LPARAN: '(';
RPARAN: ')';
LET: 'let';
CONST: 'const';
MUT: 'mut';

// Data types
CHAR: 'char';
INTEGER: 'i8' | 'i16' | 'i32' | 'i64' | 'i128' | 'isize';
UNSIGNED_INTEGER: 'u8' | 'u16' | 'u32' | 'u64' | 'u128' | 'usize';
FLOAT: 'f32' | 'f64';
BOOL: 'bool';
