public class Tache {
    private static int nbTache;
    protected int idTache;
    protected String nom;
    protected int priorite;
    protected String dateLimite;
    protected String Categorie;
    protected String etatRealisation;
    protected boolean scheduled;

    public Tache(String nom, int priorite, String dateLimite, String categorie) {
        this.idTache = ++nbTache;
        this.nom = nom;
        this.priorite = priorite;
        this.dateLimite = dateLimite;
        this.categorie = categorie;
        this.etatRealisation = "Non réalisée";
        this.scheduled = false;
    }

    public void modifierEtatRealisation(String nouvelEtat) {
        this.etatRealisation = nouvelEtat;
    }
}
