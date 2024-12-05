package src.Class;

import src.Class.Enum.FactoryEnum;

public class ProprieteFactory {

    public static Propriete creer(FactoryEnum Type, int prix, String nom){
        if(Type == FactoryEnum.GARE) return new Gare(prix, nom);
        if(Type == FactoryEnum.TERRAIN) return new Terrain(prix, nom);
        if(Type == FactoryEnum.COMPAGNIEEE) return new Compagnieee(prix, nom);
        return null;
    };
}
