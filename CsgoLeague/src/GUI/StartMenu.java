package GUI;

import GUI.StartMenuPanels.*;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 2/18/2018.
 */
public class StartMenu extends JFrame {

    private final int buttonHeight = 60;
    JMethods jMethods = new JMethods();

    public StartMenu(){
        super("Client");
        getContentPane().setBackground(Color.black);

        add(new HeaderTitle());
        add(new Header());
        add(new SideBar());
        add(new Roster());
        add(new Countdown());
        add(new CreateMatch());
        add(new InviteTeam());
    }

}
