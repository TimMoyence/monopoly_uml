package src;
import src.Class.Enum.FactoryEnum;
import src.Class.Propriete;
import src.Class.ProprieteFactory;


public class Main {
    public static void main(String[] args) {

        Propriete terrain = ProprieteFactory.creer(FactoryEnum.TERRAIN, 400,"Rue de la Paix");
        Propriete terrain2 = ProprieteFactory.creer(FactoryEnum.TERRAIN, 100, "Rue de Courcelles");
        Propriete gare = ProprieteFactory.creer(FactoryEnum.GARE, 200, "Montparnasse");

        terrain.afficher();
        terrain2.afficher();
        gare.afficher();
    }
}
