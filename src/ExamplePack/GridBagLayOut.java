package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayOut extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panelTab1;
    private JPanel panelTab2;
    private JScrollBar scrollBar1;
    private JScrollBar scrollBar2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JPanel mainPanel;

    GridBagLayOut() {
        add(mainPanel);
        setSize(400, 200);

        comboBox1.addItem("OP. 1");
        comboBox1.addItem("OP. 2");
        comboBox1.addItem("OP. 3");

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Tiene en mira la opcion '" + comboBox1.getSelectedItem().toString() + "'");
            }
        });
    }
}
