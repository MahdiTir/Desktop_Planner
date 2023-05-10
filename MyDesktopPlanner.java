import java.util.ArrayList;
import java.util.List;

public class MyDesktopPlanner {
    private List<Utilisateur> listeUtilisateur;

    public MyDesktopPlanner() {
        this.listeUtilisateur = new ArrayList<>();
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        listeUtilisateur.add(utilisateur);
    }

    public void supprimerUtilisateur(Utilisateur utilisateur) {
        listeUtilisateur.remove(utilisateur);
    }

    public Utilisateur authentifier(String nomUtilisateur, String motDePasse) {
        for (Utilisateur utilisateur : listeUtilisateur) {
            if (utilisateur.getNomUtilisateur().equals(nomUtilisateur) && utilisateur.getMotDePasse().equals(motDePasse)) {
                return utilisateur;
            }
        }
        return null; // Exception 
    }
}
