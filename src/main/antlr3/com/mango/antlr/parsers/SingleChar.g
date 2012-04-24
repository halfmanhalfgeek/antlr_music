grammar SingleChar;

options {
  language = Java;
  // generated parser should create abstract syntax tree
  output = AST;
}

@lexer::header {
package com.mango.antlr.parsers;
}
@parser::header {
package com.mango.antlr.parsers;
}


rule: ;
