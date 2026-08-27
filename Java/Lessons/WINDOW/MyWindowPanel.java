package mainpackages;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow {

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Mai\\OneDrive\\Documents\\NetBeansProjects\\Practive\\src\\MainPackages\\logo.png");
        
        JLabel label = new JLabel();
        label.setIcon(icon);
        JLabel label1 = new JLabel();
        label1.setIcon(icon);
        JLabel label2 = new JLabel();
        label2.setIcon(icon);
        JLabel label3 = new JLabel();
        label3.setIcon(icon);
        
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 250, 250);
        
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        cyanPanel.setBounds(250, 250, 250, 250);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        
        redPanel.add(label);
        bluePanel.add(label1);
        greenPanel.add(label2);
        cyanPanel.add(label3);
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.add(cyanPanel);
    }
}
