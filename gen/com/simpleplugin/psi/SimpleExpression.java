// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleExpression extends PsiElement {

  @Nullable
  SimpleCommand getCommand();

  @Nullable
  SimpleOperator getOperator();

  @Nullable
  SimpleValue getValue();

  @Nullable
  PsiElement getVariable();

}
