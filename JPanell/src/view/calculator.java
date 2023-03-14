package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.*;
public class calculator extends JFrame
{
     public calculator()
     {
        this.setTitle("Calculator");
        this.setSize(300,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        // truong text field
        JTextField tx = new JTextField(40);
        JPanel p_head = new JPanel();
        p_head.setLayout(new BorderLayout());
        p_head.add(tx,BorderLayout.CENTER);
        
        // Tao nut
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b8 = new JButton("8");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b9 = new JButton("9");
        JButton cong= new JButton("+");
        JButton tru = new JButton("-");
        JButton nhan = new JButton("*");
        JButton chia = new JButton("/");
        JButton bang = new JButton("=");

        JPanel p_bt = new JPanel();
        p_bt.setLayout(new GridLayout(4,4));
        p_bt.add(b0);
        p_bt.add(b1);
        p_bt.add(b2);
        p_bt.add(b3);
        p_bt.add(b4);
        p_bt.add(b5);
        p_bt.add(b6);
        p_bt.add(b7);
        p_bt.add(b8);
        p_bt.add(b9);
        p_bt.add(cong);
        p_bt.add(tru);
        p_bt.add(nhan);
        p_bt.add(chia);
        p_bt.add(bang);

        //
        this.setLayout(new BorderLayout());
        this.add(p_head,BorderLayout.NORTH);
        this.add(p_bt,BorderLayout.CENTER);


        

        this.setVisible(true);
     }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new calculator();
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }

}