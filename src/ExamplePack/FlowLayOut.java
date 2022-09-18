package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayOut extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;

    FlowLayOut() {
        add(panel1);
        setSize(400, 100);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sum = Integer.toString(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText()));
                JOptionPane.showMessageDialog(panel1,"Suma de los numeros: " + sum);
            }
        });
    }
}
