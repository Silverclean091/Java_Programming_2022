package may10;

import javax.swing.*;

public class Moving extends JFrame {
    public Moving() {
        this.setTitle("Moving");
        this.setBounds(100, 100, 500, 400);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("image.gif");
        JLabel lbl = new JLabel("hello");   // hello 대신 image 넣으면 사진 삽입
        lbl.setBounds(10, 10, 40, 20);
        this.add(lbl);

        JButton btnRight = new JButton(">");
        btnRight.addActionListener(e -> {
            lbl.setLocation(lbl.getLocation().x+10, lbl.getLocation().y);
        });
        btnRight.setBounds(250, 350, 50, 30);
        this.add(btnRight);
    }

    public static void main(String[] args) {
        Moving mv = new Moving();
        mv.setVisible(true);
    }
}
