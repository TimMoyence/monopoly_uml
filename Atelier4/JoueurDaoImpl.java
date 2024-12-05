package Atelier4;

import java.util.ArrayList;
import java.util.List;

public class JoueurDaoImpl implements JoueurDao {
    private List<Joueur> joueurs;

    public JoueurDaoImpl() {
        joueurs = new ArrayList<>();
        // Préenregistrement de 3 joueurs
        joueurs.add(new Joueur("Alice", 500));
        joueurs.add(new Joueur("Bob", 300));
        joueurs.add(new Joueur("Charlie", 400));
    }

    @Override
    public List<Joueur> getTousLesJoueurs() {
        return joueurs;
    }

    @Override
    public void addJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    @Override
    public void updateJoueur(Joueur joueur) {
        for (Joueur j : joueurs) {
            if (j.getNom().equals(joueur.getNom())) {
                j.setSolde(joueur.getSolde());
                break;
            }
        }
    }

    @Override
    public void deleteJoueur(Joueur joueur) {
        joueurs.removeIf(j -> j.getNom().equals(joueur.getNom()));
    }
}
