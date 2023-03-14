package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class grid_layout extends JFrame{
    public grid_layout()
    {
      this.setTitle("flowLayout");
      this.setSize(400,300);
      this.setLocationRelativeTo(null);

      this.setLayout(new GridLayout(3,3));
      for(int i = 0 ; i < 9 ; i++)
      {
        JButton b = new JButton(i + "");
        this.add(b);
      }

      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new grid_layout();
    }

    
}
