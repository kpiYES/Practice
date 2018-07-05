package com.sixthLesson;

public class TextFile extends File {

    private static String format = "txt";

    public TextFile(String name) {
        super(name, format);
    }

    public TextFile(String name, byte[] content) {
        super(name, format, content);
    }

    @Override
    public void output() {
        System.out.println(new String(getContent()));
    }
}



