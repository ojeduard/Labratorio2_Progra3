package ExamplePack;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuFrame extends JFrame {
    Dialog dialog = new Dialog(MenuFrame.this);
    BorderLayOut borderL = new BorderLayOut();
    GridLayOut gridL = new GridLayOut();

    // Estos son todos los MenuItem que se utilizaran
    JMenuItem salir;
    JMenuItem borderLayour;
    JMenuItem gridLayout;
    JMenuItem infoGruop;
    JMenuItem flowLayout;
    JMenuItem gridBadLayout;
    JMenuItem cardLayout;

    public MenuFrame(){


        MenuLamina miLamina = new MenuLamina();
        add(miLamina);

        setVisible(true);
        setBounds(500, 300, 500, 400);

    }

    class MenuLamina extends JPanel{

        public MenuLamina(){

            // Instanciar la barra
            JMenuBar miBarra = new JMenuBar();

            //Instanciar cada componente del JMenu
            JMenu inicio = new JMenu("Inicio");
            JMenu ejemplos = new JMenu("Ejemplos");
            JMenu acercaDe = new JMenu("Acerca de:");

            // Inicializar cada componente de JMenuItem
            salir = new JMenuItem("Salir");

            borderLayour = new JMenuItem("BorderLayout");
            gridLayout = new JMenuItem("GridLayout");
            flowLayout = new JMenuItem("FlowLayout");
            gridBadLayout = new JMenuItem("GridBadLayout");
            cardLayout = new JMenuItem("CardLayout");

            infoGruop = new JMenuItem("Informacion del grupo");

            // Agregar las acciones de cada componente
            salir.addActionListener(new GestionaSalir());
            borderLayour.addActionListener(new GestionarBorderLayout());
            gridLayout.addActionListener(new GestionarGridLayout());
            infoGruop.addActionListener(new GestionarAcercaDe());

            //Agregar los componentes de JMenu dentro de la barra
            miBarra.add(inicio);
            miBarra.add(ejemplos);
            miBarra.add(acercaDe);

            //Agregar los elementos de JMenuItem dentro de los JMenu
            inicio.add(salir);
            ejemplos.add(borderLayour);
            ejemplos.add(gridLayout);
            ejemplos.add(flowLayout);
            ejemplos.add(gridBadLayout);
            ejemplos.add(cardLayout);
            acercaDe.add(infoGruop);


            //Agregar la barra dentro del MenuLamina
            add(miBarra);


        }

        private class GestionaSalir implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        }

        private class GestionarBorderLayout implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
//                borderL = new BorderLayOut();
                borderL.setVisible(true);
                borderL.setLocationRelativeTo(borderLayour);

            }
        }

        private class GestionarGridLayout implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                gridL.setVisible(true);
                gridL.setLocationRelativeTo(gridLayout);
            }
        }


        private class GestionarAcercaDe implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
                dialog.setLocationRelativeTo(MenuFrame.this);
//
            }
        }

    }


}
//