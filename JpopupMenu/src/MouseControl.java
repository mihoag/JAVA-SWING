import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseControl implements MouseListener{
   private view vw;
   public MouseControl(view vw)
   {
    this.vw  = vw;
   }
@Override
public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
}
@Override
public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub
    if(e.isPopupTrigger())
    {
        this.vw.jpopup.show(e.getComponent(),e.getX(), e.getY());
    }
}
@Override
public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
    if(e.isPopupTrigger())
    {
        this.vw.jpopup.show(e.getComponent(), e.getX(), e.getY());
    }
}
@Override
public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stu
}
@Override
public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
}
    
}
