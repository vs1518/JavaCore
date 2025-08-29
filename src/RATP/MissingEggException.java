package RATP;

public class MissingEggException extends RuntimeException {
    public MissingEggException(String message) {
        super(message);
    }

    public MissingEggException() {
        super("Erreur : œufs manquants ou insuffisants !");
    }
}
