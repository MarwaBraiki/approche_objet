package entites;

import entites2.Personne; // Importer la classe Personne du package entites2
import entites.AdressePostale; // Importer la classe AdressePostale du package entites

public class TestPersonne {
    public static void main(String[] args) {
        // Création des adresses postales
        AdressePostale adresse1 = new AdressePostale(123, "Rue de l'exemple", 75001, "Paris");
        AdressePostale adresse2 = new AdressePostale(456, "Avenue des Champs", 69001, "Lyon");
        AdressePostale adresseToulouse = new AdressePostale(10, "Rue de Toulouse", 31000, "Toulouse");

        // Création des personnes avec leurs adresses
        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Martin", "Anne", adresse2);

        // Affichage des informations des personnes avec leur nom et prénom en majuscules
        personne1.afficherNomPrenom();
        personne2.afficherNomPrenom();

        // Modification de l'adresse de la personne 1
        personne1.modifierAdresse(adresseToulouse);

        // Affichage de la nouvelle adresse de la personne 1
        System.out.println("Nouvelle adresse de " + personne1.getPrenom() + " " + personne1.getNom() + ": " + personne1.getAdresse());

        // Exemple de modification du nom et du prénom de la personne 2
        personne2.modifierNom("Pauline");
        personne2.modifierPrenom("Isabelle");

        // Affichage du nom et prénom modifiés de la personne 2
        System.out.println("Nom et prénom modifiés de personne 2: " + personne2.getNom() + " " + personne2.getPrenom());
    }
}
