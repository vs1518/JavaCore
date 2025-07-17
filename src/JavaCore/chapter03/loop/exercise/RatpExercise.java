package javacore.chapter03.loop.exercise;

public class RatpExercise {

    public static void main(String[] args) {
        Omelette omelette = new Omelette(3, 10, 1, 1);
        System.out.println("J'ai les ingrédients : 3 œufs, 10 ml l'huile d'olive, du sel, et du poivre");
        omelette.preparation();
        omelette.cuire();
        omelette.servir();
    }
}

class Omelette {

    private int nombreOeufs;
    private int quantiteHuileOlive;
    private int quantiteSel;
    private int quantitePoivre;

    private boolean bolPresente = true;
    private boolean assiettePresente = true;
    private boolean poelePresente = true;
    private boolean plaqueDeCuissonPresente = true;
    private boolean fourchettePresente = true;
    private boolean estCuite = false;

    public Omelette(int oeufs, int huile, int sel, int poivre) {
        this.nombreOeufs = oeufs;
        this.quantiteHuileOlive = huile;
        this.quantiteSel = sel;
        this.quantitePoivre = poivre;
    }

    public void preparation() {
        if (nombreOeufs > 0 && bolPresente) {
            System.out.println("Cassez les œufs dans le bol ");

            if (fourchettePresente){
                System.out.println("Battez les œufs à la fourchette");
            }


            if (quantiteSel  > 0 && quantitePoivre > 0) {
                System.out.println("Ajoutez le sel et le poivre et mélangez");

            }

        } else {
            System.out.println("Désolé, sans œufs, il n'y a pas d'omelette.");
        }
    }

    public void cuire() {
        if (plaqueDeCuissonPresente && poelePresente) {
            System.out.println("Allumez le feu et posez la poêle dessus");
        }

        if (quantiteHuileOlive > 0) {
            System.out.println("Versez l’huile d’olive dans la poêle et attendez que l’huile soit chaude");
        }

        //if (quantiteHuileOlive > 0) {
        //    System.out.println("");
         //   estCuite = true;
        //}

        else {
            System.out.println("Impossible de cuire l'omelette sans poêle ou plaque de cuisson.");
        }
    }

    public void servir() {
        if (estCuite && assiettePresente) {
            System.out.println("Si l’omelette est cuite, je la sers dans une assiette.");
        } else {
            System.out.println("L’omelette n’est pas encore cuite, je continue la cuisson.");
        }
    }
}
