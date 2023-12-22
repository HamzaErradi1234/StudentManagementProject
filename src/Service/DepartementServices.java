package Service;

import Modele.Departement;
import Modele.Enseignant;

import java.util.ArrayList;

public class DepartementServices {
    public static Departement ajouterDept(String intitule, Enseignant... responsable){
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setId(DB.getDeptId());
        if (responsable.length > 0){
            departement.setResponsable(responsable[0]);
        }
        DB.departements.add(departement);

        return  departement;
    }
    public static Departement modifierDept(int id , String intitule, Enseignant... responsable){
        for (Departement departement : DB.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (responsable.length > 0){
                    departement.setResponsable(responsable[0]);
                }
                return departement;
            }
        }

        return  new Departement();
    }
    public static ArrayList<Departement>  deleteDeptById(int id){
        DB.departements.remove(getDeptById(id));
        return DB.departements ;
    }

    public static Departement getDeptById(int id){
        for (Departement departement : DB.departements) {
            if (departement.getId() == id) return  departement;
        }
        return  new Departement();
    }

    public static ArrayList<Departement> getAllDept(){

        return  DB.departements;
    }
}
