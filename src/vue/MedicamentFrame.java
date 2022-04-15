package vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MedicamentFrame extends JFrame {
    private JLabel Code;
    private JTextField tfCode;
    private JButton suivantButton;
    private JButton fermerButton;
    private JPanel Medicament;
    private JButton précédentButton;
    private JLabel lblNomCommercial;
    private JLabel lblFamille;
    private JLabel lblComposition;
    private JLabel lblEffetIndesirable;
    private JLabel lblContreIndication;
    private JLabel lblPrixEchantillon;

    public MedicamentFrame(){
        setContentPane(Medicament);
        setTitle("Medicament");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        précédentButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });
        suivantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfCode.setText("hello !");

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Medicament = new JPanel();
    }
}
