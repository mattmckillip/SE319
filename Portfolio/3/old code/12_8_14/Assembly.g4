grammar Assembly; // It is important to know the NAME of the grammar
//https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4

/*----------------
* PARSER RULES
*----------------*/
start 		: 	(expr ';')+;
expr		:	threeRegArg | twoRegArg | twoRegImmArg | oneRegImmArg;
threeRegArg	:	THREEREGINSTRCUTION register COMMA register COMMA register;
twoRegArg	:	TWOREG register COMMA register;
twoRegImmArg:	TWOREGISTERIMM register COMMA register COMMA INT;
oneRegImmArg:	ONEREGIMM register COMMA INT;
register	: 	TEMPREGISTER | SAVEDREGISTER | ZEROREGISTER | FUNCTIONREGISTER | STACKPOINTER | RETURNADDRESS | RESULTREGISTERS;

/*----------------
* LEXER RULES
*----------------*/
COMMA    		:	',';
NEWLINE 		:	'\r'?'\n';
WS 				:	( ' ' | '\t' | '\r' | '\n' )+   {skip();};
INT				:	[0-9]+ ;

THREEREGINSTRCUTION	:	'ADD' | 'AND' | 'OR' | 'SLT' | 'SLL'| 'SRL'| 'XOR';
TWOREGISTERIMM		:	'ADDI' | 'SLTI';
TWOREG				:	'LW' | 'SW' | 'PRINT';
ONEREGIMM			:	'LWI';

SAVEDREGISTER   : 	'$s0' | '$s1' | '$s2' | '$s3' | '$s4' | '$s5' | '$s6' | '$s7' | '$s8';
TEMPREGISTER	:	'$t0' | '$t1' | '$t2' | '$t3' | '$t4' | '$t5' | '$t6' | '$t7' | '$t8' | '$t9';
ZEROREGISTER	:	'$zero';
FUNCTIONREGISTER:	'$a0' | '$a1' | '$a2' | '$a3'; 
STACKPOINTER	: 	'$sp';
RETURNADDRESS	:	'$ra';
RESULTREGISTERS	:	'$v0' | '$v1';