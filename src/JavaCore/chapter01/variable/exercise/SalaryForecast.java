package javacore.chapter01.variable.exercise;

public class SalaryForecast {
    public static void main (String[] args) {

        //Le salaire brut journalier.
        double montantPourUneHeure = 25;
        double a = montantPourUneHeure - (montantPourUneHeure * 25 / 100);
        double quantiteHeuresParJour = 7.7;
        double heuresParSemaine = 38.5;
        double  unMoisEnSemaine = 4;

        //Le salaire brut journalier.
        System.out.println("Le montant par l'heure net est "+ a);

        //Le salaire brut journalier.
        System.out.println( "Le montant par jour net est "+ (montantPourUneHeure - (montantPourUneHeure * 25 / 100)) * quantiteHeuresParJour);

        //Le salaire brut hebdomadaire.
        System.out.println();
        //
        //Le salaire brut mensuel.
        //
        //Le salaire brut annuel.
        //
        //Le salaire net imposable mensuel.
        //
        //Le salaire net imposable annuel.
        //
        //Le salaire net mensuel, après impôt sur le revenu.
        //
        //Le salaire net annuel, après impôt sur le revenu.
    }
}
