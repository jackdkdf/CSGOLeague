package GUI.StartMenuPanels;

import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class SideBar extends JPanel {

    private  JLabel name, profilePic, currentTeam, team, upcomingEvents;
    private JButton statusOnline, statusOffline;
    JMethods jMethods = new JMethods();

    public SideBar(){
        setLayout(null);
        setLocation(700, 0);
        setSize(300,600);
        setBackground(Color.darkGray);
        setVisible(true);

        //Profile Picture
        profilePic = jMethods.createJLabel("", 0, 10, 30, 60, 60, Color.BLACK);
        profilePic.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/ProfilePics/JackPic.jpg"));

        //the name part
        name = jMethods.createJLabelHeader("Jack", 30, 80, 40, 100, 30, Color.white);

        //online button
        statusOnline = jMethods.createJButton("Online", 14, 80, 70, 75, 20, Color.BLUE, Color.black);
        //offline button
        statusOffline = jMethods.createJButton("Offline", 14, 158, 70, 75, 20, Color.RED, Color.black);

        add(profilePic);
        add(name);
        add(statusOnline);
        add(statusOffline);
    }

}
