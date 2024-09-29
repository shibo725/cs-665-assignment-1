package org.example;

public class LatteMacchiato extends Coffee {
    public LatteMacchiato() {
        super("Latte Macchiato");
    }

    @Override
    public String brew() {
        return "Brewing coffee: " + getName();
    }
}
