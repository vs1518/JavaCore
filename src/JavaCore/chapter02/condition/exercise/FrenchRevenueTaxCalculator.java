package JavaCore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[]args) {
        // *IR* - impots sur le revenu
        //1. De 0€ à 11.294€ _______ : 0%
        //
        //2. De 11.295€ à 28.797€ __ : 11%
        //
        //3. De 28.798€ à 82.341€ _ : 30%
        //
        //4. De 82.342€ à 177.106€ _ : 41%
        //
        //5. Supérieur à 177.106€ ___ : 45%

        //les différentes valeurs à testez:
        // *10 000*;
        // *20 000* ;
        // 1 tranche  (0€ ->11.294€) est pleine : 0% implique 0€ d'impôt.
        // 2-eme tranche (11.295€ - > 28.797€) correspond à 8.706€ soit 20.000€ - 11.294€
        // *IR = 11% de 8.706€ = 957€
        // *40 000* ; 1 tranche  (0€ ->11.294€) est pleine : 0% implique 0€ d'impôt.
        // 2-eme tranche (11.295€ - > 28.797€) correspond à 17.502€ soit 28.797€ - 11.294€
        // *IR = 11% de 17.503€ = 1925€.
        // 3-eme tranche (28.798€ - > 82.341€) correspond à 11.202€ soit 40.000€ - 28.798€
        // *IR = 30% de 11.202€ = 3360€
        // Montant total : 0€ + 1925€ + 3360€ = 5285€
        // *75 000* ;
        // *200 000*
        //
        //*Calculez le % que représente le montant total d'Impôts sur le Revenu par rapport au salaire donné
        //
        //*Ajouter l'abattement de 10%

        // Déclaration des constantes (final)
        final int TRANCHE_4_MAX = 177106;
        final int TRANCHE_3_MAX = 82341;
        final int TRANCHE_2_MAX = 28797;
        final int TRANCHE_1_MAX = 11294;


        double salary = 200000;
        double salaryNetImposable = salary- (salary * 10 / 100);
        double tax = 0;


        if (salaryNetImposable > TRANCHE_4_MAX) {
            double differenceBetween = salaryNetImposable - TRANCHE_4_MAX;
            tax += differenceBetween * 0.45;
            salaryNetImposable -= differenceBetween;

        }

        if (salaryNetImposable > TRANCHE_3_MAX ) {
            double differenceBetween = salaryNetImposable - TRANCHE_3_MAX ;
            tax += differenceBetween * 0.41;
            salaryNetImposable -= differenceBetween;
        }

        if (salaryNetImposable > TRANCHE_2_MAX) {
            double differenceBetween = salaryNetImposable - TRANCHE_2_MAX;
            tax += differenceBetween * 0.30;
            salaryNetImposable -= differenceBetween;
        }

        if (salaryNetImposable > TRANCHE_1_MAX) {
            double differenceBetween = salaryNetImposable - TRANCHE_1_MAX;
            tax += differenceBetween * 0.11;
            salaryNetImposable -= differenceBetween;
        }

        double taxRate = tax * 100 / salary;

        System.out.println("Impot est égal " + tax + " euros." + "  Le montant total d'Impôts sur le Revenu par " +
                "rapport au salaire donné est " + taxRate + "%");
    }
}
