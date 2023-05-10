import java.util.ArrayList;
import java.util.List;

public class Historique {
    private List<Planning> listePlannings;

    public Historique() {
        listePlannings = new ArrayList<>();
    }

    public void ajouterPlanning(Planning planning) {
        listePlannings.add(planning);
    }

    public void modifierPlanning(Planning planning, int index) {
        if (index >= 0 && index < listePlannings.size()) {
            listePlannings.set(index, planning);
        } else {
            System.out.println("Index invalide.");
        }
    }

    public void afficherHistorique() {
        for (int i = 0; i < listePlannings.size(); i++) {
            System.out.println("Planning " + (i + 1) + ":");
            listePlannings.get(i).afficherPlanning();
            System.out.println();
        }
    }
}