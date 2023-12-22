package Controller;


import Modele.Enseignant;
import Service.DB;

    public class EnseignantController {

        public static void afficherMenu(){

        }
        public static void afficherEnseignants(){
            for (Enseignant enseignant : DB.enseignants) {
                System.out.print("Id est " + enseignant.getId());
                System.out.print(" Nom et prenom : " + enseignant.getNom() + " " + enseignant.getPrenom());
                System.out.print("  Email est " + enseignant.getEmail() );
                System.out.println("");
            }
        }
        public static void ajouterEnseignant(){

        }
        public static void modifierEnseignant(){

        }
        public static void supprimerEnseignant(){

        }


}
