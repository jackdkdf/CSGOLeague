package GUI.StartMenuPanels;

import GUI.Actions;
import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

public class SideBar {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    JPanel User, team, matches;

    private  JLabel name, profilePic, currentTeam, myTeam, teamStanding, upcomingEvents;
    private JButton statusOnline, statusOffline;

    public void initSideBar(){
        User = jMethods.createJPanel(300, 100, 700, 0, colors.sideBar);
        User.setLayout(null);
        //Profile picture scaling
        profilePic = jMethods.createJLabel("", 0, 10, 30, 60, 60, Color.BLACK);
        profilePic.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/Pictures/JackPic.jpg", 60 , 60));

        //Name label
        name = jMethods.createJLabelHeader("Jack", 30, 80, 40, 100, 30, Color.white);

        //Status buttons
        statusOnline = jMethods.createPositionedJButton("Online",14, 80, 20, 60, 70, Color.GREEN);
        statusOffline = jMethods.createPositionedJButton("Offline", 14, 80, 20, 120, 70, Color.RED);
        statusOnline.addActionListener(new Actions());
        statusOffline.addActionListener(new Actions());
        statusOnline.setActionCommand("Online");
        statusOffline.setActionCommand("Offline");

        //Adding components to User
        User.add(profilePic);
        User.add(name);
        User.add(statusOnline);
        User.add(statusOffline);

        team = jMethods.createJPanel(300, 100, 700, 100, colors.sideBar);
        team.setLayout(new BoxLayout(team, BoxLayout.PAGE_AXIS));

        currentTeam = jMethods.createTestJLabel("Current Team", 22, Color.white);
        myTeam = jMethods.createTestJLabel("MARVELOUS GAMING", 15, Color.white);
        teamStanding = jMethods.createTestJLabel("3rd place in league", 15, Color.YELLOW);

        team.add(currentTeam);
        team.add(myTeam);
        team.add(teamStanding);

        matches = jMethods.createJPanel(300, 400, 700, 200, colors.sideBar);
    }

    public JPanel getMatches() {
        return matches;
    }

    public JPanel getTeam() {
        return team;
    }

    public JPanel getUser() {
        return User;
    }
}
