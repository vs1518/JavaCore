package javacore.chapter03.loop.exercise;

public class HalfPyramid {

    public static void main(String[] args) {
        int numberOfRows = 8;

        for (int i = 1; i <= numberOfRows; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
        }
            System.out.println();
        }
    }
}
