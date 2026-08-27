package mainpackages;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Label {

    static JLabel label = new JLabel(); // create a Label
    static JFrame frame = new JFrame();
    static ImageIcon image = new ImageIcon("C:\\Users\\Mai\\OneDrive\\Documents\\NetBeansProjects\\Practive\\src\\MainPackages\\logo.png");
    static Border border = BorderFactory.createLineBorder(Color.red, 2); // create border

    static void display() {

        label.setText("YOUR GAY?");// set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set a text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set tet TOP, CENTER, BOTTOM of immage icon
        label.setForeground(Color.red); // set the color text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // change the text font
        label.setIconTextGap(0); // set a gap between logo and text
        label.setBackground(Color.black);
        label.setOpaque(true); // to set a display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical text and image
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal text and image
        // label.setBounds(100, 100, 250, 250); // set x and y position within the size of height and width and show the image in a frame both text and image

        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        // frame.setLayout(null);// set the image to hide
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}

public class MyWindow {

    public static void main(String[] args) {
        Label.display();
    }
}
