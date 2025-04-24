package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {
    public static void main (String[] args) {

        double temperatureInCelsius = 100;
        double temperatureInFahrenheit = (temperatureInCelsius * 1.8) + 32 ;

        System.out.println(temperatureInCelsius + "°C est égal à " + temperatureInFahrenheit + "F");

    }
    }
