import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import java.awt.*;

public class view extends JFrame {

    public JPopupMenu jpopup;
    private JLabel lb;
    public JCheckBoxMenuItem checkbox;
    public JToolBar toolbar;
    public view()
    {
        this.setTitle("JPOPUP");
        this.setSize(500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
         // Tạo thanh menu
         JMenuBar menuBar = new JMenuBar();
         JMenu file = new JMenu("File");
         JMenu view  = new JMenu("View");
         JMenu help = new JMenu("Help");

         menuBar.add(file);
         menuBar.add(view);
         menuBar.add(help);

        this.setJMenuBar(menuBar);
        

        // Tạo checkbox
        checkbox = new JCheckBoxMenuItem("View ToolBar");
        view.add(checkbox);
        // Tao toolBar
         toolbar = new JToolBar();
         JButton undo = new JButton("Undo");
         JButton redo = new JButton("Redo");

         toolbar.add(undo);
         toolbar.add(redo);

        //
        Font ft = new Font("Arial",Font.BOLD,40);
        //
        ActionControl ac = new ActionControl(this);
        checkbox.addActionListener(ac);
        //
        jpopup = new JPopupMenu();
        JMenu font = new JMenu("Font");
        JMenuItem color = new JMenuItem("Color");
        color.addActionListener(ac);
        JMenuItem size = new JMenuItem("Size");
        size.addActionListener(ac);
        JMenuItem fonttext = new JMenuItem("Font text");
        fonttext.addActionListener(ac);
        
        font.add(fonttext);
        font.addSeparator();

        font.add(size);
        font.addSeparator();

        font.add(color);
        
        JMenuItem cut = new JMenuItem("Cut");
        cut.addActionListener(ac);
        JMenuItem copy = new JMenuItem("Copy");
        copy.addActionListener(ac);
        JMenuItem paste = new JMenuItem("Paste");
        paste.addActionListener(ac);



        jpopup.add(font);
        jpopup.addSeparator();
        jpopup.add(cut);
        jpopup.addSeparator();
        jpopup.add(copy);
        jpopup.addSeparator();
        jpopup.add(paste);

        this.setLayout(new BorderLayout());
       // Note: add jpopup truoc khi add
        this.add(jpopup);


        MouseControl mouseac = new MouseControl(this);
        this.addMouseListener(mouseac);

        lb = new JLabel("");
        lb.setFont(ft);
        lb.setForeground(Color.RED);


        

        this.add(lb, BorderLayout.CENTER);
      

        this.setVisible(true);
    }
   
    public void setText(String str)
    {
        this.lb.setText("Ban da chon : " + str);
    }
    public void enable()
    {
        this.add(toolbar,BorderLayout.NORTH);
        this.refresh();
    }
    public void disable()
    {
        this.remove(toolbar);
        this.refresh();
    }
    public void refresh()
    {
        this.pack();
        this.setSize(500,600);
    }

    public static void main(String[] args) {
        new view();
    }
}
