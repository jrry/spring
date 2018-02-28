package com.github.jrry.webmvc.dto;

public class TwoParameters {
    private String first;
    private String second;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public TwoParameters(String first, String second) {
        this.first = first;
        this.second = second;
    }
}
