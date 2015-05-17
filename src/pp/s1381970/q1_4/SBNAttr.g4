grammar SBNAttr;

import SBNVocab;

number returns [int val]
		: s=sign l=list[0]
		  { $val=($s.negative ? $l.val*(-1) : $l.val); }
		;
sign returns [boolean negative]
		: PLUS
		  {$negative = false; }
		| MIN
		  {$negative = true; }
		;
list [int pos] returns [int val]
		: b=bit[$pos] l=list[$pos+1]
		  {$val = $l.val + $b.val; }
		| b=bit[$pos]
		  {$val = $b.val; }
		;
bit [int pos] returns [int val]
		: ZERO
		  {$val = 0; }
		| ONE
		  {$val = (int) Math.pow(2, $pos); }
		;

WS : [ \t\r\n]+ -> skip ;