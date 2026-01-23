package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main(String[] args) {

        int previous = 0;
        int current = 1;

        for (int i = 0; i < 50; i++) {
            int result = previous + current;
            System.out.println("The result is " + result);

            previous = current;
            current = result;
        }
    }
}
