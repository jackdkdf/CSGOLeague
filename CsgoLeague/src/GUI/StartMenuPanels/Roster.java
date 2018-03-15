package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class Roster extends JPanel {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    public Roster(){
        setLayout(null);
        setLocation(25, 120);
        setSize(650,150);
        setBackground(colors.sideBar);
        setVisible(true);
    }

}
