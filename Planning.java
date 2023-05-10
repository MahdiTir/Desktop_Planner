import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Planning {
    private List<Creneau> listeCreneaux;
    private List<Tache> listeTaches;
    private List<Projet> listeProjets;
    private Date dateDebut;
    private Date dateFin;

    public Planning() {
        this.listeCreneaux = new ArrayList<>();
        this.listeTaches = new ArrayList<>();
        this.listeProjets = new ArrayList<>();
        this.dateDebut = null;
        this.dateFin = null;
    }

    public void fixerPeriode(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public void fixerCreneaux(List<Creneau> creneaux) {
        this.listeCreneaux = creneaux;
    }

    public void planifierTache(Tache tache, Creneau creneau) {
        creneau.ajouterTache(tache);
        listeTaches.add(tache);
    }

    public void planifierTaches(List<Tache> taches, Creneau creneau) {
        for (Tache tache : taches) {
            creneau.ajouterTache(tache);
            listeTaches.add(tache);
        }
    }

    public void miseAJourPlanning() {
        // Méthode pour mettre à jour le planning en fonction des tâches et projets
    }

    public List<Creneau> getListeCreneaux() {
        return listeCreneaux;
    }

    public List<Tache> getListeTaches() {
        return listeTaches;
    }

    public List<Projet> getListeProjets() {
        return listeProjets;
    }
}

