package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {


    public static void main(String[] args) {

        boolean isHouseEmpty = false;
        boolean isOwnerAsleep = false;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;

        boolean isSafeModeActivated = (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        if (isSafeModeActivated){

            System.out.println("Votre maison est en securité");

        }
        
        else {

            System.out.println("Votre maison non securisé");
        }
    }

}
