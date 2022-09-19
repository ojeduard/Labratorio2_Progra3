package ExamplePack;

import javax.swing.*;
import java.awt.event.*;

public class GridBagLayOut extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panelTab1;
    private JPanel panelTab2;
    private JScrollBar scrollBar1;
    private JScrollBar scrollBar2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JPanel mainPanel;
    private JTextField textField2;
    private JTextField textField3;

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
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField2.setText("Posicion de ScrollBar horizontal: " + scrollBar1.getValue());
            }
        });

        scrollBar2.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField3.setText("Posicion de ScrollBar vertical: " + scrollBar2.getValue());
            }
        });
    }
}
