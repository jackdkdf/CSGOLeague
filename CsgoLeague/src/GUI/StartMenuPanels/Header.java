package GUI.StartMenuPanels;

import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class Header extends JPanel {

    private JButton match, stats, standings, leaderboard;
    private  JLabel league, name, profilePic, currentTeam, team, upcomingEvents;
    private final int buttonHeight = 60;
    JMethods jMethods = new JMethods();

    public Header() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
        setLocation(0, 40);
        setSize(700, 60);
        setBackground(new Color(40, 40, 40));
        setVisible(true);

        //Homepage/match page
        //match = jMethods.createJButtonHeader("Match", 25, 110, buttonHeight, 120, 30);
        match = jMethods.createTestJButton("Match", 25, Color.WHITE);
        match.addActionListener(new GUI.Actions());
        match.setActionCommand("Match");

        //See your personal stats
        //stats = jMethods.createJButtonHeader("Statistics", 25, 210, buttonHeight, 160, 30);
        stats = jMethods.createTestJButton("Statistics", 25, Color.white);
        stats.addActionListener(new GUI.Actions());
        stats.setActionCommand("Statistics");

        //See teams and players leaderboard
        //standings = jMethods.createJButtonHeader("Standings", 25, 350, buttonHeight, 170, 30);
        standings = jMethods.createTestJButton("Standings", 25, Color.WHITE);
        standings.addActionListener(new GUI.Actions());
        standings.setActionCommand("Standings");

        //leaderboard = jMethods.createJButtonHeader("Leaderboard", 25, 500, buttonHeight, 200, 30);
        leaderboard = jMethods.createTestJButton("Leaderboard", 25, Color.white);
        leaderboard.addActionListener(new GUI.Actions());
        leaderboard.setActionCommand("Leaderboard");

        //Adds all the objects
        //add(league);
        add(match);
        add(stats);
        add(standings);
        add(leaderboard);
    }


}
