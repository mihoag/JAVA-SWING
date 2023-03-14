import java.awt.event.ActionListener;

import javax.swing.Action;

import java.awt.Color;
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
     String s = e.getActionCommand();
     if(s.equals("Red Text"))
     {
      this.vw.changeFore(Color.RED);
     }
     else if (s.equals("Yellow Text"))
     {
        this.vw.changeFore(Color.YELLOW);
     }
     else if(s.equals("Green Text"))
     {
        this.vw.changeFore(Color.GREEN);
     }
     else if(s.equals("Red BackGround"))
     {
        this.vw.changeBackgr(Color.RED);
     }
     else if(s.equals("Yellow BackGround"))
    {
        this.vw.changeBackgr(Color.YELLOW);
    }
    else if(s.equals("Green BackGround"))
    {
        this.vw.changeBackgr(Color.GREEN);
    }
}
}
