package com.kodilla.patterns.builder.bigmac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacTest() {
        //Given
        Bigmac burger = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BUNSEZAM)
                .sauce(Bigmac.SAUCEBARBECUE)
                .burgers(3)
                .ingredients(Bigmac.INGREDIENTBECON)
                .ingredients(Bigmac.INGREDIENTCHEESE)
                .ingredients(Bigmac.INGREDIENTSHRIM)
                .ingredients(Bigmac.INGREDIENTCUCUMBER)
                .build();

        System.out.println(burger);

        //When
        int howManyIngredients = burger.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}
