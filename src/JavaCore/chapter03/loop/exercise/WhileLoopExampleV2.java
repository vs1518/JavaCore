package javacore.chapter03.loop.exercise;

public class WhileLoopExampleV2 {

    public static void main(String[] args) {

        int loopCounter = 1;

        while (loopCounter <= 10){

            System.out.println("Nombre ascendent affiché est " + loopCounter);
            loopCounter++;
        }

        loopCounter = 10;
        while (loopCounter > 0){

            System.out.println("Nombre descendant affiché est " + loopCounter);
            loopCounter--;
        }

        loopCounter = 2;
        while (loopCounter <= 20){
            System.out.println("Nombre pair affiché est " + loopCounter);
            loopCounter = loopCounter + 2;
        }

    }
}
