package com.madrapps.text;

/**
 * String related operation
 */
public class StringOp implements IStringOperation {

    @Override
    public boolean endsWith(String source, String chars) {
        return source.endsWith(chars);
    }

    @Override
    public boolean startsWith(String source, String chars) {
        return source.startsWith(chars);
    }

    @Override
    public boolean replace(String from, String to) {
        return false;
    }
}
