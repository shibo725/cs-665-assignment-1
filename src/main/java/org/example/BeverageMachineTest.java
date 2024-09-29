package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class BeverageMachineTest {

    @Test
    public void testBrewCoffee() {
        Beverage coffee = new Coffee("Espresso");
        assertEquals("Brewing coffee: Espresso", coffee.brew());
    }

    @Test
    public void testBrewAmericano() {
        Beverage americano = new Americano();
        assertEquals("Brewing coffee: Americano", americano.brew());
    }

    @Test
    public void testBrewLatteMacchiato() {
        Beverage latte = new LatteMacchiato();
        assertEquals("Brewing coffee: Latte Macchiato", latte.brew());
    }

    @Test
    public void testBrewTea() {
        Beverage tea = new Tea("Green Tea");
        assertEquals("Brewing tea: Green Tea", tea.brew());
    }

    @Test
    public void testBrewBlackTea() {
        Beverage blackTea = new BlackTea();
        assertEquals("Brewing tea: Black Tea", blackTea.brew());
    }

    @Test
    public void testBrewGreenTea() {
        Beverage greenTea = new GreenTea();
        assertEquals("Brewing tea: Green Tea", greenTea.brew());
    }

    @Test
    public void testBrewYellowTea() {
        Beverage yellowTea = new YellowTea();
        assertEquals("Brewing tea: Yellow Tea", yellowTea.brew());
    }

    @Test
    public void testZeroCondiments() {
        Beverage tea = new Tea("Herbal Tea");
        List<Condiment> condiments = Arrays.asList();
        String expected = "Brewing tea: Herbal Tea";
        assertEquals(expected, tea.brew());
    }

    @Test
    public void testMaximumCondiments() {
        Beverage coffee = new Coffee("Cappuccino");
        List<Condiment> condiments = Arrays.asList(
                new Condiment("Milk", 3),
                new Condiment("Sugar", 3)
        );
        String expected = "Brewing coffee: Cappuccino";
        assertEquals(expected, coffee.brew());
    }

    @Test
    public void testCondimentsBoundaryConditions() {
        Beverage coffee = new Coffee("Latte");
        List<Condiment> validCondiments = Arrays.asList(
                new Condiment("Milk", 3),
                new Condiment("Sugar", 3)
        );

        String expected = "Brewing coffee: Latte";
        assertEquals(expected, coffee.brew());

        try {
            List<Condiment> invalidCondiments = Arrays.asList(
                    new Condiment("Milk", 4),
                    new Condiment("Sugar", 2)
            );
            fail("Should throw IllegalArgumentException for exceeding condiment limit.");
        } catch (IllegalArgumentException e) {
            assertEquals("Quantity must be between 0 and 3", e.getMessage());
        }
    }

    @Test
    public void testDifferentTeas() {
        Beverage blackTea = new BlackTea();
        assertEquals("Brewing tea: Black Tea", blackTea.brew());

        Beverage greenTea = new GreenTea();
        assertEquals("Brewing tea: Green Tea", greenTea.brew());

        Beverage yellowTea = new YellowTea();
        assertEquals("Brewing tea: Yellow Tea", yellowTea.brew());
    }

    @Test
    public void testDifferentCoffees() {
        Beverage espresso = new Espresso();
        assertEquals("Brewing coffee: Espresso", espresso.brew());

        Beverage americano = new Americano();
        assertEquals("Brewing coffee: Americano", americano.brew());

        Beverage latte = new LatteMacchiato();
        assertEquals("Brewing coffee: Latte Macchiato", latte.brew());
    }
}

