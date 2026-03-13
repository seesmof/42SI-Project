grammar Rust;

// --- PARSER ---
start:
	block
	| method
	| function
	| struct
	| if
	| else
	| if_else
	| else_if;

// Block
block: LEFT_CURLY_BRACE .*? RIGHT_CURLY_BRACE;
method:
	FN ID LEFT_PARANTHESIS .*? RIGHT_PARANTHESIS RIGHT_ARROW? ID? block;
function: FN ID LEFT_PARANTHESIS .*? RIGHT_PARANTHESIS block;
struct:
	STRUCT ID LEFT_CURLY_BRACE .*? RIGHT_CURLY_BRACE
	| IMPL ID block;
if: IF .*? block;
else: ELSE .*? block;
if_else: if else;
else_if: ELSE IF .*? block;

// Inline
variable: LET MUT? ID COLON? (data_types)? EQUAL binding;
binding: FLOAT_LIT | INT_LIT | STRING_LIT | BOOL_LIT;
vector: VEC_MACRO LEFT_SQUARE_BRACE .*? RIGHT_SQUARE_BRACE;
loop: LOOP block | WHILE .*? block | FOR .*? block;

// Helper
data_types:
	INTEGER
	| UNSIGNED_INTEGER
	| FLOAT
	| BOOL
	| CHAR
	| STRING;

// --- LEXER ---

// Space and commentaries
WS: [ \t\r\n]+ -> skip;
SINGLE_COMMENT: '//' ~[\r\n]* -> skip;
DOUBLE_COMMENT: '/*' .*? '*/' -> skip;

// Key words
AS: 'as';
ASYNC: 'async';
AWAIT: 'await';
BREAK: 'break';
CONST: 'const';
CONTINUE: 'continue';
CRATE: 'crate';
DYN: 'dyn';
ELSE: 'else';
ENUM: 'enum';
EXTERN: 'extern';
FALSE: 'false';
FN: 'fn';
FOR: 'for';
IF: 'if';
IMPL: 'impl';
IN: 'in';
LET: 'let';
LOOP: 'loop';
MATCH: 'match';
MOD: 'mod';
MOVE: 'move';
MUT: 'mut';
PUB: 'pub';
REF: 'ref';
RETURN: 'return';
SELF: 'self';
STATIC: 'static';
STRUCT: 'struct';
SUPER: 'super';
TRAIT: 'trait';
TRUE: 'true';
TYPE: 'type';
USE: 'use';
WHERE: 'where';
WHILE: 'while';

// Literals and identifiers
BOOL_LIT: TRUE | FALSE;
INT_LIT: [0-9]+;
FLOAT_LIT: [0-9]+ '.' [0-9]+ | '.' [0-9]+;
STRING_LIT: '"' (~["\\] | '\\' .)* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

// Data types
INTEGER: 'i8' | 'i16' | 'i32' | 'i64' | 'i128' | 'isize';
UNSIGNED_INTEGER:
	'u8'
	| 'u16'
	| 'u32'
	| 'u64'
	| 'u128'
	| 'usize';
FLOAT: 'f32' | 'f64';
BOOL: 'bool';
CHAR: 'char';
STRING: 'str' | 'String';

// Brackets
LEFT_CURLY_BRACE: '{';
RIGHT_CURLY_BRACE: '}';
LEFT_SQUARE_BRACE: '[';
RIGHT_SQUARE_BRACE: ']';
LEFT_PARANTHESIS: '(';
RIGHT_PARANTHESIS: ')';

// Symbols
EXCLAMATION: '!';
EXCLAMATORY_EQUAL: '!=';
PERCENT: '%';
AMPERSAND: '&';
AMPERSAND_EQUAL: '&=';
AMPERSAND_AMPERSAND: '&&';
STAR: '*';
STAR_EQUAL: '*=';
PLUS: '+';
PLUS_EQUAL: '+=';
COMMA: ',';
DASH: '-';
DASH_EQUAL: '-=';
RIGHT_ARROW: '->';
DOT: '.';
DOT_DOT: '..';
DOT_DOT_EQUAL: '..=';
DOT_DOT_DOT: '...';
SLASH: '/';
SLASH_EQUAL: '/=';
COLON: ':';
SEMICOLON: ';';
LEFT_LEFT: '<<';
LEFT_LEFT_EQUAL: '<<=';
LEFT: '<';
LEFT_EQUAL: '<=';
EQUAL: '=';
EQUAL_EQUAL: '==';
RIGHT_ARROW_BIG: '=>';
RIGHT: '>';
RIGHT_EQUAL: '>=';
RIGHT_RIGHT: '>>';
RIGHT_RIGHT_EQUAL: '>>=';
AT: '@';
CARET: '^';
CARET_EQUAL: '^=';
PIPE: '|';
PIPE_EQUAL: '|=';
PIPE_PIPE: '||';
QUESTION: '?';
UNDERSCORE: '_';
PATH_SEPARATOR: '::';
POUND: '#';
DOLLAR: '$';

// Vector macro
VEC_MACRO: 'vec!';