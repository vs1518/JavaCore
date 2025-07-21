package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {

    public static void main(String[] args) {

        //GPA = 2
        double studentGPA = 3.6;

        //Income = 60000
        int householdIncome = 45000;

        //Activity = no
        boolean hasExtracurricular = true;

        if (studentGPA > 3.5 && householdIncome < 40000 && hasExtracurricular) {
            System.out.println("You're eligible for the 100% scolarship");

        }

        else if (studentGPA > 3.5 && householdIncome < 60000 && hasExtracurricular) {
            System.out.println("You're eligible for the partial scolarship");
        }

        else {
            System.out.println("You're not eligible for the scolarship");
        }
    }
}
