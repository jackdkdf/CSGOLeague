package Resources;

import javax.swing.*;
import java.awt.*;

public class JMethods {

    public JLabel createJLabel(String label, int fontsize, int x, int y, int w, int h, Color c){
        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Calibri", Font.PLAIN, fontsize));
        jLabel.setLocation(x, y);
        jLabel.setSize(w, h);
        jLabel.setForeground(c);

        return jLabel;
    }

    public JTextArea createJTextArea(String label, int rows, int cols, int fontsize, int x, int y, int w, int  h){
        JTextArea jTextArea;
        jTextArea = new JTextArea(label, rows, cols);
        jTextArea.setLocation(x, y);
        jTextArea.setFont(new Font("Ubuntu", Font.PLAIN, fontsize));
        jTextArea.setSize(w, h);

        return jTextArea;
    }

    public JButton createJButton(String label, int fontsize, int x, int y, int width, int height){
        JButton jButton;
        jButton = new JButton(label);
        jButton.setFont(new Font("Ubuntu", Font.PLAIN, fontsize));
        jButton.setLocation(x, y);
        jButton.setSize(width, height);

        return  jButton;
    }

    public JButton createJButtonHeader(String label, int fontsize, int x, int y, int width, int height){
        JButton jButton;
        jButton = new JButton(label);
        jButton.setFont(new Font("Corbel", Font.BOLD+Font.ITALIC, fontsize));
        jButton.setForeground(Color.white);
        jButton.setBorderPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setFocusPainted(false);
        jButton.setOpaque(false);
        jButton.setLocation(x, y);
        jButton.setSize(width, height);

        return  jButton;
    }

    public JComboBox createJComboBox(String[] selections, int fontsize, int x, int y, int w, int h){
        JComboBox jComboBox;
        jComboBox = new JComboBox(selections);
        jComboBox.setSelectedIndex(0);
        jComboBox.setLocation(x, y);
        jComboBox.setFont(new Font("Ubuntu", Font.PLAIN, fontsize));
        jComboBox.setSize(w, h);

        return  jComboBox;
    }

    public JTextField createJTextFeid(int columns, int fontsize, int x, int y, int width, int height){
        JTextField jTextField;
        jTextField = new JTextField(columns);
        jTextField.setFont(new Font("Ubuntu", Font.PLAIN, fontsize));
        jTextField.setLocation(x, y);
        jTextField.setSize(width, height);

        return jTextField;
    }

    public ImageIcon scaleImage(String directory){
        ImageIcon picture = new ImageIcon(directory);
        Image resizedPicture = picture.getImage();
        Image newimg = resizedPicture.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        picture = new ImageIcon(newimg);
        return picture;
    }
}
