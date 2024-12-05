package Atelier1;

public class Banque {

    private int cash;

    private static Banque Instance;

    public void setCash(int cash) {
        this.cash = cash;
    }

    private Banque(){}

    public static Banque getInstance(){
        if(Instance == null){
            return Instance = new Banque();
        }
        return Instance;
    }

    public void showMessage() {
        System.out.println(Instance + " : " + this.cash);
    }

}
