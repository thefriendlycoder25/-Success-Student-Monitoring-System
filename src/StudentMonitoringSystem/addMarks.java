package StudentMonitoringSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addMarks extends JFrame implements ActionListener {
JLabel l1 , l2 ,name , gr;
JTextField eng , maths , science , total;
JButton display , update;
    int lh = 50;
    int lw = 50;
    int tw = 150;
    int th = 50;
    String total1;
    String english, math, sci;
    addMarks(){
//        setSize(500,800);
        setBounds(150,10,500,700);

        l1 = new JLabel("Name :");
        l1.setBounds(60,80,150,50);
        add(l1);

        l2 = new JLabel(" GR :");
        l2.setBounds(60,140,150,50);
        add(l2);

        name = new JLabel(marks.name);
        name.setBounds(300,80,250,50);
        add(name);

        gr = new JLabel(marks.gr);
        gr.setBounds(300,140,50,50);
        add(gr);

        eng = new JTextField();
        eng.setBounds(150,240,tw,th);
        add(eng);

        maths = new JTextField();
        maths.setBounds(150,300,tw,th);
        add(maths);

        science = new JTextField();
        science.setBounds(150,380,tw,th);
        add(science);

        total = new JTextField();
        total.setBounds(150,450,tw,th);
        add(total);


        display = new JButton("Calculate");
        display.setBounds(300,450,100,40);
        display.addActionListener(this);
        add(display);

        update = new JButton("Update");
        update.setBounds(150,550,100,40);
        update.addActionListener(this);
        add(update);



        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==display){
            total1 = String.valueOf(Integer.parseInt(eng.getText())+Integer.parseInt(maths.getText())+Integer.parseInt(science.getText()));
            total.setText(total1);
        }

        if(ae.getSource()==update){
            english = this.eng.getText();
            math = this.maths.getText();
            sci = this.science.getText();

            conn c = new conn();
            try{
                String str1 = "update stud_details set english = '"+english+"', maths = '"+math+"', science = '"+sci+"', tot1 = '"+total1+"' where  gr = '"+marks.gr+"' ; ";
                c.s.executeUpdate(str1);
                JOptionPane.showMessageDialog(null,"MArks added Successfully!");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new addMarks();
    }
}
