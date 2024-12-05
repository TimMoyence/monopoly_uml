package Atelier5;

import Atelier5.Controller.JoueurControleur;
import Atelier5.Modele.Joueur;
import Atelier5.Vue.JoueurVue;

public class Main {
    public static void main(String[] args) {
        Joueur joueur = new Joueur("Alice", 500);

        JoueurVue vue = new JoueurVue();

        JoueurControleur controleur = new JoueurControleur(joueur, vue);
        System.out.println("Affichage initial du joueur :");
        controleur.mettreAJourVue();

        controleur.setCashJoueur(controleur.getCashJoueur() + 100);

        System.out.println("\nAffichage après modification du cash :");
        controleur.mettreAJourVue();
    }
}
