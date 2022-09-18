package ExamplePack;

import javax.swing.*;

public class Dialog extends JDialog {

    public Dialog (MenuFrame m){
        super(m);
        setTitle("Dialog");
        setModal(true);
        JTextPane infoGrupo = new JTextPane();
        infoGrupo.setText("\tLaboratorio 2 del Curso de Programacion 3\n\n" +
                "Intregrantes del grupo:\n\n" +
                "Eduardo Aaron Ojeda Paladino\n" +
                "Victor David Coto Solano\n" +
                "Jose Luis Valverde");
        setSize(400, 200);
        infoGrupo.setEditable(false);
        add(infoGrupo);

    }
}
