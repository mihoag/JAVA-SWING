package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class boderlayout extends JFrame
{
    public boderlayout()
    {
        this.setTitle("Minh Hoang");
        this.setSize(500,400);
        this.setLocationRelativeTo(null);

        //
        BorderLayout bd = new BorderLayout(50,70);

        this.setLayout(bd);
        JButton p1 = new JButton("1");
        JButton p2 = new JButton("2");
        JButton p3 = new JButton("3");
        JButton p4 = new JButton("4");
        JButton p5 = new JButton("5");

        this.add(p1,BorderLayout.EAST);
        this.add(p2,BorderLayout.CENTER);
        this.add(p3,BorderLayout.NORTH);
        this.add(p4,BorderLayout.SOUTH);
        this.add(p5,BorderLayout.WEST);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new boderlayout();
    }
}