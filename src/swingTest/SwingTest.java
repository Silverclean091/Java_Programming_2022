package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingTest extends JFrame {

    private String[] btnText = {
            "7", "8", "9",
            "4", "5", "6",
            "1", "2", "3"   };

    private JButton btn;
    private JLabel lbl;

    public SwingTest() {
        this.setTitle("Swing Test");
        this.setBounds(100, 100, 300, 500);
        this.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < 9; i++) {
            btn = new JButton(btnText[i]);
            this.add(btn);
            btn.addActionListener( ae -> doAction(ae));
        }

        lbl = new JLabel("hello");
        this.add(lbl);
    }

    private void doAction(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "0": case "1": case"2":
                processNumber();
                break;
            case "+": case"-":
                processOperator();
                break;
            case "=":
                processEqual();
                break;
        }
    }

    private void processNumber() {

    }

    private void processOperator() {

    }

    private void processEqual() {

    }

    public static void main(String[] args) {
        SwingTest st = new SwingTest();
        st.setVisible(true);
    }


}
