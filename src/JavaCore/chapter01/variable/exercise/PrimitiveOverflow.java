package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {

    public static void main(String[] args) {

        short hourSeconds = 3600;
        int daySeconds = 24 * 3600;
        int weekSeconds = 7 * daySeconds;
        int monthSeconds = 30 * daySeconds;
        int yearSeconds = 365 * daySeconds;

        System.out.println(hourSeconds);
        System.out.println(daySeconds);
        System.out.println(weekSeconds);
        System.out.println(monthSeconds);
        System.out.println(yearSeconds);


    }

}
