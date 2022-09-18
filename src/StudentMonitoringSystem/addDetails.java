package StudentMonitoringSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;

public class addDetails extends JFrame {
    JLabel l1, l2, l3, l4 ,l5 , l6, l7, l8;
    JTextField name, age, aadhar , gr , address , contact;
    JButton submit;
    JRadioButton male, female;
    JDateChooser dob;
    //size variables
    int labX = 60;
    int labH = 50;
    int labW = 100;
    int txtX = 200;
    int txth = 40;
    int txtW = 150;
    addDetails(){
        setSize(500,800);

        l1 = new JLabel("Name");
        l1.setBounds(labX,40,labW,labH);
        add(l1);

         l2 = new JLabel("DOB");
        l2.setBounds(labX,100,labW,labH);
        add(l2);

         l3 = new JLabel("Age");
        l3.setBounds(labX,160,labW,labH);
        add(l3);

         l4 = new JLabel("Gender");
        l4.setBounds(labX,220,labW,labH);
        add(l4);

         l5 = new JLabel("Address");
        l5.setBounds(labX,280,labW,labH);
        add(l5);

         l6 = new JLabel("Aadhar");
        l6.setBounds(labX,340,labW,labH);
        add(l6);

         l7 = new JLabel("Contact");
        l7.setBounds(labX,400,labW,labH);
        add(l7);

         l8 = new JLabel("GR NO");
        l8.setBounds(labX,460,labW,labH);
        add(l8);

        //textfields
        name = new JTextField();
        name.setBounds(txtX,40,txtW,txth);
        add(name);

        dob = new JDateChooser();
        dob.setBounds(txtX, 100, txtW, txth);
        add(dob);

        age = new JTextField();
        age.setBounds(txtX,160,txtW,txth);
        add(age);

        address = new JTextField();
        address.setBounds(txtX,280,txtW,txth);
        add(address);

        aadhar = new JTextField();
        aadhar.setBounds(txtX,340,txtW,txth);
        add(aadhar);

        contact = new JTextField();
        contact.setBounds(txtX,400,txtW,txth);
        add(contact);

        gr = new JTextField();
        gr.setBounds(txtX,460,txtW,txth);
        add(gr);













        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new addDetails();
    }
}
