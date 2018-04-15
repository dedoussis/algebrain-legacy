grammar Expr;

prog: stat+ ;

/** The start rule; begin parsing here. */

stat: expr NEWLINE # printExpr
	| NEWLINE # blank
	;

expr: expr op=POW expr # Pow 
	| expr op=(MUL|DIV) expr # MulDiv
	| expr op=(PLUS|MINUS) expr # AddSub
	| expr EQUALS expr ( ' if ' bexp)? # Rule
	| LPARENS expr RPARENS # Parens
	| DOLLAR ID # Dollar
	| MINUS val=(ID|INT) # VarNumUnary
	| MINUS DOLLAR ID # DolUnary
	| op=(ID|MINUS) LPARENS expr (COMMA expr)* RPARENS # Operator
	| INT # Int
	| ID # Id
	;

		
bexp: bexp op=('AND'|'OR') bexp # andor
	| 'depends' LPARENS expr ',' expr RPARENS # depends
	| 'is_const' LPARENS expr RPARENS # const
	| ID LPARENS bexp RPARENS # opcond
	| LPARENS expr EQUALS EQUALS expr RPARENS # equality
	| ('TRUE'|'FALSE') # truefalse
	;


ID  : [a-zA-Z_]+ ; // match identifiers
INT : [0-9]+ ; // match integers

POW : '^' ;
MUL : '*' ;
DIV : '/' ;
PLUS : '+' ;
MINUS : '-' ;
DOLLAR: '$';
LPARENS: '(';
RPARENS: ')';
COMMA: ',';
EQUALS: '=';

NEWLINE:'\r'? '\n' ; // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ; 