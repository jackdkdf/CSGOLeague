package GUI;

import GUI.StartMenuPanels.*;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 2/18/2018.
 */
public class StartMenu extends JFrame {

    //Define classes
    HeaderPanels headerPanels = new HeaderPanels();
    Countdown countdown = new Countdown();
    InviteTeam inviteTeam = new InviteTeam();
    Roster roster = new Roster();
    SideBar sideBar = new SideBar();

    public StartMenu(){
        super("Client");
        getContentPane().setBackground(Color.black);
        setLayout(null);
        init();

        add(headerPanels.getHeaderTitle());
        add(headerPanels.getHeaderButtons());
        add(headerPanels.getLogoImage());
        add(sideBar.getUser());
        add(sideBar.getMatches());
        add(sideBar.getTeam());
        add(roster.getPlayers());
        //add(roster.getReady());
        add(countdown.getWords());
        add(countdown.getTimer());
        add(new CreateMatch());
        add(inviteTeam.getButton());
    }

    public void init(){
        headerPanels.initHeader();
        countdown.initCountdown();
        inviteTeam.initInviteTeam();
        //Create match
        roster.initRoster();
        sideBar.initSideBar();
    }
}
