import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class control implements ActionListener {
    private viewCalculator vw;
    public control(viewCalculator vw)
    {
        this.vw  = vw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       String s = e.getActionCommand();
       if(s.equals("+"))
       {
          this.vw.cong();
       }
       else if(s.equals("-"))
       {
           this.vw.tru();
       }
       else if(s.equals("*"))
       {
          this.vw.nhan();
       }
       else if(s.equals("/"))
       {
          this.vw.chia();
       }
       else if(s.equals("^"))
       {
         this.vw.mu();
       }
       else if(s.equals("MOD"))
       {
         this.vw.mod();
       }
    }
}
