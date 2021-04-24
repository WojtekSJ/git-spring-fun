package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Shrims extends AbstractPizza{
    public Shrims(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Shrims";
    }
}
