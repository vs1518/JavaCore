package javacore.chapter02.condition.exercise;

public class ConditionError {

    public static void main(String[] args) {

        int age = 101;

        if(age <= 16) {

            System.out.println("Vous êtes mineur!");

        }


        else if(age == 17) {

            System.out.println("Vous êtes bientôt majeur!");

        }

            
        else if(age <= 60) {

            System.out.println("Vous êtes majeur et adult");

        }

        else if(age <= 100) {

            System.out.println("Vous n'êtes plus du tout jeune.");

        }

        else {

            System.out.println("Vous êtes une exception dans ce monde !");

        }

    }
}
