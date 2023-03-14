import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

public class view extends JFrame{
    JLabel lb;
    public view()
    {
        this.setTitle("MENU");
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,20);

       //
       control ac = new control(this);
     



       // Tao thanh menu

       JMenuBar menuBar = new JMenuBar();
       JMenu m1  = new JMenu("File");
       m1.setFont(font);
       m1.addActionListener(ac);
       JMenuItem mt1 = new JMenuItem("Open", KeyEvent.VK_O);
       mt1.setFont(font);
       mt1.addActionListener(ac);

       // Tao phim tat cho Open
       mt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

       

       JMenuItem nwItem = new JMenuItem("New", KeyEvent.VK_N);
       nwItem.setFont(font);
       nwItem.addActionListener(ac);

       // Tao phim tat cho new
       nwItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));


       
       JMenuItem mt2 = new JMenuItem("Exit", KeyEvent.VK_X);
       mt2.setFont(font);
       mt2.addActionListener(ac);
       m1.add(mt1);
       m1.addSeparator();
       m1.add(mt2);
       m1.add(nwItem);
       

       // Tao phim tat cho exit
       mt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

       JMenu m2 = new JMenu("Help");
       m2.setFont(font);
       JMenuItem wc = new JMenuItem("Welcome", KeyEvent.VK_W);
       wc.setFont(font);
       wc.addActionListener(ac);
      
       wc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));


       m2.add(wc);
       
       menuBar.add(m1);
       menuBar.add(m2);

       lb = new JLabel("");
       lb.setForeground(Color.RED);
       lb.setFont(font);
    
       this.setJMenuBar(menuBar);
       this.setLayout(new BorderLayout());

         // Tao thanh cong cu 
       JToolBar toolBar = new JToolBar();
       JButton undo = new JButton("Undo");
       undo.setFont(font);
       undo.setToolTipText("Nhan vao day de khoi phuc");
       undo.addActionListener(ac);

       JButton redo = new JButton("Redo");
       redo.setFont(font);
       undo.setToolTipText("Nhan vao day de redo");
       redo.addActionListener(ac);

       JButton cut = new JButton("Cut");
       cut.setFont(font);
       cut.setToolTipText("Nhan vao day de cat");
       cut.addActionListener(ac);

       JButton copy = new JButton("Copy");
       copy.setFont(font);
       copy.setToolTipText("Nhan vao day de thoat");
       copy.addActionListener(ac);

       JButton paste = new JButton("Paste");
       paste.setFont(font);
       paste.setToolTipText("Nhan vao day de paste");
       paste.addActionListener(ac);

       toolBar.add(undo);
       toolBar.add(redo);
       toolBar.add(cut);
       toolBar.add(copy);
       toolBar.add(paste);


       this.add(lb,BorderLayout.CENTER);
       this.add(toolBar,BorderLayout.NORTH);
       this.setVisible(true);
    }
    public void setText(String s)
    {
        lb.setText(s);
    }

    public static void main(String[] args) {
        new view();
    }
}
