package swingTT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingTT extends JFrame {

    String[] btnStr = {
            "1", "2", "3",
            "a", "b", "c",
            "&", "@", "%"
    };

    String[] lblStr = {
            "숫자", "영어", "특수"
    };
    JButton btn;
    JLabel[] lbl = new JLabel[3];

    SwingTT() {
        this.setTitle("swing TT");
        this.setBounds(100, 100, 300, 400);
        this.setLayout(new GridLayout(4, 3));
        for(int i = 0; i < btnStr.length; i++) {
            btn = new JButton(btnStr[i]);
            this.add(btn);
            btn.addActionListener(e -> doAction(e));
        }
        for (int i = 0; i < lblStr.length; i++) {
            lbl[i] = new JLabel(lblStr[i]);
            this.add(lbl[i]);
        }

    }

    private void doAction(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "a": case "b": case "c":
                lbl[1].setText(e.getActionCommand());
                break;
            case "1": case "2": case"3":
                lbl[0].setText(e.getActionCommand());
                break;
            case "@": case "&": case "%":
                lbl[2].setText(e.getActionCommand());
                break;
        }
    }

    public static void main(String[] args) {
        SwingTT stt = new SwingTT();
        stt.setVisible(true);
    }

}
