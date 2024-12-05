package Atelier4;

public class Main {
    public static void main(String[] args) {

        JoueurDao joueurDao = new JoueurDaoImpl();
        System.out.println("Liste initiale des joueurs :");
        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            joueur.afficher();
        }

        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            joueur.setSolde(joueur.getSolde() + 100);
        }

        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            joueurDao.updateJoueur(joueur);
        }

        Joueur joueurASupprimer = new Joueur("Bob", 0);
        joueurDao.deleteJoueur(joueurASupprimer);

        System.out.println("\nListe des joueurs après modifications :");
        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            joueur.afficher();
        }
    }
}
