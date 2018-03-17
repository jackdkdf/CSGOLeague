package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class CreateMatch {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    public JPanel createMatch;

    private JLabel lock;

    public void initCreateMatch(){
        createMatch = jMethods.createJPanel(235, 80, 440, 280, colors.createMatch);
        createMatch.setLayout(new FlowLayout(1));

        lock = jMethods.createTestJLabel("", 0, null);
        lock.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/Pictures/Lock.png", 60, 70));

        createMatch.add(lock);
    }

    public JPanel getCreateMatch() { return createMatch; }
}
