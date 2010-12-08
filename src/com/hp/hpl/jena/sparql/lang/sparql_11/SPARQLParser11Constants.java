/* Generated By:JavaCC: Do not edit this line. SPARQLParser11Constants.java */
/*
 * (c) Copyright 2004, 2005, 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
 * (c) Copyright 2010 Talis Systems Ltd
 * All rights reserved.
 */
package com.hp.hpl.jena.sparql.lang.sparql_11 ;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SPARQLParser11Constants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WS = 6;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 7;
  /** RegularExpression Id. */
  int IRIref = 8;
  /** RegularExpression Id. */
  int PNAME_NS = 9;
  /** RegularExpression Id. */
  int PNAME_LN = 10;
  /** RegularExpression Id. */
  int BLANK_NODE_LABEL = 11;
  /** RegularExpression Id. */
  int VAR1 = 12;
  /** RegularExpression Id. */
  int VAR2 = 13;
  /** RegularExpression Id. */
  int LANGTAG = 14;
  /** RegularExpression Id. */
  int A2Z = 15;
  /** RegularExpression Id. */
  int A2ZN = 16;
  /** RegularExpression Id. */
  int KW_A = 17;
  /** RegularExpression Id. */
  int BASE = 18;
  /** RegularExpression Id. */
  int PREFIX = 19;
  /** RegularExpression Id. */
  int SELECT = 20;
  /** RegularExpression Id. */
  int DISTINCT = 21;
  /** RegularExpression Id. */
  int REDUCED = 22;
  /** RegularExpression Id. */
  int DESCRIBE = 23;
  /** RegularExpression Id. */
  int CONSTRUCT = 24;
  /** RegularExpression Id. */
  int ASK = 25;
  /** RegularExpression Id. */
  int LIMIT = 26;
  /** RegularExpression Id. */
  int OFFSET = 27;
  /** RegularExpression Id. */
  int ORDER = 28;
  /** RegularExpression Id. */
  int BY = 29;
  /** RegularExpression Id. */
  int BINDINGS = 30;
  /** RegularExpression Id. */
  int UNDEF = 31;
  /** RegularExpression Id. */
  int ASC = 32;
  /** RegularExpression Id. */
  int DESC = 33;
  /** RegularExpression Id. */
  int NAMED = 34;
  /** RegularExpression Id. */
  int FROM = 35;
  /** RegularExpression Id. */
  int WHERE = 36;
  /** RegularExpression Id. */
  int AND = 37;
  /** RegularExpression Id. */
  int GRAPH = 38;
  /** RegularExpression Id. */
  int OPTIONAL = 39;
  /** RegularExpression Id. */
  int UNION = 40;
  /** RegularExpression Id. */
  int MINUS_P = 41;
  /** RegularExpression Id. */
  int BIND = 42;
  /** RegularExpression Id. */
  int SERVICE = 43;
  /** RegularExpression Id. */
  int EXISTS = 44;
  /** RegularExpression Id. */
  int NOT = 45;
  /** RegularExpression Id. */
  int NOTEXISTS = 46;
  /** RegularExpression Id. */
  int AS = 47;
  /** RegularExpression Id. */
  int GROUP = 48;
  /** RegularExpression Id. */
  int HAVING = 49;
  /** RegularExpression Id. */
  int SEPARATOR = 50;
  /** RegularExpression Id. */
  int AGG = 51;
  /** RegularExpression Id. */
  int COUNT = 52;
  /** RegularExpression Id. */
  int MIN = 53;
  /** RegularExpression Id. */
  int MAX = 54;
  /** RegularExpression Id. */
  int SUM = 55;
  /** RegularExpression Id. */
  int AVG = 56;
  /** RegularExpression Id. */
  int STDDEV = 57;
  /** RegularExpression Id. */
  int SAMPLE = 58;
  /** RegularExpression Id. */
  int GROUP_CONCAT = 59;
  /** RegularExpression Id. */
  int FILTER = 60;
  /** RegularExpression Id. */
  int BOUND = 61;
  /** RegularExpression Id. */
  int COALESCE = 62;
  /** RegularExpression Id. */
  int IN = 63;
  /** RegularExpression Id. */
  int NOT_IN = 64;
  /** RegularExpression Id. */
  int IF = 65;
  /** RegularExpression Id. */
  int BNODE = 66;
  /** RegularExpression Id. */
  int IRI = 67;
  /** RegularExpression Id. */
  int URI = 68;
  /** RegularExpression Id. */
  int STR = 69;
  /** RegularExpression Id. */
  int STRLANG = 70;
  /** RegularExpression Id. */
  int STRDT = 71;
  /** RegularExpression Id. */
  int DTYPE = 72;
  /** RegularExpression Id. */
  int LANG = 73;
  /** RegularExpression Id. */
  int LANGMATCHES = 74;
  /** RegularExpression Id. */
  int IS_URI = 75;
  /** RegularExpression Id. */
  int IS_IRI = 76;
  /** RegularExpression Id. */
  int IS_BLANK = 77;
  /** RegularExpression Id. */
  int IS_LITERAL = 78;
  /** RegularExpression Id. */
  int IS_NUMERIC = 79;
  /** RegularExpression Id. */
  int REGEX = 80;
  /** RegularExpression Id. */
  int SAME_TERM = 81;
  /** RegularExpression Id. */
  int RAND = 82;
  /** RegularExpression Id. */
  int ABS = 83;
  /** RegularExpression Id. */
  int CEIL = 84;
  /** RegularExpression Id. */
  int FLOOR = 85;
  /** RegularExpression Id. */
  int ROUND = 86;
  /** RegularExpression Id. */
  int CONCAT = 87;
  /** RegularExpression Id. */
  int SUBSTR = 88;
  /** RegularExpression Id. */
  int STRLEN = 89;
  /** RegularExpression Id. */
  int UCASE = 90;
  /** RegularExpression Id. */
  int LCASE = 91;
  /** RegularExpression Id. */
  int ENCODE_FOR_URI = 92;
  /** RegularExpression Id. */
  int CONTAINS = 93;
  /** RegularExpression Id. */
  int STARTS = 94;
  /** RegularExpression Id. */
  int ENDS = 95;
  /** RegularExpression Id. */
  int YEAR = 96;
  /** RegularExpression Id. */
  int MONTH = 97;
  /** RegularExpression Id. */
  int DAY = 98;
  /** RegularExpression Id. */
  int HOURS = 99;
  /** RegularExpression Id. */
  int MINUTES = 100;
  /** RegularExpression Id. */
  int SECONDS = 101;
  /** RegularExpression Id. */
  int TIMEZONE = 102;
  /** RegularExpression Id. */
  int NOW = 103;
  /** RegularExpression Id. */
  int MD5 = 104;
  /** RegularExpression Id. */
  int SHA1 = 105;
  /** RegularExpression Id. */
  int SHA224 = 106;
  /** RegularExpression Id. */
  int SHA256 = 107;
  /** RegularExpression Id. */
  int SHA384 = 108;
  /** RegularExpression Id. */
  int SHA512 = 109;
  /** RegularExpression Id. */
  int TRUE = 110;
  /** RegularExpression Id. */
  int FALSE = 111;
  /** RegularExpression Id. */
  int DATA = 112;
  /** RegularExpression Id. */
  int INSERT = 113;
  /** RegularExpression Id. */
  int DELETE = 114;
  /** RegularExpression Id. */
  int INSERT_DATA = 115;
  /** RegularExpression Id. */
  int DELETE_DATA = 116;
  /** RegularExpression Id. */
  int DELETE_WHERE = 117;
  /** RegularExpression Id. */
  int LOAD = 118;
  /** RegularExpression Id. */
  int CLEAR = 119;
  /** RegularExpression Id. */
  int CREATE = 120;
  /** RegularExpression Id. */
  int ADD = 121;
  /** RegularExpression Id. */
  int MOVE = 122;
  /** RegularExpression Id. */
  int COPY = 123;
  /** RegularExpression Id. */
  int META = 124;
  /** RegularExpression Id. */
  int SILENT = 125;
  /** RegularExpression Id. */
  int DROP = 126;
  /** RegularExpression Id. */
  int INTO = 127;
  /** RegularExpression Id. */
  int TO = 128;
  /** RegularExpression Id. */
  int DFT = 129;
  /** RegularExpression Id. */
  int ALL = 130;
  /** RegularExpression Id. */
  int WITH = 131;
  /** RegularExpression Id. */
  int USING = 132;
  /** RegularExpression Id. */
  int DIGITS = 133;
  /** RegularExpression Id. */
  int INTEGER = 134;
  /** RegularExpression Id. */
  int DECIMAL = 135;
  /** RegularExpression Id. */
  int DOUBLE = 136;
  /** RegularExpression Id. */
  int INTEGER_POSITIVE = 137;
  /** RegularExpression Id. */
  int DECIMAL_POSITIVE = 138;
  /** RegularExpression Id. */
  int DOUBLE_POSITIVE = 139;
  /** RegularExpression Id. */
  int INTEGER_NEGATIVE = 140;
  /** RegularExpression Id. */
  int DECIMAL_NEGATIVE = 141;
  /** RegularExpression Id. */
  int DOUBLE_NEGATIVE = 142;
  /** RegularExpression Id. */
  int EXPONENT = 143;
  /** RegularExpression Id. */
  int QUOTE_3D = 144;
  /** RegularExpression Id. */
  int QUOTE_3S = 145;
  /** RegularExpression Id. */
  int ECHAR = 146;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 147;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 148;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 149;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 150;
  /** RegularExpression Id. */
  int LPAREN = 151;
  /** RegularExpression Id. */
  int RPAREN = 152;
  /** RegularExpression Id. */
  int NIL = 153;
  /** RegularExpression Id. */
  int LBRACE = 154;
  /** RegularExpression Id. */
  int RBRACE = 155;
  /** RegularExpression Id. */
  int LBRACKET = 156;
  /** RegularExpression Id. */
  int RBRACKET = 157;
  /** RegularExpression Id. */
  int ANON = 158;
  /** RegularExpression Id. */
  int SEMICOLON = 159;
  /** RegularExpression Id. */
  int COMMA = 160;
  /** RegularExpression Id. */
  int DOT = 161;
  /** RegularExpression Id. */
  int EQ = 162;
  /** RegularExpression Id. */
  int NE = 163;
  /** RegularExpression Id. */
  int GT = 164;
  /** RegularExpression Id. */
  int LT = 165;
  /** RegularExpression Id. */
  int LE = 166;
  /** RegularExpression Id. */
  int GE = 167;
  /** RegularExpression Id. */
  int BANG = 168;
  /** RegularExpression Id. */
  int TILDE = 169;
  /** RegularExpression Id. */
  int COLON = 170;
  /** RegularExpression Id. */
  int SC_OR = 171;
  /** RegularExpression Id. */
  int SC_AND = 172;
  /** RegularExpression Id. */
  int PLUS = 173;
  /** RegularExpression Id. */
  int MINUS = 174;
  /** RegularExpression Id. */
  int STAR = 175;
  /** RegularExpression Id. */
  int SLASH = 176;
  /** RegularExpression Id. */
  int DATATYPE = 177;
  /** RegularExpression Id. */
  int AT = 178;
  /** RegularExpression Id. */
  int VBAR = 179;
  /** RegularExpression Id. */
  int CARAT = 180;
  /** RegularExpression Id. */
  int FPATH = 181;
  /** RegularExpression Id. */
  int RPATH = 182;
  /** RegularExpression Id. */
  int QMARK = 183;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 184;
  /** RegularExpression Id. */
  int PN_CHARS_U = 185;
  /** RegularExpression Id. */
  int PN_CHARS = 186;
  /** RegularExpression Id. */
  int PN_PREFIX = 187;
  /** RegularExpression Id. */
  int PN_LOCAL = 188;
  /** RegularExpression Id. */
  int VARNAME = 189;
  /** RegularExpression Id. */
  int UNKNOWN = 190;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<WS>",
    "<SINGLE_LINE_COMMENT>",
    "<IRIref>",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<BLANK_NODE_LABEL>",
    "<VAR1>",
    "<VAR2>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "\"a\"",
    "\"base\"",
    "\"prefix\"",
    "\"select\"",
    "\"distinct\"",
    "\"reduced\"",
    "\"describe\"",
    "\"construct\"",
    "\"ask\"",
    "\"limit\"",
    "\"offset\"",
    "\"order\"",
    "\"by\"",
    "\"bindings\"",
    "\"undef\"",
    "\"asc\"",
    "\"desc\"",
    "\"named\"",
    "\"from\"",
    "\"where\"",
    "\"and\"",
    "\"graph\"",
    "\"optional\"",
    "\"union\"",
    "\"minus\"",
    "\"bind\"",
    "\"service\"",
    "\"exists\"",
    "\"not\"",
    "<NOTEXISTS>",
    "\"as\"",
    "\"group\"",
    "\"having\"",
    "\"separator\"",
    "\"agg\"",
    "\"count\"",
    "\"min\"",
    "\"max\"",
    "\"sum\"",
    "\"avg\"",
    "\"stdev\"",
    "\"sample\"",
    "\"group_concat\"",
    "\"filter\"",
    "\"bound\"",
    "\"coalesce\"",
    "\"in\"",
    "<NOT_IN>",
    "\"if\"",
    "\"bnode\"",
    "\"iri\"",
    "\"uri\"",
    "\"str\"",
    "\"strlang\"",
    "\"strdt\"",
    "\"datatype\"",
    "\"lang\"",
    "\"langmatches\"",
    "\"isURI\"",
    "\"isIRI\"",
    "\"isBlank\"",
    "\"isLiteral\"",
    "\"isNumeric\"",
    "\"regex\"",
    "\"sameTerm\"",
    "\"RAND\"",
    "\"ABS\"",
    "\"CEIL\"",
    "\"FLOOR\"",
    "\"ROUND\"",
    "\"CONCAT\"",
    "\"SUBSTR\"",
    "\"STRLEN\"",
    "\"UCASE\"",
    "\"LCASE\"",
    "\"ENCODE_FOR_URI\"",
    "\"CONTAINS\"",
    "\"STARTS\"",
    "\"ENDS\"",
    "\"YEAR\"",
    "\"MONTH\"",
    "\"DAY\"",
    "\"HOURS\"",
    "\"MINUTES\"",
    "\"SECONDS\"",
    "\"TIMEZONE\"",
    "\"NOW\"",
    "\"MD5\"",
    "\"SHA1\"",
    "\"SHA224\"",
    "\"SHA256\"",
    "\"SHA384\"",
    "\"SHA512\"",
    "\"true\"",
    "\"false\"",
    "\"data\"",
    "\"insert\"",
    "\"delete\"",
    "<INSERT_DATA>",
    "<DELETE_DATA>",
    "<DELETE_WHERE>",
    "\"load\"",
    "\"clear\"",
    "\"create\"",
    "\"add\"",
    "\"move\"",
    "\"copy\"",
    "\"meta\"",
    "\"silent\"",
    "\"drop\"",
    "\"into\"",
    "\"to\"",
    "\"default\"",
    "\"all\"",
    "\"with\"",
    "\"using\"",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<INTEGER_POSITIVE>",
    "<DECIMAL_POSITIVE>",
    "<DOUBLE_POSITIVE>",
    "<INTEGER_NEGATIVE>",
    "<DECIMAL_NEGATIVE>",
    "<DOUBLE_NEGATIVE>",
    "<EXPONENT>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "\"(\"",
    "\")\"",
    "<NIL>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANON>",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"!=\"",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"!\"",
    "\"~\"",
    "\":\"",
    "\"||\"",
    "\"&&\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^^\"",
    "\"@\"",
    "\"|\"",
    "\"^\"",
    "\"->\"",
    "\"<-\"",
    "\"?\"",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<UNKNOWN>",
  };

}
