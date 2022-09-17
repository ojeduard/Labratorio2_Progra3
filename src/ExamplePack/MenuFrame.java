package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuFrame extends JFrame {
    BorderLayOut borderL;

    JMenuItem salir;
    JMenuItem borderLayour;

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
            // Agregar la accion que va a tener al dar click en salir
            GestionaSalir cerrar = new GestionaSalir();
            salir.addActionListener(cerrar);

            borderLayour = new JMenuItem("BorderLayout");
            GestionarBorderLayout presentarBorderLayout = new GestionarBorderLayout();
            borderLayour.addActionListener(presentarBorderLayout);

            JMenuItem gridLayout = new JMenuItem("GridLayout");
            JMenuItem flowLayout = new JMenuItem("FlowLayout");
            JMenuItem gridBadLayout = new JMenuItem("GridBadLayout");
            JMenuItem cardLayout = new JMenuItem("CardLayout");

//            JMenu opciones = new JMenu("Mas...");
//            JMenuItem opcion = new JMenuItem("Opcion 1");


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




            //Agregar la barra dentro del MenuLamina
            add(miBarra);


        }

        private class GestionaSalir implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                salir.addActionListener(this);
            }
        }

        private class GestionarBorderLayout implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
//                borderL = new BorderLayOut();
                borderLayour.addActionListener(this);

            }
        }


    }



    public static void main(String[] args) {
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
//