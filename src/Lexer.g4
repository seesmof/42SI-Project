grammar Lexer;

query : select from where EOF ;

select: 'SELECT' LIST;
from: 'FROM' ID;
where: 'WHERE' EXPRESSION;

LIST: [a-zA-Z,]+;
ID: [0-9a-zA-Z_]*;
EXPRESSION: .*?;