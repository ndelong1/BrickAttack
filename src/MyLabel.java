import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {

    public enum MyTextStyle{
        PLAIN, BOLD, ITALICS;
    }

    MyLabel(Color colors, int widX, int heiY, int fonS, MyTextStyle textStyle, String textInfo){
        int newTextStyle = switch (textStyle) {
            case PLAIN -> Font.PLAIN;
            case BOLD -> Font.BOLD;
            case ITALICS -> Font.ITALIC;
        };

        this.setText(textInfo);
        this.setForeground(colors);
        this.setPreferredSize(new Dimension(widX, heiY));
        this.setFont(new Font("Console", newTextStyle, fonS));
        this.setVerticalAlignment(JLabel.CENTER);

    }
}
