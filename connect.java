/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connect {
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/msc";
    String url1 = "jdbc:mysql://localhost:3306/msc?zeroDateTimeBehavior=convertToNull";
    String dbName = "msc";
    String driver = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "";
   
    void connect(String sql) {
        try{
        
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, userName, password);
        PreparedStatement statement = conn.prepareStatement(sql);
                    statement.execute(sql);
        } 
        
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error!");
        }
    }   
}
