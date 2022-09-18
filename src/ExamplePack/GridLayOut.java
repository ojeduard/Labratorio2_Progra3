package ExamplePack;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayOut extends JFrame{
    private JPanel panel1;
    private JList WeekDays;
    private JList Month;
    private JTextArea textArea1;
    private JButton button1;

    String month;
    String day;


    public GridLayOut() {

        add(panel1);
        setSize(650, 400);

        Month.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                month = (String) Month.getSelectedValue();
            }
        });

        WeekDays.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                day = (String) WeekDays.getSelectedValue();
            }
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("Hoy es el primer " + day + " de " + month + "\n");
            }
        });

    }

}
