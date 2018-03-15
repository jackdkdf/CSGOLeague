package GUI.StartMenuPanels;

import GUI.Actions;
import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class InviteTeam extends JPanel {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    private JButton inv;

    public InviteTeam(){
        setLayout(new BorderLayout());
        setLocation(25, 370);
        setSize(650,180);
        setBackground(colors.sideBar);
        setVisible(true);

        inv = jMethods.createTestJButton("Invite Team", 50, Color.white);
        inv.addActionListener(new Actions());
        inv.setActionCommand("Invite");

        add(inv, BorderLayout.CENTER);
    }

}
