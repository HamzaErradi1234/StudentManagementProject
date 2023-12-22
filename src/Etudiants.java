import java.sql.Array;
import java.util.ArrayList;

public class Etudiants {
    private static  int id;
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private String filiere;
    ArrayList<Double> notes = new ArrayList<>();



    public Etudiants() {
    }

    public Etudiants(String nom, String prenom, String email, int apogee, String filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.apogee = apogee;
        this.filiere = filiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public Array getNotes() {
        return (Array) notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
