// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitCommand(@NotNull SimpleCommand o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull SimpleExpression o) {
    visitPsiElement(o);
  }

  public void visitOperator(@NotNull SimpleOperator o) {
    visitPsiElement(o);
  }

  public void visitValue(@NotNull SimpleValue o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
