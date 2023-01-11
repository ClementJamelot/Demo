package TP2.example.demo;

public class LimiteVisiteurExecption extends Exception{

    public LimiteVisiteurExecption(String message)
    {
        super(message);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }



}
