package com.simpleplugin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.simpleplugin.psi.SimpleTypes.*;

%%

%{
  public _SimpleLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SimpleLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

VARIABLE=[a-z][a-zA-Z0-9_]*
NUMBER=[0-9]+
STRING=\"[^\"]*\"
COMMENT=--[^\r\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                { return EQUALS; }
  "+"                { return PLUS; }
  ";"                { return SEMICOLON; }
  "run"              { return RUN; }
  "stop"             { return STOP; }

  {VARIABLE}         { return VARIABLE; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }
  {COMMENT}          { return COMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
