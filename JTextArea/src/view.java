import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;;


public class view extends JFrame{
    private model md;
    private JTextArea txArea;
    private JTextField txkey;
    private JLabel lbkq;

    public view()
    {
        md = new model();
        this.init();

    }
    public void init()
    {
        this.setTitle("Search key from text");
        this.setSize(900,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        Font font = new Font("Arial", Font.BOLD, 40);
        JLabel lb1 = new JLabel("Text",JLabel.CENTER);
        lb1.setFont(font);


        

        // Tao vung de ghi van ban
        txArea = new JTextArea(100,100);
        txArea.setFont(font);
      

        // Tao thanh cuon
        JScrollPane jsp = new JScrollPane(txArea,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //


        JLabel keyLabel = new JLabel("Key Word",JLabel.CENTER);
        keyLabel.setFont(font);

        txkey = new JTextField();
        txkey.setFont(font);

        control ac = new control(this);

        
        JButton tkButton = new JButton("statistic");
        tkButton.setFont(font);
        tkButton.addActionListener(ac);


        lbkq = new JLabel(this.md.getKq());
        lbkq.setFont(font);

        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(2,2));
        pn.add(keyLabel);
        pn.add(txkey);
        pn.add(tkButton);
        pn.add(lbkq);
         

        this.setLayout(new BorderLayout(2,2));

        this.add(lb1,BorderLayout.NORTH);
        this.add(jsp,BorderLayout.CENTER);
        this.add(pn,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void solve()
    {
        this.md.setVanban(this.txArea.getText());
        this.md.setTukhoa(this.txkey.getText());

        this.md.dem();

        lbkq.setText(this.md.getKq());
    }
    
}
