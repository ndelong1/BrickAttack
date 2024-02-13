/*----------------------------------------------------------------------------------
 |          _______       _______      __      _____       __     __                |
 |         |   __  \     |   ___  \   |  |    /  __  \    |  |  /  /                |
 |         |  |  \  \    |  |   |  |  |  |   /  /  \  \   |  | /  /                 |
 |         |  |__/  /    |  |__/  /   |  |   |  |   |__|  |  |/ _/                  |
 |         |   __  <     |   _   <    |  |   |  |         |   <__                   |
 |         |  |   \  \   |  | \  \    |  |   |  |         |  |\  \                  |
 |         |  |    |  |  |  |  \  \   |  |   |  |    ___  |  | \  \                 |
 |         |  |   /  /   |  |   \  \  |  |   \  \___/  /  |  |  \  \                |
 |         |__|__/__/    |__|    \__\ |__|    \_______/   |__|   \__\               |
 |                                                                                  |
 |                                                                                  |
 |   ________    _________    _________    ________      _______      __      __    |
 |  |   __   |  |         |  |         |  |   __   |    /   __   \   |  |   /  /    |
 |  |  |  |  |  |___   ___|  |___   ___|  |  |  |  |   /  /    \__\  |  |  /  /     |
 |  |  |__|  |     |   |        |   |     |  |__|  |  |  |           |  | /  /      |
 |  |   __   |     |   |        |   |     |   __   |  |  |           |  |/ _/       |
 |  |  |  |  |     |   |        |   |     |  |  |  |  |  |           |    <_        |
 |  |  |  |  |     |   |        |   |     |  |  |  |  \  \     ___   |  |\  \       |
 |  |  |  |  |     |   |        |   |     |  |  |  |   \  \___/  /   |  | \  \      |
 |  |__|  |__|     |___|        |___|     |__|  |__|    \_______/    |__|  \__\     |
  ----------------------------------------------------------------------------------*/

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //COLOUR VARS
        Color black = new Color(0, 0, 0);
        Color red = new Color(255, 0, 0);
        Color green = new Color(0, 255, 0);
        Color blue = new Color(0, 0, 255);
        Color purple = new Color(127, 0, 127);
        Color teal = new Color(4, 154, 156);

        MyFrame homeFrame = new MyFrame();
        JLabel title = new JLabel("Brick Attack", JLabel.CENTER);
        title.setForeground(purple);
        title.setPreferredSize(new Dimension(500, 200));
        title.setVerticalAlignment(JLabel.CENTER);
        homeFrame.add(title);

    }

}
