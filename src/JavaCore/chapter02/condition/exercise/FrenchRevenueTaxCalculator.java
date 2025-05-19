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
        final int TAX_41_PERCENT_LIMIT_FRANCE = 177106;
        final int TAX_30_PERCENT_LIMIT_FRANCE = 82341;
        final int TAX_11_PERCENT_LIMIT_FRANCE = 28797;
        final int TAX_FREE_LIMIT_FRANCE = 11294;


        double salary = 200000;
        double salaryNetImposable = salary - (salary * 10 / 100);
        double tax = 0;


        if (salaryNetImposable > TAX_41_PERCENT_LIMIT_FRANCE) {
            double differenceBetween = salaryNetImposable - TAX_41_PERCENT_LIMIT_FRANCE;
            tax += differenceBetween * 0.45;
            salaryNetImposable -= differenceBetween;
        }

        if (salaryNetImposable > TAX_30_PERCENT_LIMIT_FRANCE ) {
            double differenceBetween = salaryNetImposable - TAX_30_PERCENT_LIMIT_FRANCE ;
            tax += differenceBetween * 0.41;
            salaryNetImposable -= differenceBetween;
        }

        if (salaryNetImposable > TAX_11_PERCENT_LIMIT_FRANCE) {
            double differenceBetween = salaryNetImposable - TAX_11_PERCENT_LIMIT_FRANCE;
            tax += differenceBetween * 0.30;
            salaryNetImposable -= differenceBetween;
        }

        if (salaryNetImposable > TAX_FREE_LIMIT_FRANCE) {
            double differenceBetween = salaryNetImposable - TAX_FREE_LIMIT_FRANCE;
            tax += differenceBetween * 0.11;
            salaryNetImposable -= differenceBetween;
        }

        double taxRate = tax * 100 / salary;

        System.out.println("Impot est égal " + tax + " euros." + "  Le montant total d'Impôts sur le Revenu par " +
                "rapport au salaire donné est " + taxRate + "%");
    }
}
