package com.simpleplugin;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by crobbins on 1/2/14.
 */
public class SimpleLexer extends FlexAdapter {
    public SimpleLexer() {
        super(new _SimpleLexer());
    }
}
