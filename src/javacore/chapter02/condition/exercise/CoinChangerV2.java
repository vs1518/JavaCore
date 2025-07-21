package javacore.chapter02.condition.exercise;

import java.sql.SQLOutput;

public class CoinChangerV2 {

    public static void main(String[] args) {

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

        //Le montant de reçu
        int totalBill = 150;

        //Le montant on paye
        int amountPaid = 186;

        //Сдача(rendu de l'argent)
        int cashChange = amountPaid - totalBill;


        if (cashChange < 0) {

            System.out.println("You need to add " + (-cashChange) + " euros for paying for the bill");
        } else if (cashChange == 0) {

            System.out.println("You’ve paid enough! There’s nothing more to add or change");
        } else {

            System.out.println("You will receive " + cashChange + " euros of change");
        }

        //Le stock de billets et des pieces
        int stock50= 2;
        int stock20= 4;
        int stock10= 6;
        int stock2= 10;
        int stock1= 10;

        //Variables pour le nombre réel de billets/pièces délivrés
        //Переменные для фактического количества выданных купюр/монет
        int give50, give20, give10, give2, give1;

        //On compte chaque billet/pièce
        //Расчёт для каждой деноминации
        //50€
        int need50 = cashChange / 50;  //Combien billet de 50€ , nous avons besoin
        if (need50 <= stock50)        //S'il y a assez de billet dans le stock
            give50 = need50;           //Donc il faut donner la quantité necessaire

        else                           //Sinon
            give50 = stock50;          //Il faut tout donner


        //Maintenant il faut reduire la quantité d'argent dans un stock et mettre à jour le stock
        cashChange -= give50 * 50;      //Reduit la quantité dans un stock
        stock50 = stock50 - give50;     //Met à jour  le stock


        //20€
        int need20 = cashChange / 20;  //Combien billet de 20€ ,nous avons besoin
        if (need20 <= stock20)         //S'il y a assez de billet dans le stock
            give20 = need20;           //Donc il faut donner la quantité necessaire

        else                           //Sinon
            give20 = stock20;           //Il faut tout donner

        //Maintenant il faut reduire la quantité d'argent dans un stock et mettre à jours le stock
        cashChange -= give20 * 20;      //Reduit la quantité dans un stock
        stock20 = stock20 - give20;     //Met à jour  le stock


        //10€
        int need10 = cashChange / 10;  //Combien billet de 20€ ,nous avons besoin
        if (need10 <= stock10)         //S'il y a assez de billet dans le stock
            give10 = need10;           //Donc il faut donner la quantité necessaire

        else                            //Sinon
            give10 = stock10;           //Il faut tout donner

        //Maintenant il faut reduire la quantité d'argent dans un stock et mettre à jours le stock
        cashChange -= give10 * 10;      //Reduit la quantité dans un stock
        stock10 = stock10 - give10;     //Met à jour  le stock


        //2€
        int need2 = cashChange / 2;  //Combien billet de 20€ ,nous avons besoin
        if (need2 <= stock2)         //S'il y a assez de billet dans le stock
            give2 = need2;           //Donc il faut donner la quantité necessaire

        else {                        //Sinon
            give2 = stock2;           //Il faut tout donner

        //Maintenant il faut reduire la quantité d'argent dans un stock et mettre à jours le stock
        cashChange -= give2 * 2;      //Reduit la quantité dans un stock
        stock2 = stock2 - give2;      //Met à jour  le stock


        //1€
        int need1 = cashChange / 1;  //Combien billet de 20€ ,nous avons besoin

        if (need1 <= stock1)         //S'il y a assez de billet dans le stock
            give1 = need1;           //Donc il faut donner la quantité necessaire

        else                          //Sinon
            give1 = stock1;           //Il faut tout donner

        //Maintenant il faut reduire la quantité d'argent dans un stock et mettre à jours le stock
        cashChange -= give1 * 1;      //Reduit la quantité dans un stock
        stock20 = stock1 - give1;     //Met à jour  le stock

            if (cashChange > 0) {      //S'il reste une somme non rendu
                System.out.println("Désolé,impossible de vous rendre une somme entieremment.");
            }

            else {
                if (give50 > 0)
                    System.out.println("Rendu de billets 50€: " + give50);
                    System.out.println("Rendu de billets 20€: " + give20);
                    System.out.println("Rendu de billets 10€: " + give10);
                    System.out.println("Rendu de billets 2€: " + give2);
                    System.out.println("Rendu de billets 1€: " + give1);
            }

        }

    }
}

