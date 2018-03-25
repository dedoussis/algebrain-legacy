grammar Expr;

prog: stat+ ;

/** The start rule; begin parsing here. */

stat: expr NEWLINE # printExpr
	| NEWLINE # blank
	;

expr: expr op='^' expr # Pow 
	| expr op=('*'|'/') expr # MulDiv
	| expr op=('+'|'-') expr # AddSub
	| expr '=' expr ( ' if ' bexp)? # rule
	| '(' expr ')' # parens
	| '$' ID # dollar
	| '-' expr # unary
	| op=ID '(' expr ((',') expr)* ')' # RuleOpe
	| INT # int
	| ID # id
	;

		
bexp: bexp op=('AND'|'OR') bexp # andor
	| ID '(' bexp ')' # opcond
	| '(' expr '==' expr ')' # equality
	| ('TRUE'|'FALSE') # truefalse
	| 'depends(' expr ',' expr ')' # depends
	| 'is_const(' expr ')' # const
	;


ID  : [a-zA-Z_]+ ; // match identifiers
INT : [0-9]+ ; // match integers

POW : '^' ;
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

NEWLINE:'\r'? '\n' ; // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ; 