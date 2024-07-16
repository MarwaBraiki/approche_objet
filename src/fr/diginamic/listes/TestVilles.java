package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Recherche de la ville la plus peuplée
        Ville villeMax = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villeMax.getNbHabitants()) {
                villeMax = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + villeMax.getNom());

        // Suppression de la ville la moins peuplée
        Ville villeMin = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeMin.getNbHabitants()) {
                villeMin = ville;
            }
        }
        villes.remove(villeMin);

        // Modifier les noms des villes de plus de 100000 habitants en majuscules
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Affichage de la liste résultante
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + " - " + ville.getNbHabitants() + " habitants");
        }
    }
}
