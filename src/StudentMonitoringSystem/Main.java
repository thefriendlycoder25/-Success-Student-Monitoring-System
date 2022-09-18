package StudentMonitoringSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
   JLabel l1;
   JButton b1;
   Main(){
       setSize(800,500);

       l1 = new JLabel("Student Monitoring System");
       l1.setBounds(150,10,500,100);
       l1.setFont(new Font("Tahoma", Font.BOLD, 34));
       add(l1);

       b1 = new JButton("Login...");
       b1.setBounds(500,400,100,50);
       b1.addActionListener(this);
       add(b1);
       setLayout(null);
       setLocationRelativeTo(null);
       setVisible(true);


   }

  public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           new login();
           this.setVisible(false);
       }
   }

   public static void main(String[] args) {
      new Main();
   }
}
