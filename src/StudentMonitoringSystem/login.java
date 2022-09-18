package StudentMonitoringSystem;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    JLabel l1,l2;
    JTextField username ;
    JButton signIn, cancel;
    JPasswordField password;
    login(){
        setSize(500,300);

        l1 = new JLabel("Username");
        l1.setBounds(40,50,100,40);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40,120,100,40);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l2);

        username = new JTextField();
        username.setBounds(150,50,150,40);
        add(username);

        password = new JPasswordField();
        password.setBounds(150,120,150,40);
        add(password);



        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }
}
