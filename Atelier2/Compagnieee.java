package Atelier2;

public class Compagnieee extends Propriete {
    public Compagnieee(int prix, String nom) {
        super(prix, nom);
    }

    @Override
    public void afficher() {
        System.out.println("Compagnie d'électricité ou eau: " + nom + ", Prix: " + prix + "€");
    }
}
