package GUI.StartMenuPanels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class SideBar extends JPanel {

    private  JLabel name, profilePic, currentTeam, team, upcomingEvents;
    private JButton status;

    public SideBar(){
        setLayout(null);
        setLocation(700, 0);
        setSize(300,600);
        setBackground(Color.darkGray);
        setVisible(true);
    }

}
