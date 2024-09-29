package org.example;

public class BlackTea extends Tea {
    public BlackTea() {
        super("Black Tea");
    }

    @Override
    public String brew() {
        return "Brewing tea: " + getName();
    }
}
