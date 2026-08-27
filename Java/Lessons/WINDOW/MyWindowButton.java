package mainpackages;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        //ImageIcon icon = new ImageIcon("C:\\Users\\Mai\\OneDrive\\Documents\\NetBeansProjects\\Practive\\src\\MainPackages\\logo.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Mai\\OneDrive\\Documents\\NetBeansProjects\\Practive\\src\\MainPackages\\La_Peace.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100, 100, 250, 300);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        //button.addActionListener(e -> System.out.println("Sigma"));
        button.addActionListener(this);
        button.setText("Click If you are not GAY!");
        button.setFocusable(false);
        //button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button.setIconTextGap(0);
        button.setForeground(Color.black);
        button.setBackground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("Button");
        this.getContentPane().setBackground(Color.black);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("Hello, World!");
            //button.setEnabled(false);
            label.setVisible(true);
            button.setVisible(false);
        }
    }

}

public class MyWindow {

    public static void main(String[] args) {
        new MyFrame();
    }
}
