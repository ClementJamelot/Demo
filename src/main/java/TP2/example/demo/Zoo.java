package TP2.example.demo;

import org.springframework.http.server.DelegatingServerHttpResponse;

import java.util.ArrayList;

public class Zoo {
    protected int visiteur=0;
    protected ArrayList<Secteur> secteurAnimaux = new ArrayList<>();
    protected int nbvisiteurMaxParSecteur = 15;

    public void ajouterSecteur(TypeAnimal o)
    {
        secteurAnimaux.add( new Secteur(o));
    }
    public void nouveauVisiteur() throws LimiteVisiteurExecption {
        if(1==visiteur)throw new LimiteVisiteurExecption( "Nombre de Visiteur trop élevé");

        visiteur++;

    }
    public int getLimiteVisiteur()
    {
        return nbvisiteurMaxParSecteur;
    }
    public void nouvelAnimal(Animal o) throws AnimalDansMauvaisSecteurException {

        for( Secteur s :secteurAnimaux)
        {
            if( s.typeAnimauxDansSecteur == o.getTypeAnimal())
            {
                s.ajouterAnimal(o);
                return;
            }
        }
        ajouterSecteur(o.typeAnimal);
        for( Secteur s :secteurAnimaux)
        {
            if( s.typeAnimauxDansSecteur == o.getTypeAnimal())
            {
                s.ajouterAnimal(o);
                return;
            }
        }


    }
    public int nombreAnimaux()
    {
        return 1;
    }
}
