package GUI;

import Resources.JMethods;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JTextField username, password;
    private JLabel usernameLabel, passwordLabel;
    private JButton back, login;
    JMethods jMethods = new JMethods();

    public Login(){
        super("Client");

        //Declaring jlabels
        usernameLabel = jMethods.createJLabel("Username", 30, 15, 20, 180, 36, Color.BLACK);
        passwordLabel = jMethods.createJLabel("Password", 30, 15, 60, 180, 36, Color.BLACK);

        //Username text field
        username = jMethods.createJTextFeid(24, 30, 170, 20, 200, 36);

        //Password text field
        password = jMethods.createJTextFeid(24, 30, 170 , 60 , 200 ,36);

        //login button I mean come on
        login = jMethods.createJButton("Login", 30, 15, 100, 110, 37);

        //making a back button cause no one likes getting stuck in doors
        back = jMethods.createJButton("Back", 30, 130, 100, 100, 37);

        //Add the objects
        add(usernameLabel);
        add(passwordLabel);
        add(username);
        add(password);
        add(login);
        add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}

