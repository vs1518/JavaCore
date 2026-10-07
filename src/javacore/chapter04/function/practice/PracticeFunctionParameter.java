package javacore.chapter04.function.practice;

public class PracticeFunctionParameter {
    public static void main(String[] args) {

        displaySection(1, "Contenu personnalisé de la section 1");

        System.out.println();

        displaySection(2, "mmmmmmmmmmmmmmm");

        System.out.println();

        displaySection(3, "vvvvvvvvvvvvvvvv");

    }

    public static void displaySection(int sectionNumber, String sectionContent)  {

        System.out.println("-- Debut de la section " + sectionNumber);
        displaySeparator();
        System.out.println("-- " + sectionContent);
        displaySeparator();
        System.out.println("-- Fin de la section " + sectionNumber);

    }

    public static void displaySeparator(){
        System.out.println("------");
    }

}
