package GUI;

import Resources.JMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 2/18/2018.
 */
public class StartMenu extends JFrame implements ActionListener {

    private JButton match, stats, standings, leaderboard;
    private  JLabel league;
    public JPanel header, sideBar, roster, countdown, createMatch, invTeam;
    private final int buttonHeight = 60;
    JMethods jMethods = new JMethods();

    public StartMenu(){
        super("Client");
        getContentPane().setBackground(Color.black);
        header = new JPanel(null);
        header.setSize(700,100);
        header.setBackground(new Color(40, 40, 40));
        header.setVisible(true);

        //Team Improvement League
        league = jMethods.createJLabel("Ti League", 40, 80, 5, 180, 45, Color.white);

        //Homepage/match page
        match = jMethods.createJButtonHeader("Match", 25, 100, buttonHeight, 110, 30);
        match.addActionListener(this);
        match.setActionCommand("Match");

//        //See your personal stats
        stats = jMethods.createJButtonHeader("Statistics", 25, 195, buttonHeight, 150, 30);
        stats.addActionListener(this);
        stats.setActionCommand("Statistics");
//
//        //See teams and players leaderboard
        standings = jMethods.createJButtonHeader("Standings", 25, 330, buttonHeight, 160, 30);
        standings.addActionListener(this);
        standings.setActionCommand("Standings");

        leaderboard = jMethods.createJButtonHeader("Leaderboard", 25, 475, buttonHeight, 190,30);
        leaderboard.addActionListener(this);
        leaderboard.setActionCommand("Leaderboard");

        //Adds all the objects
        header.add(league);
        header.add(match);
        header.add(stats);
        header.add(standings);
        header.add(leaderboard);

        sideBar = new JPanel(null);
        sideBar.setLocation(700, 0);
        sideBar.setSize(300,600);
        sideBar.setBackground(Color.darkGray);
        sideBar.setVisible(true);

        roster = new JPanel(null);
        roster.setLocation(25, 120);
        roster.setSize(650,150);
        roster.setBackground(Color.darkGray);
        roster.setVisible(true);

        countdown = new JPanel(null);
        countdown.setLocation(25, 280);
        countdown.setSize(400,80);
        countdown.setBackground(new Color(40, 40, 40));
        countdown.setVisible(true);

        createMatch = new JPanel(null);
        createMatch.setLocation(440, 280);
        createMatch.setSize(235,80);
        createMatch.setBackground(Color.gray);
        createMatch.setVisible(true);

        invTeam = new JPanel(null);
        invTeam.setLocation(25, 370);
        invTeam.setSize(650,180);
        invTeam.setBackground(Color.darkGray);
        invTeam.setVisible(true);

        add(header);
        add(sideBar);
        add(roster);
        add(countdown);
        add(createMatch);
        add(invTeam);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        switch(cmd){
            case "Login":
                dispose();
                Login login = new Login();
                login.setSize(900, 500);
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                login.setResizable(false);
                login.setLayout(null);
                login.setVisible(true);
                break;
        }
    }

}
