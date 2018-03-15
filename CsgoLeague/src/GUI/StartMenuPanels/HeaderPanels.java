package GUI.StartMenuPanels;

import GUI.StartMenu;
import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

public class HeaderPanels {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    JPanel headerTitle, headerButtons, logoImage;

    private JButton match, stats, standings, leaderboard;
    private  JLabel league, logo;

    public void initHeader(){
        logoImage = jMethods.createJPanel(100, 100, colors.header);
        logoImage.setLayout(new FlowLayout(1,0,5));
        logoImage.setLocation(0,0);

        logo = jMethods.createTestJLabel("", 0, null, 60, 60);
        logo.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/ProfilePics/JackPic.jpg", 80, 80));

        logoImage.add(logo);

        //Ti League Panel
        headerTitle = jMethods.createJPanel(600, 50, colors.header);
        headerTitle.setLayout(new FlowLayout(0));
        headerTitle.setLocation(100, 0);

        //Name of League
        league = jMethods.createTestJLabel("Ti LEAGUE", 40, Color.white, 200, 45);

        //Adding component to panel
        headerTitle.add(league);

        //Buttons panel
        headerButtons = jMethods.createJPanel(600, 50, colors.header);
        headerButtons.setLayout(new FlowLayout(1, 0, 5));
        headerButtons.setLocation(100, 50);

        //Homepage/match page
        //match = jMethods.createJButtonHeader("Match", 25, 110, buttonHeight, 120, 30);
        match = jMethods.createTestJButton("Match", 20, Color.WHITE);
        match.addActionListener(new GUI.Actions());
        match.setActionCommand("Match");

        //See your personal stats
        //stats = jMethods.createJButtonHeader("Statistics", 25, 210, buttonHeight, 160, 30);
        stats = jMethods.createTestJButton("Statistics", 20, Color.white);
        stats.addActionListener(new GUI.Actions());
        stats.setActionCommand("Statistics");

        //See teams and players leaderboard
        //standings = jMethods.createJButtonHeader("Standings", 25, 350, buttonHeight, 170, 30);
        standings = jMethods.createTestJButton("Standings", 20, Color.WHITE);
        standings.addActionListener(new GUI.Actions());
        standings.setActionCommand("Standings");

        //leaderboard = jMethods.createJButtonHeader("Leaderboard", 25, 500, buttonHeight, 200, 30);
        leaderboard = jMethods.createTestJButton("Leaderboard", 20, Color.white);
        leaderboard.addActionListener(new GUI.Actions());
        leaderboard.setActionCommand("Leaderboard");

        //Adds all the objects
        //add(league);
        headerButtons.add(match);
        headerButtons.add(stats);
        headerButtons.add(standings);
        headerButtons.add(leaderboard);
    }

    public JPanel getHeaderTitle(){
        return headerTitle;
    }

    public JPanel getHeaderButtons() {
        return headerButtons;
    }

    public JPanel getLogoImage() {
        return logoImage;
    }
}
