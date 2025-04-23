package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {
    public static void main (String[] args) {

        double temperatureEnFarenheit = 32;
        double temperatureEnCelsius = (temperatureEnFarenheit - 32) / 1.8;

        System.out.println(temperatureEnFarenheit + "F est égal à " + temperatureEnCelsius + "°C" );
    }
}