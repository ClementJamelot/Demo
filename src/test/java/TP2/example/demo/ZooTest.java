package TP2.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {



    @Test
    void TestLimiteVisiteur() throws AnimalDansMauvaisSecteurException {
        Zoo zoo = new Zoo();

        LimiteVisiteurExecption e = assertThrows(LimiteVisiteurExecption.class , () -> {

            int i=0;
            for(i=0;i<16;i++)
            {
                zoo.nouveauVisiteur();
            }


        });


        assertEquals("Nombre de Visiteur trop élevé",e.getMessage());
        zoo.ajouterSecteur(TypeAnimal.Chien);
        zoo.nouvelAnimal(new Chien("po",TypeAnimal.Chien));


        for(Secteur s: zoo.secteurAnimaux)
        {
            if(s.typeAnimauxDansSecteur==TypeAnimal.Chien)
                for(Animal o : s.animauxDansSecteur)
                {
                    assertEquals("po",o.getNomAnimal());
                }
        }


    }


}