package Atelier4;

public class Joueur {
    private String nom;
    private int solde;

    public Joueur(String nom, int solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void afficher() {
        System.out.println("Joueur: " + nom + ", Solde: " + solde + "€");
    }
}
