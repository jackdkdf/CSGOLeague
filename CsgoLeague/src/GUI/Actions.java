package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 3/1/2018.
 */
public class Actions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        switch (cmd){
            case "Match":
                JOptionPane.showMessageDialog(null,"Match");
                break;
            case "Statistics":
                JOptionPane.showMessageDialog(null,"Stats");
                break;
            case "Standings":
                JOptionPane.showMessageDialog(null,"Standings");
                break;
            case "Leaderboard":
                JOptionPane.showMessageDialog(null,"Leaderboard");
                break;
            case "Invite":
                JOptionPane.showMessageDialog(null, "Invite Team");
                break;
            case "Online":
                JOptionPane.showMessageDialog(null, "Online");
                break;
            case "Offline":
                JOptionPane.showMessageDialog(null, "Offline");
                break;
            case "Ready":
                JOptionPane.showMessageDialog(null, "Readied up");
                break;
        }
    }

}
