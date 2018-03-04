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
        setLayout(null);
        setSize(700, 100);
        setBackground(new Color(40, 40, 40));
        setVisible(true);

        //Team Improvement League
        league = jMethods.createJLabel("Ti LEAGUE", 40, 80, 5, 210, 45, Color.white);

        //Homepage/match page
        match = jMethods.createJButtonHeader("Match", 25, 100, buttonHeight, 120, 30);
        match.addActionListener(new GUI.Actions());
        match.setActionCommand("Match");

//        //See your personal stats
        stats = jMethods.createJButtonHeader("Statistics", 25, 195, buttonHeight, 150, 30);
        stats.addActionListener(new GUI.Actions());
        stats.setActionCommand("Statistics");
//
//        //See teams and players leaderboard
        standings = jMethods.createJButtonHeader("Standings", 25, 330, buttonHeight, 160, 30);
        standings.addActionListener(new GUI.Actions());
        standings.setActionCommand("Standings");

        leaderboard = jMethods.createJButtonHeader("Leaderboard", 25, 475, buttonHeight, 200, 30);
        leaderboard.addActionListener(new GUI.Actions());
        leaderboard.setActionCommand("Leaderboard");

        //Adds all the objects
        add(league);
        add(match);
        add(stats);
        add(standings);
        add(leaderboard);
    }


}
