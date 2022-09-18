package ExamplePack;

import javax.swing.*;

public class Dialog extends JDialog {

    public Dialog (MenuFrame m){
        super(m);
        setTitle("Dialog");
        setModal(true);
        JTextPane infoGrupo = new JTextPane();
        infoGrupo.setText("""
                \tLaboratorio 2 del Curso de Programacion 3

                Intregrantes del grupo:

                Eduardo Aaron Ojeda Paladino
                Victor David Coto Solano
                Jose Luis Valverde""");
        setSize(400, 200);
        infoGrupo.setEditable(false);
        add(infoGrupo);

    }
}
