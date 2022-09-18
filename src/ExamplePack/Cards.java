package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cards extends JFrame {
    private JButton ventana1Button;
    private JButton ventana2Button;
    private JButton ventana3Button;
    private JPanel card1;
    private JPanel card2;
    private JPanel card3;
    private JPanel CardsPanel;
    private JPanel main;
    private JPanel Texto;
    private JPanel Bottonpanel;
    private JLabel texto;

    public Cards() {
        add(main);
        setSize(600, 600);

        ventana1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardsPanel.removeAll();
                CardsPanel.add(card1);
                CardsPanel.repaint();
                CardsPanel.revalidate();
            }
        });
        ventana2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardsPanel.removeAll();
                CardsPanel.add(card2);
                CardsPanel.repaint();
                CardsPanel.revalidate();
            }
        });
        ventana3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardsPanel.removeAll();
                CardsPanel.add(card3);
                CardsPanel.repaint();
                CardsPanel.revalidate();
            }
        });

    }
}
