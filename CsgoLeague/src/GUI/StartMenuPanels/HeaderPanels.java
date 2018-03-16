package GUI.StartMenuPanels;

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
        logoImage = jMethods.createJPanel(100, 100, 0, 0, colors.header);
        logoImage.setLayout(new FlowLayout(1,0,5));

        logo = jMethods.createTestJLabel("", 0, null);
        logo.setIcon(jMethods.scaleImage("/Users/jackfountain/Desktop/CSGOLeague/Pictures/JackPic.jpg", 80, 80));

        logoImage.add(logo);

        //Ti League Panel
        headerTitle = jMethods.createJPanel(600, 50, 100, 0, colors.header);
        headerTitle.setLayout(new FlowLayout(0));

        //Name of League
        league = jMethods.createTestJLabel("Ti LEAGUE", 40, Color.white);

        //Adding component to panel
        headerTitle.add(league);

        //Buttons panel
        headerButtons = jMethods.createJPanel(600, 50, 100, 50, colors.header);
        headerButtons.setLayout(new FlowLayout(1, 0, 5));

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

        //Shows the team standings
        standings = jMethods.createTestJButton("Standings", 20, Color.WHITE);
        standings.addActionListener(new GUI.Actions());
        standings.setActionCommand("Standings");

        //Shows you the leaderboard
        leaderboard = jMethods.createTestJButton("Leaderboard", 20, Color.white);
        leaderboard.addActionListener(new GUI.Actions());
        leaderboard.setActionCommand("Leaderboard");

        //Adds all the objects
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
