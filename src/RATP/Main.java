package RATP;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Ingredient, Integer> ingredients = new HashMap<>();
        ingredients.put(Ingredient.OEUF, 3);
        ingredients.put(Ingredient.SEL, 1);
        ingredients.put(Ingredient.POIVRE, 1);
        ingredients.put(Ingredient.HUILE, 1);


        Omelette omelette = new Omelette(ingredients);

        try {
            omelette.checkupIngredient();
            omelette.preparerOmelette();
        } catch (MissingEggException e) {
            System.out.println("Recette interrompue : " + e.getMessage());
        }
    }
}
