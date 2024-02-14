import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame(){
        //JFrame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(10, 10, 1500, 800);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        ImageIcon image = new ImageIcon("C:\\BricksGame\\assets\\Husky_Furry2.jpg");
        this.setIconImage(image.getImage());
    }
}
