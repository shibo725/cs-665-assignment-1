package org.example;
public class Condiment {
    private String type;
    private int quantity;

    public Condiment(String type, int quantity) {
        if (quantity < 0 || quantity > 3) {
            throw new IllegalArgumentException("Quantity must be between 0 and 3");
        }
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}

