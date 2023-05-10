import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Creneau {
    private Date dateCreneau;
    private String heureDebut;
    private String heureFin;
    private int dureeMinimale;
    private String etat;
    private List<Tache> listeTaches;

    public Creneau(Date dateCreneau, String heureDebut, String heureFin, int dureeMinimale) {
        this.dateCreneau = dateCreneau;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.dureeMinimale = dureeMinimale;
        this.etat = "libre";
        this.listeTaches = new ArrayList<>();
    }

    public void ajouterTache(Tache tache) {
        listeTaches.add(tache);
    }

    
}
