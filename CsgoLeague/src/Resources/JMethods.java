package Resources;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class JMethods {

    public JLabel createJLabel(String label, int fontsize, int x, int y, int w, int h, Color c){
        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, fontsize));
        jLabel.setLocation(x, y);
        jLabel.setSize(w, h);
        jLabel.setForeground(c);

        return jLabel;
    }

//    public JLabel createJLabelHeader(String label, int fontsize, int x, int y, int w, int h, Color c){
////        JLabel jLabel = new JLabel(label);
////        jLabel.setFont(new Font("Arial", Font.BOLD, fontsize));
////        jLabel.setLocation(x, y);
////        jLabel.setSize(w, h);
////        jLabel.setForeground(c);
////
////        return jLabel;
////    }

    public JLabel createJLabelHeader(String label, int fontsize, int fonttype, Color c){
        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", fonttype, fontsize));
        Font font = jLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel.setFont(font.deriveFont(attributes));
        jLabel.setForeground(c);

        return jLabel;
    }

    public JLabel createTestJLabel(String label, int fontsize, Color c){
        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.BOLD, fontsize));
        jLabel.setForeground(c);

        return jLabel;
    }

    public JLabel createPlayerJLabel(String label, Color c){
        JLabel jLabel = new JLabel(label);
        jLabel.setForeground(c);

        return jLabel;
    }

    public JLabel createTestPlayerJLabel(String label, int fontsize, Color bg, Color fg){
        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, fontsize));
        jLabel.setOpaque(true);
        jLabel.setForeground(fg);
        jLabel.setBackground(bg);

        return jLabel;
    }

    public JTextArea createJTextArea(String label, int rows, int cols, int fontsize, int x, int y, int w, int  h){
        JTextArea jTextArea;
        jTextArea = new JTextArea(label, rows, cols);
        jTextArea.setLocation(x, y);
        jTextArea.setFont(new Font("Arial", Font.PLAIN, fontsize));
        jTextArea.setSize(w, h);

        return jTextArea;
    }

    public JButton createJButton(String label, int fontsize, int width, int height, Color text, Color background){
        JButton jButton;
        jButton = new JButton(label);
        jButton.setFont(new Font("Arial", Font.PLAIN, fontsize));
        jButton.setSize(width, height);
        jButton.setBackground(background);
        jButton.setForeground(text);

        return  jButton;
    }

    public JButton createTestJButton(String label, int fontsize, Color text){
        JButton jButton;
        jButton = new JButton(label);
        jButton.setFont(new Font("Arial", 3, fontsize));
        jButton.setBorderPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setFocusPainted(false);
        jButton.setOpaque(false);
        jButton.setForeground(text);

        return  jButton;
    }

    public JButton createPositionedJButton(String label, int fontsize, int width, int height, int x, int y, Color text){
        JButton jButton;
        jButton = new JButton(label);
        jButton.setFont(new Font("Arial", 3, fontsize));
        jButton.setSize(width, height);
        jButton.setLocation(x, y);
        jButton.setBorderPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setFocusPainted(false);
        jButton.setOpaque(false);
        jButton.setForeground(text);

        return  jButton;
    }

    public JButton createJButtonHeader(String label, int fontsize, int x, int y, int width, int height){
        JButton jButton;
        jButton = new JButton(label);
        jButton.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, fontsize));
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
        jComboBox.setFont(new Font("Arial", Font.PLAIN, fontsize));
        jComboBox.setSize(w, h);

        return  jComboBox;
    }

    public JTextField createJTextFeid(int columns, int fontsize, int x, int y, int width, int height){
        JTextField jTextField;
        jTextField = new JTextField(columns);
        jTextField.setFont(new Font("Arial", Font.PLAIN, fontsize));
        jTextField.setLocation(x, y);
        jTextField.setSize(width, height);

        return jTextField;
    }

    public JPanel createJPanel(int width, int height, int x, int y, Color background){
        JPanel jPanel;
        jPanel = new JPanel();
        jPanel.setSize(new Dimension(width, height));
        jPanel.setLocation(x, y);
        jPanel.setBackground(background);
        jPanel.setVisible(true);

        return jPanel;
    }

    public ImageIcon scaleImage(String directory, int width, int height){
        ImageIcon picture = new ImageIcon(directory);
        Image resizedPicture = picture.getImage();
        Image newimg = resizedPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        picture = new ImageIcon(newimg);
        return picture;
    }
}
