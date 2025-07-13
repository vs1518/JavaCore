package javacore.chapter02.condition.exercise;

public class AgeValidation {

public static void main(String[] args) {

    //Declaration des variables de type short
    short birthDay = 18;
    short birthMonth = 8;
    short birthYear = 2007;

    short currentDay = 20;
    short currentMonth = 1;
    short currentYear = 2025;

    //Tableau des noms de mois
    String[] mois = {
            "invalide", "janvier", "février", "mars", "avril", "mai", "juin",
            "juillet", "août", "septembre", "octobre", "novembre", "décembre"
    };

    if (birthYear < currentYear - 18){

        System.out.println("Vous avez plus que 18 ans et vous êtes né avant " + birthYear);

    }

    else if (birthYear == currentYear - 18) {

        if (birthMonth < currentMonth) {

            System.out.println("Vous avez 18 ans et vous êtes né avant " + mois[currentMonth]);

        }

        else if (birthMonth == currentMonth){

            if (birthDay <= currentDay) {

                System.out.println("Vous avez 18 ans et vous êtes né le " + birthDay + " " + mois[birthMonth] + " " + birthYear );

            }

            else {

                System.out.println("Vous n'êtes pas encore majeur, vous aurez 18 ans dans quelques jours");

            }

        }
        else {

            System.out.println("Vous n'êtes pas encore majeur. Date de naissance : " + mois[birthMonth] + " " + birthYear + ". Mois actuel : " + mois[currentMonth] + " " + currentYear + ".");

        }

    }

    else {

        System.out.println("Vous n'êtes pas encore majeur, vous êtes né" + birthYear);

    }

}

}
