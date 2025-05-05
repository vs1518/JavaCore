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
        double salary = 200000;
        double deduction = salary * 10 / 100;
        double amountAfterDeduction = salary- (salary * 10 / 100);
        double firstBracket = 0;
        double secondeBracket = ((28797 - 11294) * 11) / 100;
        double thirdBracket = ((82341 - 28797) * 30) / 100;
        double forthBracket = ((177106 - 82341) * 41) / 100;
        double fifthBracket = ((amountAfterDeduction - 177106) * 45) / 100;
        double amountNeedToPay = firstBracket + secondeBracket + thirdBracket + forthBracket + fifthBracket;


        if (amountAfterDeduction > 177106);
        System.out.println("You earn " + salary + " euros per year net. " + "Your first deduction applied to the " +
                "taxable net salary before calculating the income tax is " + deduction +
                " and the amount you need to pays is " + amountNeedToPay);



        
    }
}
