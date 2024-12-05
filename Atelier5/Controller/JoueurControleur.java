package Atelier5.Controller;
import Atelier5.Modele.Joueur;
import Atelier5.Vue.JoueurVue;

public class JoueurControleur {
    private Joueur modele;
    private JoueurVue vue;

    public JoueurControleur(Joueur modele, JoueurVue vue) {
        this.modele = modele;
        this.vue = vue;
    }

    public void setPrenomJoueur(String prenom) {
        modele.setPrenom(prenom);
    }

    public String getPrenomJoueur() {
        return modele.getPrenom();
    }

    public void setCashJoueur(int cash) {
        modele.setCash(cash);
    }

    public int getCashJoueur() {
        return modele.getCash();
    }

    public void mettreAJourVue() {
        vue.afficherJoueur(modele.getPrenom(), modele.getCash());
    }
}
