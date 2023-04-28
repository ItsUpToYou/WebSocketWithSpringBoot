package com.example.springbootwebsocketexample.Server;

public class OutgoingMessage {
    private String content;

    public OutgoingMessage() {
    }

    public OutgoingMessage(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
