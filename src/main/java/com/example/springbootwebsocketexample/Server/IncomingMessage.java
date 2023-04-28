package com.example.springbootwebsocketexample.Server;

import com.fasterxml.jackson.annotation.JsonCreator;

public class IncomingMessage {
    private String name;
    @JsonCreator
    public IncomingMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
