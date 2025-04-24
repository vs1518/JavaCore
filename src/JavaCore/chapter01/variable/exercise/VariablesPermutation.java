package javacore.chapter01.variable.exercise;

public class VariablesPermutation {
    public static void main(String[] args) {

        int a = 15;
        int b = 10;

        //je declare une variable permuteVariableA et j'affecte la valeur de b
        int permuteVariableA = b;

        //je declare une variable permuteVariableA et j'affecte la valeur de a
        int permuteVariableB = a;

        //j'affecte la valeur de a à b
        a = b;

        System.out.println( "La valeur a permuté est égal à " + permuteVariableA );

        System.out.println ( "La valeur b permuté est égal à " + permuteVariableB );
    }
}
