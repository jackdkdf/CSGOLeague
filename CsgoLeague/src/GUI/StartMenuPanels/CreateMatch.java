package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class CreateMatch extends JPanel {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    private JLabel lock;

    public CreateMatch(){
        setLayout(new FlowLayout(1));
        setLocation(440, 280);
        setSize(235,80);
        setBackground(colors.createMatch);
        setVisible(true);

        lock = jMethods.createTestJLabel("", 0, null, 60, 70);
        lock.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/Pictures/Lock.png", 60, 70));

        add(lock);

    }

}
