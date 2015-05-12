grammar G0;

//@header{package: pp.s1381970.q1_3;}

e	: e('+' | '-') f
	| f;
f 	: '(' ID ')' f
	| g;
g	: g ('[' e ']' | '.' ID)
	| a;
a	: '(' e ')'
	| NUM
	| ID;


ID	: [0-9];
NUM	: [0-9a-zA-Z];

WS : [ /t/r/n] -> skip;