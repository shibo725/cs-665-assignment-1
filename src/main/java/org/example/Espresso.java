package org.example;

public class Espresso extends Coffee {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public String brew() {
        return "Brewing coffee: " + getName();
    }
}