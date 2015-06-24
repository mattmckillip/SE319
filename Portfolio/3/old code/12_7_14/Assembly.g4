grammar Assembly; // It is important to know the NAME of the grammar


/*----------------
* PARSER RULES
*----------------*/
start 	: (expr ';')+;
expr	:	INSTRUCTION (REGISTER COMMA REGISTER COMMA REGISTER) | INSTRUCTION (REGISTER COMMA REGISTER) | INSTRUCTION (REGISTER) | INSTRUCTION;

/*----------------
* LEXER RULES
*----------------*/
COMMA    	:	',';
NEWLINE 	:	'\r'?'\n';
WS 			:	( ' ' | '\t' | '\r' | '\n' )+   {skip();};
INT			:	 [0-9]+ ;
INSTRUCTION	:	'ADD' | 'ADDI' | 'AND' | 'OR' | 'SLT' | 'SLTI' | 'SLL' | 'SRL' | 'XOR' | 'LW' | 'LWI' | 'SW' | 'PRINT';
REGISTER    : 	'R1' | 'R2' | 'R3' | 'R4';