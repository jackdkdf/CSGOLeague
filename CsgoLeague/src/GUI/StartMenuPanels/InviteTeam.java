package GUI.StartMenuPanels;

import GUI.Actions;
import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class InviteTeam {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    JPanel button;
    private JButton inv;

    public void initInviteTeam(){
        button = jMethods.createJPanel(650, 180, 25, 370, colors.sideBar);
        button.setLayout(new BorderLayout());

        inv = jMethods.createTestJButton("Invite Team", 50, Color.white);
        inv.addActionListener(new Actions());
        inv.setActionCommand("Invite");

        button.add(inv, BorderLayout.CENTER);
    }

    public JPanel getButton() {
        return button;
    }
}
