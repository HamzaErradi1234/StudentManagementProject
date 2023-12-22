package Service;

import Modele.*;

import java.lang.Module;
import java.util.ArrayList;

public class DB {
    public static int DEPT_ID = 0;
    public static int ENS_ID = 0;
    public static int ETD_ID = 0;
    public static int FIL_ID = 0;
    public static int MOD_ID = 0;
    public static ArrayList<Departement> departements = new ArrayList();
    public static ArrayList<Enseignant> enseignants = new ArrayList();
    public static ArrayList<Filiere> filieres = new ArrayList();
    public static ArrayList<Module> modules = new ArrayList();
    public static ArrayList<Etudiant> etudiants = new ArrayList();
    public static ArrayList<Note> notes = new ArrayList();

    public  static int getDeptId(){
        DEPT_ID++;
        return DEPT_ID;
    }
    public  static int getEnsId(){
        ENS_ID++;
        return ENS_ID;
    }

}

