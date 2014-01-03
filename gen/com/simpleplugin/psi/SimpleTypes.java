// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.simpleplugin.psi.impl.*;

public interface SimpleTypes {

  IElementType COMMAND = new SimpleElementType("COMMAND");
  IElementType EXPRESSION = new SimpleElementType("EXPRESSION");
  IElementType OPERATOR = new SimpleElementType("OPERATOR");
  IElementType VALUE = new SimpleElementType("VALUE");

  IElementType COMMENT = new SimpleTokenType("comment");
  IElementType EQUALS = new SimpleTokenType("=");
  IElementType NUMBER = new SimpleTokenType("number");
  IElementType PLUS = new SimpleTokenType("+");
  IElementType RUN = new SimpleTokenType("run");
  IElementType SEMICOLON = new SimpleTokenType(";");
  IElementType STOP = new SimpleTokenType("stop");
  IElementType STRING = new SimpleTokenType("string");
  IElementType VARIABLE = new SimpleTokenType("variable");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == COMMAND) {
        return new SimpleCommandImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SimpleExpressionImpl(node);
      }
      else if (type == OPERATOR) {
        return new SimpleOperatorImpl(node);
      }
      else if (type == VALUE) {
        return new SimpleValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
