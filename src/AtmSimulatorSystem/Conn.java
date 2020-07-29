/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulatorSystem;

import java.sql.*;

public class Conn {
    Connection con;
    Statement stmt;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/project1","root","");
            stmt = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.err.print(e);
        }  
    }
}
