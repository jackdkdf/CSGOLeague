package GUI;

import Resources.JMethods;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 2/18/2018.
 */
public class StartMenu extends JFrame implements ActionListener {

    private JButton login, standings, stats, startScrim;
    private final int buttonHeight = 10;
    JMethods jMethods = new JMethods();

    public StartMenu(){
        super("Client");

        //Login button or logout button
        login = jMethods.createJButton("Login", 30, 15, buttonHeight, 150, 40);
        login.addActionListener(this);
        login.setActionCommand("Login");

        //See teams and players leaderboard
        standings = jMethods.createJButton("Standings", 30, 180, buttonHeight, 200 , 40);
        standings.addActionListener(this);
        standings.setActionCommand("Standings");

        //See your personal stats
        stats = jMethods.createJButton("Statistics", 30, 395, buttonHeight, 200, 40);
        stats.addActionListener(this);
        stats.setActionCommand("Statistics");

        //Starts a scrim with another team
        startScrim = jMethods.createJButton("Start Scrim", 80, 15, 80, 580, 90);
        startScrim.addActionListener(this);
        startScrim.setActionCommand("Search");

        //Adds all the objects
        add(login);
        add(standings);
        add(stats);
        add(startScrim);
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
