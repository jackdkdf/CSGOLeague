import javax.swing.*;

/**
 * Created by Jack on 2/18/2018.
 */
public class Central {

    public static void main(String[] args){
        GUI gui = new GUI();
        gui.setSize(900, 500);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setLayout(null);
        gui.setVisible(true);
    }

}
