package javacore.chapter03.loop.exercise;

import org.w3c.dom.ls.LSOutput;

public class ForLoopExample {

    public static void main(String[] args) {

        // 1) Afficher les nombres de 1 à 10 (ordre croissant)
        System.out.println("L'ordre croissant: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        // 2) Afficher les nombres de 10 à 1 (ordre décroissant)
        System.out.println("L'ordre decroissant: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }
        System.out.println();

        // 3) Affichez l'alphabet
        System.out.println("L'ordre alphabet de A à Z : ");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // pour passer à la ligne après

        // 5) Calculer la factorielle d'un nombre n
        System.out.println();
        int n = 4;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
            System.out.println("La factoriel de " + n + " est " + fact);
    }
}
