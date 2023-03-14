import java.util.ArrayList;
import java.util.concurrent.Flow;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.*;;

public class view extends JFrame{
      public model md;
      public JComboBox<String> monchinh;
      public JList<String> monphu;
      public JLabel info;

      public view()
      {
        md = new model();
        this.init();
      }
      public void init()
      {

        this.setTitle("NHA HANG");
        this.setSize(500,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


       Font font = new Font("Arial", Font.BOLD, 20);

       JLabel lb = new JLabel("MENU NHA HANG");
       lb.setFont(font);

       JPanel luachon = new JPanel();
       JPanel monchinhpPanel = new JPanel();
       JPanel monphuPanel  = new JPanel();

       monchinhpPanel.setLayout(new FlowLayout());
      
       String[] mc = {"COM","BUN","PHO"};
       monchinh = new JComboBox<String>(mc);
       monchinh.setFont(font);

      monchinhpPanel.add(monchinh);

     
      monphuPanel.setLayout(new FlowLayout());
      String[] mp = {"Trai cay", "Nuoc ngot" ,"Sua chua"};
      monphu = new JList<String>(mp);
      monphuPanel.add(monphu);
      monphu.setFont(font);


        
       
       luachon.setLayout(new GridLayout(2,1));
       luachon.add(monchinhpPanel);
       luachon.add(monphuPanel);

       // 
         controller ac = new controller(this);
       //
       JPanel sum = new JPanel();
       sum.setLayout(new GridLayout(1,2));
       JButton tt = new JButton("Thanh Toan");
       tt.addActionListener(ac);
       tt.setFont(font);
       info  =new JLabel("");
       info.setFont(font);


       sum.add(tt);
       sum.add(info);

       //
       this.setLayout(new BorderLayout());
       this.add(lb, BorderLayout.NORTH);
       this.add(luachon,BorderLayout.CENTER);
       this.add(sum, BorderLayout.SOUTH);

       this.setVisible(true);
      }


      public void Tinhtien()
      {
        md.tinhTongtien();
        info.setText("Mon chinh : "  + md.getMonchinh() + "   Monphu : " + md.getMonphu() + "  Tong tien : " + md.getTongtien());
      }
      
      
}
