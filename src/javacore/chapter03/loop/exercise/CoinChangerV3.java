package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args){


        int totalBill = 150;

        //montantPayé
        int amountPaid = 500;

        int cashChange = amountPaid - totalBill;


        if (cashChange < 0) {

            System.out.println("You need to add " + (-cashChange) + " euros for paying for the bill");
        }

        else if (cashChange == 0) {

            System.out.println("You’ve paid enough! There’s nothing more to add or change");
        }

        else {

            System.out.println("You will receive " + cashChange + " euros of change");
        }


        int billet50 = 0;
        int billet20 = 0;
        int billet10 = 0;
        int billet2 = 0;
        int billet1 = 0;

        while (cashChange > 50) {
            billet50++;
            cashChange-=50;
        }

        while (cashChange > 20) {
            billet20++;
            cashChange-=20;
        }

        while (cashChange > 10) {
            billet10++;
            cashChange-=10;
        }

        while (cashChange > 2) {
            billet2++;
            cashChange-=2;
        }

        while (cashChange > 1) {
            billet1++;
            cashChange-=1;
        }


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

            System.out.println("You will receive " + " " + billet2 + "coin(s) of 2" );
        }

        if (billet1 > 0) {

            System.out.println("You will receive " + " " + billet1 + "coin(s) of 1");
        }
    }
}