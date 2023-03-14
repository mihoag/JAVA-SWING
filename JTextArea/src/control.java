import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class control implements ActionListener{
    private view vw;
    public control(view vw)
    {
        this.vw = vw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       String str = e.getActionCommand();
       if(str.equals("statistic"))
       {
          this.vw.solve();
       }
    }
   


}
