package com.sixthLesson;

public class FileRunner {
    public static void main(String[] args) {

        File file = new TextFile("MyFile", "Hello, mys name is Michael. ".getBytes());
        file.create();
        file.add("I live in Kiev.".getBytes());
        file.output();
        file.renameTo("YourFile");
        System.out.println(file.getName());
        file.delete();
    }


}
