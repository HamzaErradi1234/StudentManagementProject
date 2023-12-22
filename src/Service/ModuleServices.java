package Service;

public class ModuleServices {
    String intitule ;
    FiliereServices filiere ;
    EnseignantServices professeur;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public FiliereServices getFiliere() {
        return filiere;
    }

    public void setFiliere(FiliereServices filiere) {
        this.filiere = filiere;
    }

    public EnseignantServices getProfesseur() {
        return professeur;
    }

    public void setProfesseur(EnseignantServices professeur) {
        this.professeur = professeur;
    }

    public ModuleServices() {
    }

    public ModuleServices(String intitule, FiliereServices filiere, EnseignantServices professeur) {
        this.intitule = intitule;
        this.filiere = filiere;
        this.professeur = professeur;
    }
}

