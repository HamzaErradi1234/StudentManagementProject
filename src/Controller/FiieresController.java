package Controller;


import Modele.Enseignant;
import Modele.Filiere;
import Service.DB;

public class FiieresController {

    public static void afficherFiliere(){
        for (Filiere filiere : DB.filieres) {
            System.out.print("intitule est " + filiere.getIntitule());
            System.out.print(" le responsable est : " + filiere.getResponsable());
            System.out.print("  le departement est " +filiere.getDept());
            System.out.println("");
        }
    }

    public static void ajouterFiliere(){

    }
    public static void modifierFiliere(){

    }
    public static void supprimerFiliere(){

    }
}
