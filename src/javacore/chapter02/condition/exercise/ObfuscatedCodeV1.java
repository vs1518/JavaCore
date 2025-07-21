package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int typeDeVehicule = 2; // Type de véhicule (1 = petite voiture 2 = moyenne voiture, 3 = grande voiture)

        double distance = 100; // Distance

        boolean voitureElectrique = true;
        double reduction = 0.03;

        double taux = 0;

        if (typeDeVehicule == 1) {
            taux = distance * 0.10;
        }
        if (typeDeVehicule == 2) {
            taux = distance * 0.20;
        }
        if (typeDeVehicule == 3) {
            taux = distance * 0.35;
        }
        if (voitureElectrique) {
            taux = taux - (distance * reduction);
        }

        System.out.println("Vous payez pour votre voiture : " + taux + "€");

    }
}
