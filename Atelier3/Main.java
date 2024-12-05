package Atelier3;
import Atelier3.Class.Plateau;
import Atelier3.Class.PlateauIterator;
import Atelier3.Class.Case;

public class Main {
    public static void main(String[] args) {

        Plateau plateau = new Plateau();

        plateau.ajouterCase(new Case(1, "Départ"));
        plateau.ajouterCase(new Case(2, "Boulevard de Belleville"));
        plateau.ajouterCase(new Case(3, "Caisse Commune"));
        plateau.ajouterCase(new Case(4, "Rue Lecourbe"));
        plateau.ajouterCase(new Case(5, "Impôt sur le revenu"));
        plateau.ajouterCase(new Case(6, "Gare Montparnasse"));
        plateau.ajouterCase(new Case(7, "Rue de Vaugirard"));
        plateau.ajouterCase(new Case(8, "Chance"));
        plateau.ajouterCase(new Case(9, "Avenue de Neuilly"));
        plateau.ajouterCase(new Case(10, "Boulevard de la Villette"));

        PlateauIterator iterator = plateau.createIterator();
        while (iterator.hasNext()) {
            Case currentCase = iterator.next();
            currentCase.afficher();
        }
    }
}
