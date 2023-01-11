package TP2.example.demo;

import java.util.ArrayList;

public class Secteur {
    protected TypeAnimal typeAnimauxDansSecteur;
    protected ArrayList<Animal> animauxDansSecteur = new ArrayList<>();

    public Secteur(TypeAnimal o)
    {
        typeAnimauxDansSecteur=o;
    }

    public void ajouterAnimal(Animal o) throws AnimalDansMauvaisSecteurException {
        if(o.getTypeAnimal()==typeAnimauxDansSecteur)
        {
            animauxDansSecteur.add(o);
        }
        else {
            throw new AnimalDansMauvaisSecteurException("Animal dans mauvais Secteur");
        }

    }

    public int getNombreAnimaux()
    {
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType()
    {
        return typeAnimauxDansSecteur;
    }
}
