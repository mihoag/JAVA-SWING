import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

public class control implements ActionListener
{
    private view vw;

    public control(view vw)
    {
        this.vw= vw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    JFileChooser fc = new JFileChooser();

    if(str.equals("Open"))
    {
        int val  = fc.showOpenDialog(this.vw);
        if(val == JFileChooser.APPROVE_OPTION)
        {
            File f = fc.getSelectedFile();
            String filename = f.getName();
            this.vw.md.setFilename(f.getAbsolutePath());
            this.vw.setText(this.vw.md.getFilename());

            if(filename.endsWith(".txt"))
            {
                try {
                    List<String> allLine = Files.readAllLines(f.toPath(),StandardCharsets.UTF_8);
                    String result  = "";
                    for(String s : allLine)
                     {
                        result += s;
                        result += "\n";
                     }
                     this.vw.md.setData(result);
                     this.vw.tx.setText(result);
                } catch (Exception e1) {
                    // TODO: handle exception
                    e1.printStackTrace();
                }
            }
        }

    }
    else if(str.equals("Save"))
    {
        if(this.vw.md.getFilename().length() > 0)
        {
            save(this.vw.md.getFilename());
        }
        else
        {
            int val  = fc.showSaveDialog(this.vw);
            if(val == JFileChooser.APPROVE_OPTION)
            {
            File f = fc.getSelectedFile();
            save(f.getAbsolutePath());
            }
        }
    }
        
    }
    public void save(String pathname)
    { 
        try {
            PrintWriter pv = new PrintWriter(pathname);
            pv.print(this.vw.tx.getText());
            pv.flush();
            pv.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        

    }
 
}