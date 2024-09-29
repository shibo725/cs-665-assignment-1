package org.example;

public class GreenTea extends Tea {
    public GreenTea() {
        super("Green Tea");
    }

    @Override
    public String brew() {
        return "Brewing tea: " + getName();
    }
}