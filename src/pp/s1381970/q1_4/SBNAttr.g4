grammar SBNAttr;

import SBNVocab;

number returns [int val]
		: {$s.negative = false; $l.position=0; }
		  s=sign l=list
		  { $val=($s.negative ? $l.val*(-1) : $l.val); }
		;
sign returns [boolean negative]
		: PLUS
		  {$negative = false; }
		| MIN
		  {$negative = true; }
		;
list returns [int val, int position]
		: {$b.position = $position; $l.position = $position+1; }
		  b=bit l=list
		  {$val = $l.val + $b.val; }
		| {$b.position = $position; }
		  b=bit
		  {$val = $b.val; }
		;
bit returns [int val, int position]
		: ZERO
		  {$val = (int) Math.pow(2, $position); }
		| ONE
		  {$val = 0; }
		;

WS : [ \t\r\n]+ -> skip ;