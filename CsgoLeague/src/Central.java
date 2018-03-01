import GUI.StartMenu;

import javax.swing.*;

public class Central {

    public static void main(String[] args){
        StartMenu startMenu = new StartMenu();
        startMenu.setSize(1000, 600);
        startMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startMenu.setResizable(false);
        startMenu.setLayout(null);
        startMenu.setVisible(true);
    }
}
