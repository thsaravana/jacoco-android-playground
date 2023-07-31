package com.madrapps.text;

/**
 * String related operation
 */
public class StringOp implements StringOperation {

    @Override
    public boolean endsWith(String source, String chars) {
        return source.endsWith(chars);
    }

    @Override
    public boolean startsWith(String source, String chars) {
        return source.startsWith(chars);
    }

    public boolean beginWith(String source, String chars) {
        return startsWith(source, chars);
    }
}
