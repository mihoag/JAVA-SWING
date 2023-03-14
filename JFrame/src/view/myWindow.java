package view;

import javax.swing.JFrame;

public class myWindow extends JFrame{
    public myWindow()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showIt()
    {
        this.setVisible(true);
    }
    public void showIt(String title)
    {
      this.setTitle(title);
      this.setVisible(true);
    }
    public void showIt(String title, int height, int width)
    {
        this.setTitle(title);
        this.setSize(height,width);
        this.setVisible(true);
    }
    public static void main(String[] arg)
    {
        myWindow w1 = new myWindow();
        w1.showIt();
        myWindow w2 =  new myWindow();
        w2.showIt("Minh Hoang");
        myWindow w3 = new myWindow();
        w3.showIt("Minh Hoang", 400,300);
        }
    
}
