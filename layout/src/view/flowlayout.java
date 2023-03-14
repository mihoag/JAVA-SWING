package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class flowlayout extends JFrame
{
    public flowlayout()
    {
      this.setTitle("flowLayout");
      this.setSize(400,300);
      this.setLocationRelativeTo(null);
    
      JPanel p1 = new JPanel();
      p1.setLayout(getLayout());

      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");

      FlowLayout l1 =new FlowLayout(FlowLayout.CENTER,20,20);
      //FlowLayout l2 =new FlowLayout();
      this.setLayout(l1);
      this.add(b1);
      this.add(b2);
      this.add(b3);

      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public static void main(String[] args) {
        new flowlayout();
    }
}