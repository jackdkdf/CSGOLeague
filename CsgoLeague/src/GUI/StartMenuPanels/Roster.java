package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class Roster {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    JPanel players;

    private JLabel player1, player2, player3, player4, player5, button2, button3, button4, button5;
    private JButton button1;

    //button2, button3, button4, button5;

    public void initRoster(){
        //Player names container
        players = jMethods.createJPanel(650, 150, 25, 120, colors.sideBar);
        players.setLayout(new GridLayout(2,5));

        player1 = jMethods.createPlayerJLabel("Jack", colors.playerText);
        player2 = jMethods.createPlayerJLabel("Powerr", colors.playerText);
        player3 = jMethods.createPlayerJLabel("Cyrus", colors.playerText);
        player4 = jMethods.createPlayerJLabel("Cyber", colors.playerText);
        player5 = jMethods.createPlayerJLabel("SMileyFace", colors.playerText);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        button1 = jMethods.createJButton("Ready up", 15, 100, 20, Color.white, Color.BLUE);
        button2 = jMethods.createTestPlayerJLabel("Ready", 15, Color.BLUE, Color.WHITE);
        button3 = jMethods.createTestPlayerJLabel("Ready", 15, Color.BLUE, Color.WHITE);
        button4 = jMethods.createTestPlayerJLabel("Ready", 15, Color.BLUE, Color.WHITE);
        button5 = jMethods.createTestPlayerJLabel("Ready", 15, Color.BLUE, Color.WHITE);

        players.add(button1);
        players.add(button2);
        players.add(button3);
        players.add(button4);
        players.add(button5);

    }

    public JPanel getPlayers() {
        return players;
    }
}
