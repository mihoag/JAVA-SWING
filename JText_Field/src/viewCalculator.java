import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class viewCalculator extends JFrame
{
    private model md;
    JTextField tx1;
    JTextField tx2;
    JLabel ans;

    public viewCalculator()
    {
        md = new model();
        this.init();
    
    }
    public void init()
    {
        this.setTitle("My Calculator");
        this.setSize(600,900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //
        Font font = new Font("Arial",Font.BOLD,40);
        Font font2 = new Font("Arial",Font.ITALIC,40);
        JLabel lb1 = new JLabel("1st VALUE",JLabel.CENTER);
        lb1.setFont(font);

        JLabel lb2 = new JLabel("2st VALUE",JLabel.CENTER);
        lb2.setFont(font);

        JLabel an = new JLabel("ANSWER",JLabel.CENTER);
        an.setFont(font);

        //
        tx1 = new JTextField();
        tx1.setFont(font2);

        tx2 = new JTextField();
        tx2.setFont(font2);

        ans = new JLabel(this.md.getAns() + "" , JLabel.CENTER);
        ans.setFont(font2);
        ans.setBackground(Color.GREEN);

        JPanel pn1 = new JPanel();
        pn1.setLayout(new GridLayout(3,2,1,1));

        pn1.add(lb1);
        pn1.add(tx1);
        pn1.add(lb2);
        pn1.add(tx2);
        pn1.add(an);
        pn1.add(ans);

        pn1.setBackground(Color.CYAN);
        //
        control ac = new control(this);
    
        //
        JButton congButton = new JButton("+");
        congButton.setFont(font);
        congButton.addActionListener(ac);

        JButton truButton = new JButton("-");
        truButton.setFont(font);
        truButton.addActionListener(ac);

        
        JButton nhanButton = new JButton("*");
        nhanButton.setFont(font);
        nhanButton.addActionListener(ac);

        JButton chiaButton = new JButton("/");
        chiaButton.setFont(font);
        chiaButton.addActionListener(ac);

        JButton muButton = new JButton("^");
        muButton.setFont(font);
        muButton.addActionListener(ac);

        JButton modButton = new JButton("MOD");
        modButton.setFont(font);
        modButton.addActionListener(ac);

        JPanel pn2 = new JPanel();
        pn2.setLayout(new GridLayout(2,4,10,10));
        pn2.add(congButton);
        pn2.add(chiaButton);
        pn2.add(truButton);
        pn2.add(nhanButton);
        pn2.add(muButton);
        pn2.add(modButton);

        pn2.setBackground(Color.lightGray);
       
        this.setLayout(new BorderLayout(10,10));
        
        this.add(pn1,BorderLayout.CENTER);
        this.add(pn2,BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void cong()
    {
        Double val1 = Double.valueOf(tx1.getText());
        Double val2 = Double.valueOf(tx2.getText());
       
        this.md.cong(val1, val2);
        ans.setText(this.md.getAns()+"");
    }

    public void tru()
    {
        Double val1 = Double.valueOf(tx1.getText());
        Double val2 = Double.valueOf(tx2.getText());
       
        this.md.tru(val1, val2);
        ans.setText(this.md.getAns()+"");
    }

    public void nhan()
    {
        Double val1 = Double.valueOf(tx1.getText());
        Double val2 = Double.valueOf(tx2.getText());
       
        this.md.nhan(val1, val2);
        ans.setText(this.md.getAns()+"");
    }

    public void chia()
    {
        Double val1 = Double.valueOf(tx1.getText());
        Double val2 = Double.valueOf(tx2.getText());
       
        this.md.chia(val1, val2);
        ans.setText(this.md.getAns()+"");
    }

    public void mu()
    {
        Double val1 = Double.valueOf(tx1.getText());
        Double val2 = Double.valueOf(tx2.getText());
       
        this.md.mu(val1, val2);
        ans.setText(this.md.getAns()+"");
    }

    public void mod()
    {
        Double val1 = Double.valueOf(tx1.getText());
        Double val2 = Double.valueOf(tx2.getText());
       
        this.md.mod(val1, val2);
        ans.setText(this.md.getAns()+"");
    }

}