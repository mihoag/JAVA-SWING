package view;
import javax.swing.JFrame;

public class vidu
{
    public static void main(String[] argv)
    {
        JFrame jf = new JFrame();
        // Cài đặt kích thước cho giao diện
        jf.setSize(600,400);
        // đặt tên tiêu đề cho giao diện
        jf.setTitle("Minh Hoang");
        // Cài đặt vị trí hiển thị
        jf.setLocation(300,300);
        // setVisible để hiển thị, nếu true thì hiển thị ra màn hình, nếu false thì không hiển thị ra màn hình
        jf.setVisible(true);
        
        // Khi giao diện còn mở, thì chương trình vẫn đang chạy, thực hiện đóng cửa sổ giao diện , thực hiện đóng cửa sổ thì chương trình ngừng hoạt động

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}