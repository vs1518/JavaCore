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
        int amountPaid = 120;

        int cashChange = amountPaid - totalBill;


        int addingTheDifference = totalBill - amountPaid;

        if (amountPaid > totalBill) {

            System.out.println("Your total bill is " + totalBill + ". You've paid " + amountPaid +
                    ". Your change is " + cashChange);
        }

        else if (amountPaid < totalBill) {

            System.out.println("Your total bill is " + totalBill + ". You've paid " + amountPaid +
                    ". You need to add " + addingTheDifference);
        }

        else if (cashChange % 50 == 1) {

            System.out.println();

        }
        else if (cashChange % 20 == 1) {

        }
        else if (cashChange % 10 == 1) {

        }
        else if (cashChange % 2 == 1) {

        }

        else if (cashChange % 1 == 1) {

        }

        else {

            System.out.println("Your total bill is " + totalBill + ". You've paid " + amountPaid +
                    ". You need nothing to pay.");
        }



    }
}

