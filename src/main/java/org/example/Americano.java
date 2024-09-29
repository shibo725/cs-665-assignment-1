package org.example;


public class Americano extends Coffee{
    public Americano() {
        super("Americano");
    }

    @Override
    public String brew() {
        return "Brewing coffee: " + getName();
    }
}