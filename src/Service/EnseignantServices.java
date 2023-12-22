package Service;

import Modele.Enseignant;
import Modele.Departement;
import java.util.ArrayList;

public class EnseignantServices {

    public static Enseignant ajouterEns(String nom, String prenom, String email, String grade, Departement dept){
        return  new Enseignant();
    }

    public static Enseignant modifierEns(int id, String nom, String prenom, String email, String grade, Departement dept){
        return  new Enseignant();
    }
    public static ArrayList<Enseignant> deleteEnsById(int id){
        return  DB.enseignants;
    }

    public static Enseignant getEnsById(int id){
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEns(){
        return  DB.enseignants;
    }

}

