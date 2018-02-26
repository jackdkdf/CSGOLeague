package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 2/18/2018.
 */
public class StartMenu extends JFrame implements ActionListener {

    private JButton login, standings, stats, startScrim;
    private final int buttonHeight = 10;

    public StartMenu(){
        super("Client");

        //Login button or logout button
        login = new JButton("Login");
        login.addActionListener(this);
        login.setActionCommand("Login");
        login.setLocation(15, buttonHeight);
        login.setFont(new Font("Ubuntu", Font.PLAIN, 30));
        login.setSize(150,40);
        //See teams and players leaderboard
        standings = new JButton("Standings");
        standings.addActionListener(this);
        standings.setActionCommand("Standings");
        standings.setLocation(180, buttonHeight);
        standings.setFont(new Font("Ubuntu", Font.PLAIN, 30));
        standings.setSize(200,40);
        //See your personal stats
        stats = new JButton("Statistics");
        stats.addActionListener(this);
        stats.setActionCommand("Statistics");
        stats.setLocation(395,buttonHeight);
        stats.setFont(new Font("Ubuntu", Font.PLAIN, 30));
        stats.setSize(200, 40);
        //Starts a scrim with another team
        startScrim = new JButton("Start Scrim");
        startScrim.addActionListener(this);
        startScrim.setActionCommand("Search");
        startScrim.setLocation(15, 80);
        startScrim.setFont(new Font("Ubuntu", Font.PLAIN, 80));
        startScrim.setSize(580, 90);

        //Adds all the objects
        add(login);
        add(standings);
        add(stats);
        add(startScrim);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}
