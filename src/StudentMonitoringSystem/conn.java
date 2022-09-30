package StudentMonitoringSystem;

import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn(){
        String url = "jdbc:mysql://localhost:3306/studmonsys";
        String username = "root";
        String password = "12345678";
        try{
            c = DriverManager.getConnection(url, username,password);
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new conn();
    }

}
