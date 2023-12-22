package Controller;



import Modele.Enseignant;
import Modele.Etudiant;
import Service.DB;

    public class EtudiantsController {
        public static void afficherMenu(){

        }
        public static void afficherEtudiants(){
            for (Etudiant etudiant : DB.etudiants) {
                System.out.println(" id de etudiant est : " +etudiant.getId());
                System.out.println("le nom est" +etudiant.getNom());
                System.out.println("le prenom est" +etudiant.getPrenom());
                System.out.println("email est" +etudiant.getEmail());
                System.out.println("Apoge est" +etudiant.getApogee());
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
