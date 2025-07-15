package javacore.chapter02.condition.exercise;

public class FlightReservationValidator {

    public static void main(String []args) {

        boolean isLoggedIn = true;       //Connexion d'utilisateur

        int age = 25;                    //Age d'utilisateur

        int planeSeatAvailable = 40;          //Nombres des places disponible dans l'avion

        boolean isPremiumMember = true;  //Est-ce que l'utilisateur est un membre VIP

        boolean isVipFlight = true;      //Est-ce que le vol est réservé aux VIP?

        boolean isFlightLowcost = true;  //Est-ce que le vol est pas cher?

        boolean isBagageIncluded = true;  //Est-ce que un bagage est inclus?


         //Est-ce que l'utilisateur est connecté ou pas?
        if (!isLoggedIn){

            System.out.println("Il faut connecter, s'il vous plaît!");
            
        }

        //Est- ce que l'utilisateur au moins 18 ans?
        else if (age < 18){

            System.out.println("Il faut avoir au moins 18 ans pour réserver le vol!");

        }

        //Est-ce que l'avoin a des places
        else if (planeSeatAvailable <= 0){

            System.out.println("Il n'y a pas des places disponibles!");

        }

        //Est-ce que le vol est un VIP , pour un membre Premium?
        else if (isVipFlight && isPremiumMember){

            System.out.println("Réservation est effectuée avec un succès pour un vol VIP, pour un membre Premium!");
            planeSeatAvailable--;
        }

        //Est-ce que le vol non VIP, pour un membre Premium et avec un bagage en plus?
        else if (!isVipFlight && isPremiumMember){

            System.out.println("Réservation est effectuée avec succès pour un membre Premium avec un bagage en plus!");
            planeSeatAvailable--;

        }

        //Est-ce que le vol est pas cher et sans bagage inclus
        else if (isFlightLowcost && !isBagageIncluded){

            System.out.println("Réservation est effectuée avec succès pour un vol de lowcost sans bagage!");
            planeSeatAvailable--;

        }

        //Cas générales
        else if (!isVipFlight) {
            System.out.println("Réservation effectuée avec succès!");
            planeSeatAvailable--;

        }

        //Autre cas
        else {

            System.out.println("Réservation impossible, ressayez la prochaine fois");

        }










    }
}
