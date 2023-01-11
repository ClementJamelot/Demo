package TP2.example.demo;

public class Animal {
    protected String nomAnimal;
    protected TypeAnimal typeAnimal;


    public void Animal(String nomAnimal,TypeAnimal typeAnimal)
    {
        this.nomAnimal=nomAnimal;
        this.typeAnimal=typeAnimal;
    }
    public String getNomAnimal()
    {
        return nomAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
}
