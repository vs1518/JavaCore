package javacore.chapter02.condition.exercise;

public class AgeCategorization {

    public static void main(String[]args) {

        //les différentes valeurs il faut tester
        // 9 ; 21 ; 29 ; 70
        int age = 10;

        //Les différentes catégories d'age suivantes :
        //
        //Enfant : x < 10 ans
        //
        //Adolescent : 10 <= x < 18 ans
        //
        //Jeune adulte : 18 <= x < 25 ans
        //
        //Adulte : 25 <= x < 65 ans
        //
        //Senior : x >= 65 ans

        // Consignes:
        // Il faut implémentez toutes les conditions if / else if / else nécessaires
        // pour indiquer à quelle catégorie appartient la valeur de la variable age.
        if ( age < 10 ) {
            System.out.println( "Vous êtes un enfant, car vous vous avez " + age );
        }

        else if ( age >= 10 && age < 18 ) {
            System.out.println( "Vous êtes un adolescent, car vous avez " + age );
        }

        else if ( age >= 18 && age < 25 ) {
            System.out.println( "Vous êtes un jeune adulte, car vous avez " + age );
        }


        else if ( age >= 25 && age < 65 ) {
            System.out.println( "Vous êtes un adult, car vous avez " + age );
        }


        else {
            System.out.println( "Vous êtes un senior, car vous avez " + age ) ;
        }

    }
}
