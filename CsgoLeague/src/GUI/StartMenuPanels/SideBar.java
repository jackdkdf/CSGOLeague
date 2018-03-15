package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class SideBar extends JPanel {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    private  JLabel name, profilePic, currentTeam, team, upcomingEvents;
    private JButton statusOnline, statusOffline;

    public SideBar(){
        setLayout(null);
        setLocation(700, 0);
        setSize(300,600);
        setBackground(colors.sideBar);
        setVisible(true);

        //Profile Picture
        profilePic = jMethods.createJLabel("", 0, 10, 30, 60, 60, Color.BLACK);
        //profilePic = jMethods.createTestJLabel("", 10, Color.BLACK, 60, 60);
        profilePic.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/ProfilePics/JackPic.jpg", 60 , 60));

        //the name part
        name = jMethods.createJLabelHeader("Jack", 30, 80, 40, 100, 30, Color.white);
        //name = jMethods.createTestJLabel("Jack", 30, Color.white, 100, 30);

        //online button
        statusOnline = jMethods.createJButton("Online", 14, 80, 70, 75, 20, Color.BLUE, Color.black);
        //statusOnline = jMethods.createTestJButton("Online", 14, Color.BLUE);
        //offline button
        statusOffline = jMethods.createJButton("Offline", 14, 158, 70, 75, 20, Color.RED, Color.black);
        //statusOffline = jMethods.createTestJButton("Offline", 14, Color.RED);

        add(profilePic);
        add(name);
        add(statusOnline);
        add(statusOffline);
    }

}
