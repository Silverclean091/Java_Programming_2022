package swingInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingInterface extends JFrame {

    private JLabel lbl;
    private JButton btn1;
    private JButton btn2;

    private SwingInterface() {

        this.setTitle(" swing interface ");
        this.setBounds(100, 100, 500, 400);
        this.setLayout(null);

        lbl = new JLabel("test");
        lbl.setBounds(20, 20, 50, 20);
        this.add(lbl);

        btn1 = new JButton("push");
        btn1.setBounds(220, 300, 70, 30);
        this.add(btn1);

 //       btn.addActionListener(e -> {
 //           doAction();
 //       });

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doAction();
            }};
        btn1.addActionListener(al);

        btn2 = new JButton("back");
        btn2.setBounds(220, 300, 70, 30);
        this.add(btn2);
        btn2.addActionListener(e -> doAction2());

    }

    private void doAction() {
        lbl.setLocation(lbl.getLocation().x+10, lbl.getLocation().y+10);
    }

    private void doAction2() {
        lbl.setLocation(lbl.getLocation().x-10, lbl.getLocation().y-10);
    }

    public static void main(String[] args) {
        SwingInterface si = new SwingInterface();
        si.setVisible(true);
    }

}
