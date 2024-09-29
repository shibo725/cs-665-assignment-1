package org.example;


public class YellowTea extends Tea {
    public YellowTea() {
        super("Yellow Tea");
    }

    @Override
    public String brew() {
        return "Brewing tea: " + getName();
    }
}
