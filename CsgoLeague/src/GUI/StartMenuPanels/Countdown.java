package GUI.StartMenuPanels;

import Resources.Colors;
import Resources.JMethods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 3/1/2018.
 */
public class Countdown {

    JMethods jMethods = new JMethods();
    Colors colors = new Colors();

    //400 80

    JPanel words, timer;
    private JLabel time, label;

    public void initCountdown(){
        //Container for the label
        words = jMethods.createJPanel(300, 80, 25, 280, colors.header);
        words.setLayout(new BorderLayout());

        //Match will start in: x
        label = jMethods.createTestJLabel("Match will start in:  ", 28, Color.white);

        words.add(label, BorderLayout.EAST);

        //Container for
        timer = jMethods.createJPanel(100, 80, 325, 280, colors.header);
        timer.setLayout(new BorderLayout());

        //Actually counts down
        time = jMethods.createTestJLabel("16:59", 28, Color.white);

        timer.add(time, BorderLayout.CENTER);
    }


    public JPanel getWords(){
        return words;
    }

    public JPanel getTimer(){
        return timer;
    }

}
