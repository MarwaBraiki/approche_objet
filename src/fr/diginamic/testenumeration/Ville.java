package fr.diginamic.testenumeration;

public class Ville {
    private String nom;
    private Continent continent;

    public Ville(String nom, Continent continent) {
        this.nom = nom;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent.getLibelle() + '\'' +
                '}';
    }
}
