package Patient;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Index extends JFrame implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3, l4;
    JButton b1, b2, b3, b4;

    Index() {
        f = new JFrame("Index Page");
        f.setBackground(Color.WHITE);
        f.setLayout(new GridLayout(3, 2)); // Setting layout

        // Initializing components
        l1 = new JLabel("Welcome to Hospital E-Token System");
        l2 = new JLabel(""); // Placeholder for future use
        l3 = new JLabel(""); // Placeholder for future use
        l4 = new JLabel(""); // Placeholder for future use

        b1 = new JButton("Login");
        b2 = new JButton("Register");
        b3 = new JButton("Exit");
        b4 = new JButton("Help");

        // Adding action listeners to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // Adding components to frame
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        // Final frame settings
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Login":
                JOptionPane.showMessageDialog(this, "Login button clicked");
                break;
            case "Register":
                JOptionPane.showMessageDialog(this, "Register button clicked");
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Help":
                JOptionPane.showMessageDialog(this, "Help button clicked");
                break;
        }
    }

    public static void main(String[] args) {
        new Index();
    }
}