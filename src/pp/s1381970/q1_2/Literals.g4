lexer grammar Literals;

//@header{package:pp.s1381970.q1_2;}

INT_BINARY	: '0' ('B'|'b') ('0' | '1' [01]*);
INT_OCTAL	: '0' ('0' | [1-7][0-7]*);
INT_DECIMAL	: '0' | [1-9][0-9]*;
INT_HEXA	: '0x' ('0' | [1-9A-F][0-9A-F]*);
LONG_BINARY : INT_BINARY LONG;
LONG_OCTAL	: INT_OCTAL LONG;
LONG_DECIMAL: INT_DECIMAL LONG;
LONG_HEXA	: INT_HEXA LONG;
LONG		: ('L' | 'l');