package javacore.chapter01.variable.exercise;

public class FirstOperations {
    public static void main(String[] args) {

    int c = 10;
    int d = 8;
    int sum = c + d;

        System.out.println(c += d); // c = c + d;

        System.out.println(d -= 5); // d = d - 5;

        System.out.println(c *= 3); // c = c * 3;

        System.out.println(d /= 3); // d = d / 3;

        System.out.println("La somme de c et d = " + sum);


    int e = 1 * 5 + 2;
    int f = 1 * (5 + 2);
    int g = ((2 * 5) - 2 / (4-2)) -1;

        System.out.println(e + f);
        System.out.println(g);


    }
}
