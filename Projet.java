import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private String description;
    private static int nbProjet;
    private int idProjet;
    private List<Tache> listeTaches;
    private String etatRealisation;

    public Projet(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.idProjet = ++nbProjet;
        this.listeTaches = new ArrayList<>();
        this.etatRealisation = "Non réalisé";
    }

    public void ajouterTache(Tache tache) {
        listeTaches.add(tache);
    }

    
}
