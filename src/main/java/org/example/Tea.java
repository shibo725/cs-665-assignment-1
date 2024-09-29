package org.example;

public class Tea extends Beverage {
    public Tea(String name) {
        super(name);
    }

    @Override
    public String brew() {
        return "Brewing tea: " + getName();
    }
}
