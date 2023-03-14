package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view;


public class listen_button implements ActionListener{
   private view vw;
   public listen_button(view x)
   {
    this.vw = x;
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
          String str = e.getActionCommand();
          if(str.equals("1"))
          {
            this.vw.change1();
          }
          else if(str.equals("2"))
          {
            this.vw.change2();
          }
          else if(str.equals("3"))
          {
            this.vw.change3();
          }
          else if(str.equals("4"))
          {
            this.vw.change4();
          }
   }
    
}
