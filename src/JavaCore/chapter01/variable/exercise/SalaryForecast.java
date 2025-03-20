package JavaCore.chapter01.variable.exercise;

public class SalaryForecast {
    public static void main (String[] args) {

        //Le salaire brut journalier.
        double montantBrutPourUneHeure = 25;
        double quantiteHeuresParJour = 7.7;
        double heuresParSemaine = 38.5;
        short  unMoisEnSemaines = 4;
        short quantiteDesMoisEnAn = 12;

        //Solution

        //Le salaire brut journalier.
        double brutParJour = quantiteHeuresParJour * montantBrutPourUneHeure;

        //Le salaire brut par semaine
        double brutParSemaine = heuresParSemaine * montantBrutPourUneHeure;

        //Le salaire brut mensuel
        double brutMensuel = brutParSemaine * unMoisEnSemaines;

        //Le salaire brut annuel
        double brutAnnuel = brutMensuel * quantiteDesMoisEnAn;

        //Le salaire net imposable mensuel.  TauxParMoisImposble = TauxParMoisImposble - (TauxParMoisImposble * 25 / 100)
        double salaireNetImposableMensuel = brutMensuel - (brutMensuel * 25 / 100);

        //Le salaire net imposable annuel.
        double salaireNetImposableAnnuel = salaireNetImposableMensuel * 12;

        //Le salaire net mensuel, après impôt sur le revenu.
        double salaireNetMensuelApresImpotSurLeRevenu = salaireNetImposableMensuel - (salaireNetImposableMensuel * 10.5 / 100);

        //Le salaire net annuel, après impôt sur le revenu. TauxAnnuelApresImpot = TauxAnnuelImposable * 10.5
        double salaireNetAnnuelApresImpotSurLeRevenu = salaireNetImposableAnnuel - (salaireNetImposableAnnuel * 10.5 / 100);

        System.out.println("brut Par Jour " + "est " + "égal " + "à " + brutParJour);
        System.out.println("brut Par Semaine " + "est " + "égal " + "à " + brutParSemaine);
        System.out.println("brut Mensuel " + "est " + "égal " + "à " + brutMensuel);
        System.out.println("brut Annuel " + "est " + "égal " + "à " + brutAnnuel);
        System.out.println("salaire Net Imposable Mensuel " + "est " + "égal " + "à " + salaireNetImposableMensuel );
        System.out.println("salaire Net Imposable Annuel " + "est " + "égal " + "à " + salaireNetImposableAnnuel);
        System.out.println("salaire Net Mensuel Apres Impot Sur Le Revenu " + "est " + "égal " + "à " + salaireNetMensuelApresImpotSurLeRevenu);
        System.out.println("salaire Net Annuel Apres Impot Sur Le Revenu " + "est " + "égal " + "à " + salaireNetAnnuelApresImpotSurLeRevenu);

    }
}
