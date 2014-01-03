// This is a generated file. Not intended for manual editing.
package com.simpleplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.simpleplugin.psi.SimpleTypes.*;
import static org.intellij.grammar.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SimpleParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.simpleplugin.parser.SimpleParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == COMMAND) {
      result_ = command(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, 0);
    }
    else if (root_ == OPERATOR) {
      result_ = operator(builder_, 0);
    }
    else if (root_ == VALUE) {
      result_ = value(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return program(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // run | stop
  public static boolean command(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command")) return false;
    if (!nextTokenIs(builder_, "<command>", RUN, STOP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<command>");
    result_ = consumeToken(builder_, RUN);
    if (!result_) result_ = consumeToken(builder_, STOP);
    exit_section_(builder_, level_, marker_, COMMAND, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // variable operator value | command
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expression>");
    result_ = expression_0(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPRESSION, result_, false, null);
    return result_;
  }

  // variable operator value
  private static boolean expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VARIABLE);
    result_ = result_ && operator(builder_, level_ + 1);
    result_ = result_ && value(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '=' | '+'
  public static boolean operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operator")) return false;
    if (!nextTokenIs(builder_, "<operator>", PLUS, EQUALS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<operator>");
    result_ = consumeToken(builder_, EQUALS);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    exit_section_(builder_, level_, marker_, OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // { expression ';' | comment} *
  static boolean program(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "program")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!program_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "program", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // expression ';' | comment
  private static boolean program_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "program_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = program_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression ';'
  private static boolean program_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "program_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // number | string | variable
  public static boolean value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<value>");
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, VARIABLE);
    exit_section_(builder_, level_, marker_, VALUE, result_, false, null);
    return result_;
  }

}
