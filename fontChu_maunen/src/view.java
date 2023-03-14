import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class view extends JFrame{
    private model md;
    JButton red_foreButton;
    JButton green_foreButton;
    JButton yellow_foreButton;
    JButton red_backButton;
    JButton green_backButton;
    JButton yellow_backButton;
    JLabel lb;

    public view()
    {
       md = new model();
      this.init();
    }
    public void init()
    {
        this.setTitle("My Color");
        this.setSize(900,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font1 = new Font("Arial", Font.BOLD , 40);
        Font font2 = new Font("Arial", Font.BOLD , 100);

        control ac = new control(this);


        red_foreButton = new JButton("Red Text");
        red_foreButton.setFont(font1);
        red_foreButton.setForeground(Color.RED);
        red_foreButton.addActionListener(ac);

        yellow_foreButton = new JButton("Yellow Text");
        yellow_foreButton.setFont(font1);
        yellow_foreButton.setForeground(Color.YELLOW);
        yellow_foreButton.addActionListener(ac);

        green_foreButton = new JButton("Green Text");
        green_foreButton.setFont(font1);
        green_foreButton.setForeground(Color.GREEN);
        green_foreButton.addActionListener(ac);

        red_backButton = new JButton("Red BackGround");
        red_backButton.setFont(font1);
        red_backButton.setBackground(Color.RED);
        red_backButton.addActionListener(ac);

        yellow_backButton = new JButton("Yellow BackGround");
        yellow_backButton.setFont(font1);
        yellow_backButton.setBackground(Color.YELLOW);
        yellow_backButton.addActionListener(ac);

        green_backButton = new JButton("Green BackGround");
        green_backButton.setFont(font1);
        green_backButton.setBackground(Color.green);
        green_backButton.addActionListener(ac);

       JPanel pn=new JPanel();
       pn.setLayout(new GridLayout(2,3));

       pn.add(red_foreButton);
       pn.add(yellow_foreButton);
       pn.add(green_foreButton);

       pn.add(red_backButton);
       pn.add(yellow_backButton);
       pn.add(green_backButton);

       this.setLayout(new BorderLayout());
       this.add(pn,BorderLayout.CENTER);

        lb = new JLabel("LE MINH HOANG",JLabel.CENTER);
       lb.setFont(font2);

       this.add(lb,BorderLayout.NORTH);

       this.setVisible(true);        
    }
    public void changeFore(Color color)
    {
        lb.setForeground(color);
    }
    public void changeBackgr(Color color)
    {
       lb.setBackground(color);
       lb.setOpaque(true);
    }
    
}
