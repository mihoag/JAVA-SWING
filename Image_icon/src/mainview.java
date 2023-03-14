import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;

public class mainview extends JFrame{
        public mainview()
        {
            this.setTitle("Notepad");
            this.setSize(500,700);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
           // icon notepad
           Image icon_notepad  = Toolkit.getDefaultToolkit().createImage( mainview.class.getResource("notepad.png"));

            this.setIconImage(icon_notepad);


            // tao menu
            JMenuBar menubar = new JMenuBar();
            JMenu menu = new JMenu("Menu");
            JMenuItem i1 = new JMenuItem("New");
            i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(mainview.class.getResource("new-file-icon.png"))));


            JMenuItem i2 = new JMenuItem("Save");
            i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(mainview.class.getResource("save.png"))));
            
            JMenuItem i3 = new JMenuItem("Exit");
            i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(mainview.class.getResource("Button-Close-icon.png"))));
            JMenu submenu = new JMenu("Sub Menu");
            JMenuItem i4 = new JMenuItem("Send");
            submenu.add(i4);

            menu.add(i1);
            menu.add(i2);
            menu.add(i3);

            menu.add(submenu);
            menubar.add(menu);

            // tao button
       
            JButton btn1 = new JButton("TEST BUTTON");
            JLabel lb1 = new JLabel();
            lb1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(mainview.class.getResource("anh.png"))));

            

            this.setLayout(new BorderLayout());
            this.add(lb1, BorderLayout.CENTER);
            this.add(btn1, BorderLayout.SOUTH);
            this.setJMenuBar(menubar);

            this.setVisible(true);


        }    
        public static void main(String[] args) {
            new mainview();
        }
}
