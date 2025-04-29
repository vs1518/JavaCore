package javacore.chapter02.condition.exercise;

public class AgeBaseDiscount {

    public static void main(String[] args) {

        //Les différentes valeurs que je vais tester après voir écrit le programme :
        //80; 29
        //
        // Le forfait Jeune s'applique pour les 25 ans et moins.
        //
        //Le forfait Senior s'applique pour les 65 ans et plus
        int age = 18;

        //Les differentes valeur que je vais tester après avoir écrit le programme:
        //Forfait Basique : 50€
        //
        //Forfait Jeune : -25% (soit 37,5€) -> montant - (montant * 25 / 100)
        //
        //Forfait Senior : -75% (soit 12,5€) -> montant - (montant * 75 / 100)

        double priceWithoutSoldes = 100;
        double priceForYoungPassenger = priceWithoutSoldes - (priceWithoutSoldes * 25 / 100);
        double priceForOlderPassenger = priceWithoutSoldes - (priceWithoutSoldes * 75/ 100);

        if ( age >= 65 ) {
            System.out.println("Vous êtes éligible à la réduction Senior, vous allez payer " + priceForOlderPassenger + " euros");
        }

        else if ( age <= 25 ) {
            System.out.println("Vous êtes éligible à la réduction Junior, vous allez payer " + priceForYoungPassenger + " euros");
        }

        else {
            System.out.println("Désolé , vous n'êtes pas éligible à la réduction. Vous allez payer le tarif plein " + priceWithoutSoldes + " euros");
        }
    }
}
