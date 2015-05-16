grammar SBN;

import SBNVocab;

number	: sign list;
sign	: PLUS			#plus
		| MIN			#min
		;
list	: list bit		#listBit
		| bit			#singleBit
		;
bit		: ZERO			#zero
		| ONE			#one
		;