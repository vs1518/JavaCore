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
        System.out.println("- " + ingredients.getOrDefault(Ingredient.SEL, 0) + " pincée(s) de sel");
        System.out.println("- " + nbHuile + " cuillère(s) d'huile");
    }

    // Étapes de la recette
    public void casserOeufs() {
        System.out.println("J'ai les ingrédients : des œufs, l'huile d'olive, du sel, et du poivre");
        System.out.println("Cassez les œufs dans un bol.");
    }

    public void battreOeufs() {
        System.out.println("Battez les œufs à la fourchette.");
    }

    public void ajouterSel() {
        System.out.println("Ajoutez le sel.");
    }

    public void ajouterPoivre() {
        System.out.println("Ajoutez le poivre.");
    }

    public void melanger() {
        System.out.println("Je mélange.");
    }

    public void allumerFeu() {
        System.out.println("Allumez le feu.");
    }

    public void poserPoele() {
        System.out.println("Posez la poêle dessus.");
    }

    public void verserHuile() {
        System.out.println("Versez l’huile d’olive dans la poêle.");
    }

    public void attendreHuileChauffe() {
        System.out.println("Attendez que l’huile soit chaude.");
    }

    public void verserOeufs() {
        System.out.println("Versez les œufs battus dans la poêle à feu vif.");
    }

    public void baisserFeu() {
        System.out.println("Baissez le feu dès que les bords commencent à cuire.");
    }

    public void laisserCuire() {
        System.out.println("Laissez cuire.");
    }

    public void ramenerBords() {
        System.out.println("Ramenez les bords cuits de l’omelette vers le centre.");
    }

    public void repeterRamener() {
        System.out.println("Répétez l’action jusqu’à ce que le centre commence à cuire.");
    }

    public void secouerPoele() {
        System.out.println("Secouez la poêle pour éviter que l’omelette ne colle.");
    }

    public void verifierBaveuse() {
        System.out.println("Vérifiez si l’omelette est baveuse.");
    }

    public void verifierCuisson() {
        System.out.println("Vérifiez si l’omelette est cuite.");
    }

    public void plierOmelette() {
        System.out.println("Pliez l’omelette en deux.");
    }

    public void preparerAssiette() {
        System.out.println("Je prépare une assiette tiède.");
    }

    public void deposerDansAssiette() {
        System.out.println("Déposez l’omelette sur une assiette tiède.");
    }

    public void servir() {
        System.out.println("Servez immédiatement.");
    }

    public void preparerOmelette() {
        casserOeufs();
        battreOeufs();
        ajouterSel();
        ajouterPoivre();
        melanger();

        allumerFeu();
        poserPoele();
        verserHuile();
        attendreHuileChauffe();
        verserOeufs();
        baisserFeu();
        laisserCuire();
        ramenerBords();
        repeterRamener();
        secouerPoele();
        verifierBaveuse();
        verifierCuisson();
        plierOmelette();

        preparerAssiette();
        deposerDansAssiette();
        servir();
    }
}
