package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        // Affichage de toutes les saisons
        System.out.println("Liste des saisons :");
        for (Saison saison : Saison.values()) {
            System.out.println(saison.name() + " - " + saison.getLibelle());
        }

        // Recherche et affichage du libellé de l'instance de Saison "ETE"
        String nom = "ETE";
        Saison saisonEte = Saison.valueOf(nom); // Utilisation de valueOf pour retrouver l'enum par son nom
        System.out.println("\nLibellé de la saison " + nom + " : " + saisonEte.getLibelle());

        // Utilisation de la méthode getByLibelle pour retrouver une saison par libellé
        String libelle = "Hiver";
        Saison saisonHiver = Saison.getByLibelle(libelle);
        if (saisonHiver != null) {
            System.out.println("\nSaison trouvée pour le libellé \"" + libelle + "\": " + saisonHiver.name());
        } else {
            System.out.println("\nAucune saison trouvée pour le libellé \"" + libelle + "\"");
        }
    }
}
