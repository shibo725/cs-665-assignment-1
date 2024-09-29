package org.example;

public class Coffee extends Beverage {
    public Coffee(String name) {
        super(name);
    }

    @Override
    public String brew() {
        return "Brewing coffee: " + getName();
    }
}