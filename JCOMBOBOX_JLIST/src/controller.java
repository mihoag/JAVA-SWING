import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
public class controller implements ActionListener{
    private view vw;
    public controller(view vw)
    {
        this.vw = vw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String mc = vw.monchinh.getSelectedItem().toString();
      
        
         List<String> x = vw.monphu.getSelectedValuesList();


         vw.md.setMonchinh(mc);
         ArrayList<String> mp = new ArrayList<String>();
         for(String s : x)
         {
            mp.add(s);
         }
         //System.out.println(x);
         vw.md.setMonphu(mp);

         vw.Tinhtien();

         // Hien thi cac thanh thong bao

         String sotien = (String)JOptionPane.showInputDialog(vw, vw.info.getText() + "\n Nhap so tien : ","Thong bao", JOptionPane.PLAIN_MESSAGE);

         try {
            double tien = Double.valueOf(sotien);
            JOptionPane.showMessageDialog(vw,"So tien tra lai : " + (tien - vw.md.getTongtien()), "Thong bao", JOptionPane.PLAIN_MESSAGE );
         } catch (Exception e1) {
            // TODO: handle exception

            JOptionPane.showMessageDialog(vw, "Quy khac nhap sai", "Error", JOptionPane.ERROR_MESSAGE);

         }
    }
}
