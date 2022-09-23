package StudentMonitoringSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.ResultSet;

public class showDetails extends JFrame {
    JTable t1;
    JScrollPane sp1;
    showDetails(){
        setSize(1000,800);

        sp1 = new JScrollPane();
        sp1.setBounds(100,50,800,300);
        add(sp1);

        t1 = new JTable();
        sp1.setViewportView(t1);

        conn c = new conn();
        try{
            String str = "select * from studdata;";
            ResultSet rs = c.s.executeQuery(str);
            t1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            System.out.println(e);
        }

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new showDetails();
    }
}
