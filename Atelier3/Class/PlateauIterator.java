package Atelier3.Class;

public class PlateauIterator {
    private Plateau plateau;
    private int position;

    public PlateauIterator(Plateau plateau) {
        this.plateau = plateau;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < plateau.nbCases();
    }

    public Case next() {
        Case c = plateau.getCase(position);
        position++;
        return c;
    }
}
