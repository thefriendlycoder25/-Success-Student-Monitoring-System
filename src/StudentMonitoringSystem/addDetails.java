package StudentMonitoringSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class addDetails extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4 ,l5 , l6, l7, l8;
    JTextField name, age, aadhar , gr , address , contact;
    JButton submit;
    JRadioButton male, female;
    JDateChooser dob;
    ButtonGroup gen;
    Font fLabel = new Font("Tahoma", Font.PLAIN,19);
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
        l1.setFont(fLabel);
        add(l1);

         l2 = new JLabel("DOB");
        l2.setBounds(labX,100,labW,labH);
        l2.setFont(fLabel);
        add(l2);

         l3 = new JLabel("Age");
        l3.setBounds(labX,160,labW,labH);
        l3.setFont(fLabel);
        add(l3);

         l4 = new JLabel("Gender");
        l4.setBounds(labX,220,labW,labH);
        l4.setFont(fLabel);
        add(l4);

         l5 = new JLabel("Address");
        l5.setBounds(labX,280,labW,labH);
        l5.setFont(fLabel);
        add(l5);

         l6 = new JLabel("Aadhar");
        l6.setBounds(labX,340,labW,labH);
        l6.setFont(fLabel);
        add(l6);

         l7 = new JLabel("Contact");
        l7.setBounds(labX,400,labW,labH);
        l7.setFont(fLabel);
        add(l7);

         l8 = new JLabel("GR NO");
        l8.setBounds(labX,460,labW,labH);
        l8.setFont(fLabel);
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

        //radiobuttons
         gen = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(200,230,60, txth);
        gen.add(male);
        add(male);

        female = new JRadioButton("feMale");
        female.setBounds(290,230,70,txth);
        gen.add(female);
        add(female);

        //button
        submit = new JButton("Submit");
        submit.setBounds(300,550,150,60);
        submit.addActionListener(this);
        add(submit);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name = this.name.getText();
            String age = this.age.getText();
            String address = this.address.getText();
            String contact = this.contact.getText();
            String gr = this.gr.getText();
            String aadhar = this.aadhar.getText();

            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }
            else if(female.isSelected()){
                gender = "Female";
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String dob = dateFormat.format(this.dob.getDate());

//            System.out.println(name);
//            System.out.println(age);
//            System.out.println(dob);
//            System.out.println(address);
//            System.out.println(gender);
//            System.out.println(aadhar);
//            System.out.println(gr);
//            System.out.println(contact);

            conn c = new conn();
            try {
                String str = "insert into studdata (name, dob,age,gender,address,aadhar,contact,gr) values ('"+name+"','"+dob+"','"+age+"','"+gender+"','"+address+"','"+aadhar+"','"+contact+"','"+gr+"');";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Data is Successfully entered!!");
            }
            catch(Exception e){
                System.out.println(e);
            }



        }
    }
    public static void main(String[] args) {
        new addDetails();
    }
}
