package Modele;


public class Module {
    private int id;
    private String intitule;
    private Enseignant professeur;
    private Filiere filiere;

    public Module() {
    }

    public Module(String intitule, Enseignant professeur, Filiere filiere) {
        this.intitule = intitule;
        this.professeur = professeur;
        this.filiere = filiere;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
