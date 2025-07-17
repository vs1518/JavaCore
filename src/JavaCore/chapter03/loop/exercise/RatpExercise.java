package javacore.chapter03.loop.exercise;

public class RatpExercise {

    public static void main(String[] args) {
        Omelette omelette = new Omelette(3, 10, 1, 1);
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
        if (nombreOeufs > 0 && bolPresente && fourchettePresente) {
            System.out.println("Cassez les œufs dans le bol.");
            if (quantiteSel > 0) {
                System.out.println("Ajoutez le sel.");
            }
            if (quantitePoivre > 0) {
                System.out.println("Ajoutez le poivre.");
            }
        } else {
            System.out.println("Désolé, sans œufs, il n'y a pas d'omelette.");
        }
    }

    public void cuire() {
        if (poelePresente && plaqueDeCuissonPresente) {
            System.out.println("Commencez une cuisson de l'omelette.");
            estCuite = true;
        } else {
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
