// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.simpleplugin.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.simpleplugin.psi.*;

public class SimpleExpressionImpl extends ASTWrapperPsiElement implements SimpleExpression {

  public SimpleExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) ((SimpleVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleCommand getCommand() {
    return findChildByClass(SimpleCommand.class);
  }

  @Override
  @Nullable
  public SimpleOperator getOperator() {
    return findChildByClass(SimpleOperator.class);
  }

  @Override
  @Nullable
  public SimpleValue getValue() {
    return findChildByClass(SimpleValue.class);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(VARIABLE);
  }

}
