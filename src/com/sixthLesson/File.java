package com.sixthLesson;

public abstract class File {

    private String name;
    private String format;
    private byte[] content;

    public File(String name, String format) {
        this.name = name;
        this.format = format;
    }


    public File(String name, String format, byte[] content) {
        this(name, format);
        this.content = content;
    }

    public String getFormat() {
        return format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }


    public File renameTo(String newName) {
        this.setName(newName);
        return this;
    }


    public File add(byte[] newContent) {
        byte[] sum = new byte[content.length + newContent.length];
        System.arraycopy(content, 0, sum, 0, content.length);
        System.arraycopy(newContent, 0, sum, content.length, newContent.length);
        setContent(sum);
        return this;
    }

    public void create() {
        System.out.println(getName() + "." + getFormat() + "was successfully created");
    }

    public void delete() {
        System.out.println(getName() + "." + getFormat() + " was successfully deleted");
    }

    public abstract void output();

}
