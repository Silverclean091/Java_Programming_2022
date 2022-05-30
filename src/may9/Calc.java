package calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame {
    private double op1 = 0;
    private double op2 = 0;
    private String operator = "+";

    public Calc(){
        this.setTitle("계산기");
        this.setBounds(100, 100, 400, 500);
        this.setLayout(new BorderLayout());

        JTextField display = new JTextField("0");
        display.setFont( new Font("", 0, 30) );
        display.setHorizontalAlignment( JTextField.RIGHT );
        this.add( BorderLayout.NORTH, display);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        for(int i=0; i<10; i++ ) {
            JButton btn = new JButton( ""+i );
            btn.addActionListener( e -> {
                if( display.getText().equals("0") ) {
                    display.setText( btn.getText() );
                } else {
                    display.setText( display.getText() + btn.getText() );
                }
            });
            panel.add(btn);
        }
        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener( e -> {
            op2 = Double.parseDouble( display.getText() );
            double result = calc( op1, op2, operator );
            display.setText( "" + result );
        });
        panel.add(btnEqual);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener( e -> {
            op1 = Double.parseDouble( display.getText() );
            display.setText("0");
            operator = "+";
        });
        panel.add(btnPlus);

        this.add( BorderLayout.CENTER, panel);

        JLabel status = new JLabel("버튼을 클릭하세요");
        this.add( BorderLayout.SOUTH, status );
    }

    private double calc(double op1, double op2, String operator) {
        double result = 0;
        switch( operator ) {
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "*":
                result = op1 * op2;
                break;
            case "/":
                result = op1 / op2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        new Calc().setVisible(true);
    }

}
