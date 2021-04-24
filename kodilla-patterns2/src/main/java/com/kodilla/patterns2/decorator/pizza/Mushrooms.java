package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Mushrooms extends AbstractPizza{
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Mushrooms";
    }
}
