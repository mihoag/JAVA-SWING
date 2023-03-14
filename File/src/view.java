import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;

public class view extends JFrame{
    public model md;
    private JMenuItem newfile;
    private JMenuItem openfile;
    private JMenuItem savefile;
    public JTextArea tx;
    private JLabel lb;
    public view()
    {
        md = new model();
        this.init();
    }
    public void init()
    {
        this.setTitle("Notepad");
        this.setSize(500,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         control ac = new control(this);
        // 
        JMenuBar menubar  = new JMenuBar();
        
        JMenu file = new JMenu("File");
        newfile = new JMenuItem("New");
        openfile = new JMenuItem("Open");
        openfile.addActionListener(ac);
        savefile = new JMenuItem("Save");
        savefile.addActionListener(ac);

        file.add(newfile);
        file.add(openfile);
        file.add(savefile);

        menubar.add(file);
       //
       Font font = new Font("Arial", Font.PLAIN, 20);
       //
       tx = new JTextArea();
       tx.setFont(font);
       //
       lb = new JLabel("");
       lb.setFont(font);
        
      
       
       // Tao scrollpane
       JScrollPane sp   = new JScrollPane(tx);
       //
       this.setLayout(new BorderLayout());
       this.add(sp,BorderLayout.CENTER);
       this.add(lb,BorderLayout.SOUTH);
       this.setJMenuBar(menubar);
       this.setVisible(true);
    }
    public void setText(String str)
    {
        this.lb.setText(str);
    }
    public static void main(String[] args) {
        new view();
    }
}
