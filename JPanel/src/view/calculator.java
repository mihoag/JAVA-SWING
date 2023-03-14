package view;

import javax.swing.JFrame;

public class calculator extends JFrame
{
     public calculator()
     {
        this.setTitle("Calculator");
        this.setSize(300,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
     }
    public static void main(String[] args) {
        new calculator();
    }

}