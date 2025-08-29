package javacore.chapter03.loop.exercise;

public class AlphabetPrinter {

    public static void main(String[] args) {

        char letterA = 65;
        char letterZ = 90;

        while(letterA <= letterZ){

            System.out.println("Lettre française " + ": " + letterA);
            letterA++;

        }

        System.out.println();

        char letterLowerA = 'a';
        char letterLowerZ = 'z';
        while (letterLowerA <= letterLowerZ) {

            System.out.println("Lettre française " + ": " + letterLowerA);

            letterLowerA++;
        }

    }
}
