package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test                                                 // [6]
    public void testBasicPizza() {             // [7]
        // Given
        Pizza pizza = new BasicPizza();         // [8]
        // When
        BigDecimal calculatedCost = pizza.getCost();    // [9]
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);   // [10]
    }
    @Test                                                 // [6]
    public void testBasicPizzaCheeseInCorners() {             // [7]
        // Given
        Pizza pizza = new BasicPizza();         // [8]
        pizza = new CheeseInCorners(pizza);
        // When
        BigDecimal calculatedCost = pizza.getCost();    // [9]
        // Then
        assertEquals(new BigDecimal(19), calculatedCost);   // [10]
    }
    @Test                                                 // [6]
    public void testBasicPizzaCheeseInCornersDescription() {             // [7]
        // Given
        Pizza pizza = new BasicPizza();         // [8]
        pizza = new CheeseInCorners(pizza);
        // When
        String description = pizza.getDescription();    // [9]
        // Then
        assertEquals("Ciasto, sos pomidorowy z serem + Cheese in corners", description);   // [10]
    }
    @Test                                                 // [6]
    public void testBasicPizzaAddonsPrice() {             // [7]
        // Given
        Pizza pizza = new BasicPizza();         // [8]
        pizza = new CheeseInCorners(pizza);
        pizza = new AdditionalCheese(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Shrims(pizza);
        // When
        BigDecimal calculatedCost = pizza.getCost();    // [9]
        // Then
        assertEquals(new BigDecimal(32.5), calculatedCost);
    }
    @Test                                                 // [6]
    public void testBasicPizzaAddons() {             // [7]
        // Given
        Pizza pizza = new BasicPizza();         // [8]
        pizza = new CheeseInCorners(pizza);
        pizza = new AdditionalCheese(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Shrims(pizza);
        // When
        String description = pizza.getDescription();    // [9]
        // Then
        assertEquals("Ciasto, sos pomidorowy z serem + Cheese in corners + additional Cheese + Mushrooms + Shrims", description);   // [10]
    }
}
