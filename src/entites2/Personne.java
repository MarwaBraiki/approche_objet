package entites2;

import entites.AdressePostale; // Importer la classe AdressePostale du package entites

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    // Constructeur avec arguments
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // Méthode pour afficher le nom et le prénom avec le nom de famille en majuscules
    public void afficherNomPrenom() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
    }

    // Méthode pour modifier le nom
    public void modifierNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Méthode pour modifier le prénom
    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // Méthode pour modifier l'adresse
    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    // Méthode pour retourner le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour retourner le prénom
    public String getPrenom() {
        return prenom;
    }

    // Méthode pour retourner l'adresse
    public AdressePostale getAdresse() {
        return adresse;
    }
}
