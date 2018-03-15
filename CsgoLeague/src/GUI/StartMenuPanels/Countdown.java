package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class Countdown extends JPanel {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    public Countdown(){
        setLayout(null);
        setLocation(25, 280);
        setSize(400,80);
        setBackground(colors.header);
        setVisible(true);
    }

}
