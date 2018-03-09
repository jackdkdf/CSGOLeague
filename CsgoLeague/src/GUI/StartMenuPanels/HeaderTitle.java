package GUI.StartMenuPanels;

import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

public class HeaderTitle extends JPanel{

    JMethods jMethods = new JMethods();
    private  JLabel league;

    public HeaderTitle(){
        setLayout(new FlowLayout());
        setLocation(0, 0);
        setSize(700, 40);
        setBackground(new Color(40, 40, 40));
        setVisible(true);
        //Team Improvement League
        league = jMethods.createJLabelHeader("Ti LEAGUE", 40, 90, 5, 220, 45, Color.white);

        add(league);
    }

}
