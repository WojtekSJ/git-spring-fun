package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();
    public static final String BUNREGULAR = "Bun wihout sezam";
    public static final String BUNSEZAM = "Bun with sezam";
    public static final String SAUCESTANDARD = "Sauce: standard";
    public static final String SAUCE1000I = "Sauce: 1000 Islands";
    public static final String SAUCEBARBECUE = "Sauce: barbecue";
    public static final String INGREDIENTSALAT = "Salat";
    public static final String INGREDIENTONION = "Onion";
    public static final String INGREDIENTBECON = "Becon";
    public static final String INGREDIENTCUCUMBER= "Cucumber";
    public static final String INGREDIENTPAPRIK = "Paprik";
    public static final String INGREDIENTMUSHROOMS = "Mushrooms";
    public static final String INGREDIENTSHRIM = "Shrim";
    public static final String INGREDIENTCHEESE = "Cheese";




    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (bun==null||sauce==null||burgers==0) {
                throw new IllegalStateException("There are missing main information about burger!");
        }
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }


    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {

        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "Bun='" + bun + '\'' +
                " " + sauce + '\'' +
                ", burgers number='" + burgers + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

}
