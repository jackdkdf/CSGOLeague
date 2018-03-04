package GUI.StartMenuPanels;

import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class SideBar extends JPanel {

    private  JLabel name, profilePic, currentTeam, team, upcomingEvents;
    private JButton status;
    JMethods jMethods = new JMethods();

    public SideBar(){
        setLayout(null);
        setLocation(700, 0);
        setSize(300,600);
        setBackground(Color.darkGray);
        setVisible(true);

        //Profile Picture
        profilePic = jMethods.createJLabel("", 0, 10, 30, 60, 60, Color.BLACK);
        profilePic.setIcon(jMethods.scaleImage("C:\\Users\\Jack\\Desktop\\CS\\CsLeague\\ProfilePics\\JackPic.jpg"));

        //the name part
        name = jMethods.createJLabel("Jack", 30, 100, 60, 100, 30, Color.white);

        add(profilePic);
        add(name);
    }

}
