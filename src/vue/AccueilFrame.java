package vue;

import javax.swing.*;

public class AccueilFrame extends JFrame {
    private JPanel Accueil;
    private JComboBox DeroulantListe;
    private JButton validerButton;
    private JLabel imageGSB;
    private JButton fermerButton;


    public AccueilFrame() {
        setContentPane(Accueil);
        setTitle("GESTION COMPTE RENDUS");
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);



    }
    public static void main(String[] args) {
        AccueilFrame AccFrame = new AccueilFrame();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here

        imageGSB = new JLabel(new ImageIcon("src/media/logoGSB.png "));
    }
}
