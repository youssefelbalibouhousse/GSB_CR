package controleur;
import vue.MedicamentFrame;

public class Controle {

    //proprieté
    MedicamentFrame medicamentFrame;


    public static void main(String[] args) {
        new Controle();
    }

    //constructeur

    public Controle(){
        medicamentFrame = new MedicamentFrame();
        medicamentFrame.setVisible(true);
    }
}
