package com.ihoover;

public enum Command {

    D("Right"),
    G("Left"),
    A("Advance");

    private String label;

    Command(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
