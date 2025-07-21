package javacore.chapter02.condition.exercise;

public class ConditionToTernary {

    /**
     * single line solution
     * Remplacez la condition if / else par un opérateur ternaire.
     * Le comportement du programme doit rester inchangé après votre modification : pour un enfant (moins de 18 ans),
     * la réduction est de 50 %, sinon, elle est de 10 %.
     * */

    public static void main(String[] args) {

        /**
         * Le code doit s'adapter aux différentes valeurs que vous mettrez à la variable age.
         */
        Integer age = 21;

        Integer pourcentageReduction = age < 18 ? 50 : 10;


        System.out.println("La réduction appliquée est de " + pourcentageReduction + "% car l'utilisateur est agé de " + age + " ans");

    }
}
