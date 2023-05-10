import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String pseudo;
    private String motDePasse;
    private int idUtilisateur;
    private static int nbUtilisateur;
    private Calendrier monCalendrier;
    private Planning monPlanning;
    private int nbMinTaches;
    private int dureeMinTaches;
    private int cmpEncouragement;

    public Utilisateur(String pseudo, String motDePasse) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.idUtilisateur = ++nbUtilisateur;
        this.monCalendrier = new ArrayList<>();
        this.monPlanning = new ArrayList<>();
        this.nbMinTaches = 0;
        this.dureeMinTaches = 0;
        this.cmpEncouragement = 0;
    }

    public void ajouterTache(Tache tache) {
        monPlanning.add(tache);
    }

    public void afficherEtatRealisation() {
        for (Tache tache : monPlanning) {
            System.out.println("Tâche : " + tache.getNom() + ", État : " + tache.getEtat());
        }
    }

    public void afficherBadges() {
        
    }
}
