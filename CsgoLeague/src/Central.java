import GUI.StartMenu;

import javax.swing.*;
import java.io.IOException;

public class Central {

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch(Exception e) {
            e.printStackTrace();
        }

        StartMenu startMenu = new StartMenu();
        startMenu.setSize(1000, 600);
        startMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startMenu.setResizable(false);
        startMenu.setLayout(null);
        startMenu.setVisible(true);
    }
}
