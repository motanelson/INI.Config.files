grammar test;

program: FUNC * EOF;
FUNC : ID* '='* ID '(' ID* (',' ID)*  ')' [\n]*;
NUMBER : [0-9]+ ('.' [0-9])*;
ID: [a-zA-Z]+;
WS : [ \t\r\n] ->skip;