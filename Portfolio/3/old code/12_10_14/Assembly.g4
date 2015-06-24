grammar Assembly; // It is important to know the NAME of the grammar
//https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4

/*----------------
* PARSER RULES
*----------------*/
start	 	: 	instruction+;
instruction	:	(rtype ENDINSTRUCION) | (itype ENDINSTRUCION);
rtype		:	(RINSTRUCTION register COMMA register COMMA register) | (TWOREG register COMMA register);
itype		:	(TWOREGISTERIMM register COMMA register COMMA immediate) | (ONEREGIMM register COMMA immediate);
register	: 	TEMPREGISTER | SAVEDREGISTER | ZEROREGISTER | FUNCTIONREGISTER | STACKPOINTER | RETURNADDRESS | RESULTREGISTERS;
immediate	:	INT;

//I-type
//J-type
//R-type

/*----------------
* LEXER RULES
*----------------*/
ENDINSTRUCION	: 	';';
COMMA    		:	',';
NEWLINE 		:	'\r'?'\n' {skip();};
WS 				:	( ' ' | '\t' | '\r' | '\n' )+   {skip();};
INT				:	[0-9]+ ;

RINSTRUCTION	:	'ADD' | 'AND' | 'OR' | 'SLT' | 'SLL'| 'SRL'| 'XOR';
TWOREGISTERIMM	:	'ADDI' | 'SLTI';
TWOREG			:	'LW' | 'SW';
ONEREGIMM		:	'LWI';

SAVEDREGISTER   : 	'$s0' | '$s1' | '$s2' | '$s3' | '$s4' | '$s5' | '$s6' | '$s7' | '$s8';
TEMPREGISTER	:	'$t0' | '$t1' | '$t2' | '$t3' | '$t4' | '$t5' | '$t6' | '$t7' | '$t8' | '$t9';
ZEROREGISTER	:	'$zero';
FUNCTIONREGISTER:	'$a0' | '$a1' | '$a2' | '$a3'; 
STACKPOINTER	: 	'$sp';
RETURNADDRESS	:	'$ra';
RESULTREGISTERS	:	'$v0' | '$v1';