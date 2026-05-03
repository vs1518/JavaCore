package javacore.chapter03.loop.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

        int hours = 0;
        int minutes = 0;
        int seconds = 0;


        while(true) {

            Thread.sleep(1000);

            seconds++;

            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }

            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
            System.out.println(hours + ":" + minutes + ":" + seconds);
        }

    }
}
