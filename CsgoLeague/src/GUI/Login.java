package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JTextField username, password;
    private JLabel usernameLabel, passwordLabel;

    public Login(){
        super("Client");

        //Declaring jlabels


        //Declare text fields
        username = new JTextField(24);
        username.setFont(new Font("Ubuntu", Font.PLAIN, 30));
        username.setLocation(150, 20);
        username.setSize(200, 36);
        password = new JTextField(24);
        password.setFont(new Font("Ubuntu", Font.PLAIN, 30));
        password.setLocation(150, 60);
        password.setSize(200, 36);

        //Add the objects
        add(username);
        add(password);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}

