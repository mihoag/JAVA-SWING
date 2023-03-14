import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.text.StyledEditorKit.BoldAction;

import java.awt.event.ActionEvent;

public class ActionControl implements ActionListener {
    private view vw;

     public ActionControl(view vw)
     {
        this.vw = vw;
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        String str  = e.getActionCommand();
        if(str.equals("View ToolBar"))
        {
         AbstractButton checkbox = (AbstractButton)e.getSource();
         boolean check = checkbox.isSelected();
         if(check)
          {
            this.vw.enable();
          }
          else
          {
            this.vw.disable();
          }
        }
        else{
        this.vw.setText(str);}
    }
    
}
