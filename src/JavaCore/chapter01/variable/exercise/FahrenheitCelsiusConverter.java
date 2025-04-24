package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {
    public static void main (String[] args) {

        double temperatureInFarenheit = 32;
        double temperatureInCelsius = (temperatureInFarenheit - 32) / 1.8;

        System.out.println(temperatureInFarenheit + "F est égal à " + temperatureInCelsius + "°C" );
    }
}
