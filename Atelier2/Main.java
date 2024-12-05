package Atelier2;

import Atelier2.Enum.FactoryEnum;

public class Main {
    public static void main(String[] args) {

        Propriete rueDeLaPaix = ProprieteFactory.creer(FactoryEnum.TERRAIN, 400, "Rue de la Paix");
        Propriete rueDeCourcelle = ProprieteFactory.creer(FactoryEnum.TERRAIN, 350, "Rue de Courcelle");
        Propriete gareMontparnasse = ProprieteFactory.creer(FactoryEnum.GARE, 200, "Gare Montparnasse");
        Propriete compagnieEau = ProprieteFactory.creer(FactoryEnum.COMPAGNIEEE, 150, "Compagnie d'Eau");

        rueDeLaPaix.afficher();
        rueDeCourcelle.afficher();
        gareMontparnasse.afficher();
        compagnieEau.afficher();
    }
}
