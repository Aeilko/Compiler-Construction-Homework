grammar G0BNF;

//@header{package: pp.s1381970.q1_3;}

e	: f eP;
eP	: '+' f eP
	| '-' f eP
	| '';

f	: '(' ID ')' f
	| g;
g	: a gP;
gP	: '['e']' gP
	| '.' ID gP
	| '';
a	: '('e')'
	| NUM
	| ID;


ID	: [0-9a-zA-Z]+;
NUM	: [0-9]+;

WS : [ /t/r/n] -> skip;