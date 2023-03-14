import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.*;;

public class view extends JFrame{
      public model md;
      public JRadioButton com;
      public JRadioButton bun;
      public JRadioButton pho;
      public ButtonGroup monchinh;
      public JCheckBox traicay;
      public JCheckBox nuocngot;
      public JCheckBox suachua;
      public ArrayList<JCheckBox> monphu;
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

       monchinhpPanel.setLayout(new BorderLayout());
        
       // tao radio button
       com = new JRadioButton("COM");
       com.setFont(font);
       bun = new JRadioButton("BUN");
       bun.setFont(font);
       pho = new JRadioButton("PHO");
       pho.setFont(font);

       monchinh = new ButtonGroup();
       monchinh.add(com);
       monchinh.add(bun);
       monchinh.add(pho);



       monchinhpPanel.setLayout(new GridLayout(1,3));
       monchinhpPanel.add(com);
       monchinhpPanel.add(bun);
       monchinhpPanel.add(pho);

       //
       traicay = new JCheckBox("Trai cay");
       traicay.setFont(font);
       nuocngot = new JCheckBox("Nuoc ngot");
       nuocngot.setFont(font);
       suachua = new JCheckBox("Sua chua");
       suachua.setFont(font);

       monphuPanel.setLayout(new GridLayout(1,3));
       monphuPanel.add(traicay);
       monphuPanel.add(nuocngot);
       monphuPanel.add(suachua);

       monphu = new ArrayList<JCheckBox>();
       monphu.add(traicay);
       monphu.add(nuocngot);
       monphu.add(suachua);



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
