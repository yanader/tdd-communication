package org.example;

public enum Result {
    CAT_WIN("No cheese"),
    MOUSE_WIN("Cheese"),
    TIE("Cheese party!");

    public final String result;

    private Result(String result) {
        this.result = result;
    }

    @Override
    public String toString(){
        return result;
    }
}
