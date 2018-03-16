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

    GridBagConstraints c = new GridBagConstraints();

    public void initRoster(){
        //Player names container
        players = jMethods.createJPanel(650, 150, 25, 120, colors.sideBar);
        players.setLayout(new GridBagLayout());

        player1 = jMethods.createPlayerJLabel("Jack", colors.playerText);
        player1.setHorizontalAlignment(0);

        player2 = jMethods.createPlayerJLabel("Powerr", colors.playerText);
        player2.setHorizontalAlignment(0);

        player3 = jMethods.createPlayerJLabel("Cyrus", colors.playerText);
        player3.setHorizontalAlignment(0);

        player4 = jMethods.createPlayerJLabel("Cyber", colors.playerText);
        player4.setHorizontalAlignment(0);

        player5 = jMethods.createPlayerJLabel("SMileyFace", colors.playerText);
        player5.setHorizontalAlignment(0);

        //Making grid contraints
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;

        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(30, 20, 10, 20);

        players.add(player1, c);

        c.gridx = 1;
        c.gridy = 0;

        players.add(player2, c);

        c.gridx = 2;
        c.gridy = 0;

        players.add(player3, c);

        c.gridx = 3;
        c.gridy = 0;

        players.add(player4, c);

        c.gridx = 4;
        c.gridy = 0;

        players.add(player5, c);

        button1 = jMethods.createJButton("Ready up", 15, 100, 20, Color.white, colors.notReady);
        button1.setHorizontalAlignment(0);

        button2 = jMethods.createTestPlayerJLabel("Ready", 15, colors.ready, Color.WHITE);
        button2.setHorizontalAlignment(0);

        button3 = jMethods.createTestPlayerJLabel("Ready", 15, colors.ready, Color.WHITE);
        button3.setHorizontalAlignment(0);

        button4 = jMethods.createTestPlayerJLabel("Ready", 15, colors.ready, Color.WHITE);
        button4.setHorizontalAlignment(0);

        button5 = jMethods.createTestPlayerJLabel("Ready", 15, colors.ready, Color.WHITE);
        button5.setHorizontalAlignment(0);

        //Making grid contraints
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 18, 10, 18);
        c.ipady = 40;
        c.ipadx = 0;

        players.add(button1, c, SwingConstants.CENTER);

        c.gridx = 1;
        c.gridy = 2;
        c.ipadx = 50;
        c.ipady = 50;

        players.add(button2, c);

        c.gridx = 2;
        c.gridy = 2;

        players.add(button3, c);

        c.gridx = 3;
        c.gridy = 2;

        players.add(button4, c);

        c.gridx = 4;
        c.gridy = 2;

        players.add(button5, c);


    }

    public JPanel getPlayers() {
        return players;
    }
}
