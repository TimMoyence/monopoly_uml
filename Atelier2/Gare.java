package Atelier2;


public class Gare extends Propriete {
    public Gare(int prix, String nom) {
        super(prix, nom);
    }

    @Override
    public void afficher() {
        System.out.println("Gare: " + nom + ", Prix: " + prix + "€");
    }
}

