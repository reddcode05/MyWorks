package mainpackages;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

class Frame {

    static JFrame frame = new JFrame(); // create frame
    static ImageIcon image = new ImageIcon("C:\\Users\\Mai\\OneDrive\\Documents\\NetBeansProjects\\Practive\\src\\MainPackages\\logo.png"); // create Imageicon

    static void display() {
        frame.setTitle("My first frame"); // set title in a frame
        frame.setVisible(true); // set a frame to visible
        frame.setSize(450, 600); // set a frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to set the frame to stop run if i click the x in frame
        frame.setResizable(false); // set a to turn of the resizable

        frame.setIconImage(image.getImage()); // set icon of fame
        frame.getContentPane().setBackground(new Color(0, 0, 0)); // change color background

    }
}

public class MyWindow {

    public static void main(String[] args) {
        Frame.display();
    }
}
