package fr.diginamic.testenumeration;

public enum Continent {
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
