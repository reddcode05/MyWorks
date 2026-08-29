package mainpackages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class MyFirstFrame {

    public static void frames() {
        Border border = BorderFactory.createLineBorder(Color.black, 1);

        JLabel label = new JLabel();
        label.setForeground(Color.black);
        label.setBorder(border);

        JLabel label1 = new JLabel();
        label1.setForeground(Color.black);
        label1.setBorder(border);

        JFrame frame2 = new JFrame();
        frame2.setTitle("Frame # 2  ");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setSize(600, 500);
        frame2.getContentPane().setBackground(Color.lightGray);
        frame2.setResizable(false);
        frame2.add(label1);
        frame2.setVisible(true);

        JFrame frame1 = new JFrame();
        frame1.setTitle("Frame # 1");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 500);
        frame1.getContentPane().setBackground(Color.white);
        frame1.setResizable(false);
        frame1.add(label);
        frame1.setVisible(true);

        // AI: 
        int gap = 20;

        int totalWidth = frame1.getWidth() + frame2.getWidth() + gap;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int startX = (screenSize.width - totalWidth) / 2;
        int y = (screenSize.height - frame1.getHeight()) / 2;

        frame1.setLocation(startX, y);
        frame2.setLocation(startX + frame1.getWidth() + gap, y);

    }
}

public class Main {

    public static void main(String[] args) {

        MyFirstFrame.frames();

    }
}
