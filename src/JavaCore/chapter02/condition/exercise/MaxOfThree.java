package JavaCore.chapter02.condition.exercise;

public class MaxOfThree {

    //Consignes :
    //
    //Déclarez trois variables de type int nommée a, b et c et initialisez-les avec
    // les nombres entier de votre choix.
    //
    //
    //Implémentez toutes les conditions if / else if / else nécessaires pour déterminer
    // et afficher laquelle des trois valeurs est la plus grande.
    //
    //
    //Testez votre programme en changeant les valeurs de a, b et c avec des essais pertinents.
    //
    //
    //BONUS [⭐⭐⭐] : Ajoutez les conditions nécessaires, là où vous le jugerez le plus pertinent, pour que le
    // programme affiche une erreur (avec System.err.println au lieu de System.out.println) si des valeurs sont égales.


    public static void main(String[] args) {

        int a = 21;
        int b = 11;
        int c = 19;

        if (a > b && a > c) {
            System.out.println("La plus grande valeur est a : " + a);
        }

        else if (b > a && b > c) {
            System.out.println("La plus grande valeur est b : " + b);
        }

        else if (c > a &&  c > b) {
            System.out.println("La plus grande valeur est c : " + c);
        }

        else {
            System.out.println("Il y a des valeurs égales, impossible determiner la plus grande");
        }
    }
}
