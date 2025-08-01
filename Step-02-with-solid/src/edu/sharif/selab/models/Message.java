package edu.sharif.selab.models;

public abstract class Message {
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract String getSource();
    public abstract String getTarget();
}
