package com.madrapps.text;

public interface StringOperation {
    boolean endsWith(String source, String chars);

    boolean startsWith(String source, String chars);

    boolean replace(String from, String to);
}
