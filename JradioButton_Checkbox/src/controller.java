import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;


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
        String mc = "";
        ArrayList<String> mp = new ArrayList<String>();
        Enumeration<AbstractButton> buttons_monchinh = vw.monchinh.getElements();
        while(buttons_monchinh.hasMoreElements())
         {
            AbstractButton b = buttons_monchinh.nextElement();
            if(b.isSelected())
            {
                mc = b.getText();
            }
         }
        
         for(AbstractButton b : vw.monphu)
         {
            if (b.isSelected())
            {
               mp.add(b.getText());
            }
         }

         vw.md.setMonchinh(mc);
         vw.md.setMonphu(mp);

         vw.Tinhtien();
    }
}
