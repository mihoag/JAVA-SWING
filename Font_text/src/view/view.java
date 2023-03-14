package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.listen_button;
import model.mode;

import java.awt.*;

public class view extends JFrame {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JLabel lb;
    private mode md;

public view()
{
  this.init();
  this.setVisible(true);
}

    public void init()
    {
        this.setTitle("Button");
        this.setSize(300,300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.md = new mode();

        Font font = new Font("Arial", Font.BOLD, 40);
   
        listen_button ac = new listen_button(this);

        this.b1 = new JButton("1");
        b1.setFont(font);
        b1.addActionListener(ac);
        this.b2 = new JButton("2");
        b2.setFont(font);
        b2.addActionListener(ac);
        this.b3 = new JButton("3");
        b3.setFont(font);
        b3.addActionListener(ac);
        this.b4 = new JButton("4");
        b4.setFont(font);
        b4.addActionListener(ac);


        JPanel pn_btn = new JPanel();
        pn_btn.setLayout(new GridLayout(2,2,2,2));
        pn_btn.add(b1);
        pn_btn.add(b2);
        pn_btn.add(b3);
        pn_btn.add(b4);
      
        this.lb = new JLabel("-----", JLabel.CENTER);
        lb.setFont(font);
        JPanel p_lb = new JPanel();
        p_lb.add(lb);
        
        this.setLayout(new BorderLayout(2,2));
        this.add(pn_btn,BorderLayout.CENTER);
        this.add(p_lb,BorderLayout.SOUTH);
    }

    public void change1()
    {
        this.md.change_1();
        this.lb.setText("Last Button : " + this.md.getValue());
    }
    public void change2()
    {
        this.md.change_2();
        this.lb.setText("Last Button : " + this.md.getValue());
    }
    public void change3()
    {
        this.md.change_3();
        this.lb.setText("Last Button : " + this.md.getValue());
    }
    public void change4()
    {
        this.md.change_4();
        this.lb.setText("Last Button : " + this.md.getValue());
    }
    

}
