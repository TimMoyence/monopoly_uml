package Atelier1;

public class Main {
    public static void main(String[] args) {
        Banque b1 = Banque.getInstance();
        b1.setCash(1000);

        b1.showMessage();

        Banque b2 = Banque.getInstance();
        b2.setCash(500);

        b2.showMessage();

        b1.showMessage();
    }
}
