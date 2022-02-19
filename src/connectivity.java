/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurabh
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class connectivity {
    Connection con=null;
    public static Connection ConnectDB(){
        try{
             Class.forName("org.sqlite.JDBC");
             Connection con=DriverManager.getConnection("jdbc:sqlite:ems.sqlite");
       return con;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
}
