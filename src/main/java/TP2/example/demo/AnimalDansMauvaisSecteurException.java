package TP2.example.demo;

public class AnimalDansMauvaisSecteurException extends Exception {
    public AnimalDansMauvaisSecteurException(String message)
    {
        super(message);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

}
