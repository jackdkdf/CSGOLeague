package GUI.StartMenuPanels;

import GUI.Actions;
import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class SideBar {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    JPanel User, UserPic, Userstatus, team, matches;

    private  JLabel name, profilePic, currentTeam, myTeam, teamStanding, upcomingEvents;
    private JButton statusOnline, statusOffline;

    public void initSideBar(){
        //Creating the users profile picture
        UserPic = jMethods.createJPanel(70, 120, 700, 0, colors.sideBar);
        UserPic.setLayout(new BorderLayout());

        //Profile picture scaling
        profilePic = jMethods.createTestJLabel("", 0, null);
        profilePic.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/Pictures/JackPic.jpg", 60 , 60));

        //Adding user picture
        UserPic.add(profilePic, BorderLayout.CENTER);

        User = jMethods.createJPanel(230, 70, 770, 0, colors.sideBar);
        User.setLayout(new BorderLayout());

        name = jMethods.createTestJLabel("Jack", 20, Color.WHITE);

        User.add(name, BorderLayout.SOUTH);

        //User status panel
        Userstatus = jMethods.createJPanel(230, 50, 770, 70, colors.sideBar);
        Userstatus.setLayout(new FlowLayout(FlowLayout.LEFT, -15, 0));

        statusOnline = jMethods.createTestJButton("Online", 14, colors.ready);
        statusOffline = jMethods.createTestJButton("Offline", 14, colors.notReady);
        statusOnline.addActionListener(new Actions());
        statusOffline.addActionListener(new Actions());
        statusOnline.setActionCommand("Online");
        statusOffline.setActionCommand("Offline");

        //Adding components to User
        //User.add(name);
        Userstatus.add(statusOnline);
        Userstatus.add(statusOffline);

        //Current team information panel
        team = jMethods.createJPanel(300, 100, 700, 120, colors.sideBar);
        team.setLayout(new BoxLayout(team, BoxLayout.PAGE_AXIS));

        currentTeam = jMethods.createJLabelHeader("Current Team", 18, Font.BOLD, Color.white);
        myTeam = jMethods.createTestJLabel("MARVELOUS GAMING", 20, Color.white);
        teamStanding = jMethods.createTestJLabel("3rd place in league", 15, Color.YELLOW);

        team.add(currentTeam);
        team.add(myTeam);
        team.add(teamStanding);

        matches = jMethods.createJPanel(300, 360, 700, 220, colors.sideBar);
        matches.setLayout(new BoxLayout(matches, BoxLayout.PAGE_AXIS));

        upcomingEvents = jMethods.createJLabelHeader("Upcoming Matches", 25, Font.ITALIC, colors.ready);

        matches.add(upcomingEvents);

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

    public JPanel getUserPic() { return UserPic; }

    public JPanel getUserstatus() { return Userstatus; }
}
