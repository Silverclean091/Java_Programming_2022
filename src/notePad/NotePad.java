package notePad;

import javax.swing.*;

public class NotePad extends JFrame {

    NotePad() {
        this.setTitle("메모장");
        this.setBounds(100, 100, 600, 400);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenu editMenu = new JMenu("편집");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        JMenuItem openMenuItem = new JMenuItem("열기");
        JMenuItem saveMenuItem = new JMenuItem("저장");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        this.setJMenuBar(menuBar);

        openMenuItem.addActionListener(e -> doOpen());
    }

    private void doOpen() {
        System.out.println("열기 메뉴선택");
    }
    
    public static void main(String[] args) {
        
        NotePad np = new NotePad();
        np.setVisible(true);
        
    }
    
}
