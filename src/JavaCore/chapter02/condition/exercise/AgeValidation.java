package javacore.chapter02.condition.exercise;

public class AgeValidation {

    public static void main(String[] args) {

        // Déclaration des variables
        short birthDay = 18;
        short birthMonth = 8;
        short birthYear = 2007;

        short currentDay = 25;
        short currentMonth = 2;
        short currentYear = 2025;

        final int legal_majority_age = 18;
        int majorityYear = currentYear - legal_majority_age;

        // Tableau des noms de mois
        String[] mois = {
                "invalide", "janvier", "février", "mars", "avril", "mai", "juin",
                "juillet", "août", "septembre", "octobre", "novembre", "décembre"
        };

        if (birthYear < majorityYear) {

            System.out.println("Vous êtes majeur, né en " + birthYear);

        }
        else if (birthYear > majorityYear) {

            System.out.println("Vous n'êtes pas encore majeur, né en " + birthYear);

        }

        // birthYear == majorityYear
        else {

            if (birthMonth < currentMonth || (birthMonth == currentMonth && birthDay <= currentDay)) {

                System.out.println("Vous avez 18 ans, né le " + birthDay + " " + mois[birthMonth] + " " + birthYear);

            }

            else {

                System.out.println("Vous n'êtes pas encore majeur, vous êtes né le " + birthDay + " " + mois[birthMonth] + " " + birthYear);

            }
        }
    }
}
