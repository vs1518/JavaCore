package RATP;

import java.util.Map;

public class Omelette {

    private Map<Ingredient, Integer> ingredients;

    public Omelette(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public void checkupIngredient() throws MissingEggException {
        int nbOeufs = ingredients.getOrDefault(Ingredient.OEUF, 0);
        int nbHuile = ingredients.getOrDefault(Ingredient.HUILE, 0);

        if (nbOeufs < 2) {
            System.out.println("On ne fait pas une omelette sans casser des œufs.");
            throw new MissingEggException();
        }

        if (nbHuile < 1) {
            System.out.println("Il manque de l'huile. Il faut au moins une cuillère.");
        }

        System.out.println("Ingrédients suffisants :");
        System.out.println("- " + nbOeufs + " œufs");
        System.out.println("- " + ingredients.getOrDefault(Ingredient.SEL, 0) + " pincée de sel");
        System.out.println("- " + ingredients.getOrDefault(Ingredient.POIVRE, 0) + " pincée de poivre");
        System.out.println("- " + nbHuile + " cuillère d'huile");
    }

    public void casserOeufs() {
        System.out.println("Casser les œufs dans un bol.");
    }

    public void ajouterSel() {
        System.out.println("Ajouter une pincée de sel.");
    }

    public void ajouterPoivre() {
        System.out.println("Ajouter une pincée de poivre.");
    }

    public void battreOeufs() {
        System.out.println("Battre les œufs avec le sel.");
    }

    public void chaufferPoele() {
        System.out.println("Chauffer la poêle avec un peu d'huile.");
    }

    public void verserDansPoele() {
        System.out.println("Verser les œufs battus dans la poêle chaude.");
    }

    public void cuire() {
        System.out.println("Cuire à feu moyen jusqu'à ce que l'omelette soit dorée.");
    }

    public void servir() {
        System.out.println("Servir l'omelette chaude.");
    }

    public void preparerOmelette() {
        casserOeufs();
        ajouterSel();
        ajouterPoivre();
        battreOeufs();
        chaufferPoele();
        verserDansPoele();
        cuire();
        servir();
    }
}
