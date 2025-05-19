package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main(String[] args){

        //Le montant payé sera forcément un nombre entier (et donc sans virgule).
        //
        //La machine ne peut rendre que les coupures suivantes :
        //
        //Billet de 50€
        //
        //Billet de 20€
        //
        //Billet de 10€
        //
        //Pièce de 2€
        //
        //Pièce de 1€

        //factureTotal
        //Valeurs à tester -> 30 ; 65 ; 88
        int totalBill = 105;

        //montantPayé
        int amountPaid = 208;

        int cashChange = amountPaid - totalBill;

        if (cashChange < 0) {

            System.out.println("You need to add " + (-cashChange) + " euros for paying for the bill");
        }

        else if (cashChange > 0) {

            System.out.println("You will receive " + (cashChange) + " euros of change");
        }

        else {

            System.out.println("You’ve paid enough! There’s nothing more to add or change");
        }

        int billet = 0;

        int billet50 = cashChange / 50;
        cashChange = cashChange % 50;

        int billet20 = cashChange / 20;
        cashChange = cashChange % 20;


        int billet10 = cashChange / 10;
        cashChange = cashChange % 10;

        int billet2 = cashChange / 2;
        cashChange = cashChange % 2;

        int billet1 = cashChange / 1;
        cashChange = cashChange % 1;

        if (billet50 > 0) {

            System.out.println("You will receive " + " " + billet50 + "paper(s) of 50" );
        }

        if (billet20 > 0) {

            System.out.println("You will receive " + " " + billet20 + "paper(s) of 20" );
        }

        if (billet10 > 0) {

            System.out.println("You will receive " + " " + billet10 + "paper(s) of 10" );
        }

        if (billet2 > 0) {

            System.out.println("You will receive " + " " + billet1 + "coin(s)" );
        }

        if (billet1 > 0) {

            System.out.println("You will receive " + " " + billet1 + "coin(s)" );
        }

    }
}

