    package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main(String[] args) {

        //boucle extérieure de 1 à 9 (numeroTable)
        for (int numeroTable = 1; numeroTable <= 9; numeroTable++) {

            System.out.print("Table de " + numeroTable + " : ");

            //boucle intérieure de 1 à 9 (multiplicateur)
        for (int multiplicateur = 1; multiplicateur <= 9; multiplicateur++) {

            int resultat = numeroTable * multiplicateur;
            System.out.print(resultat + " ");
        }
            System.out.println();
        }
    }
}
