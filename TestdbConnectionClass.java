/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca18035;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author Owner
 */
public class TestdbConnectionClass {
    
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
   
   
   
    public void setConnection(String user, String pass){
    
     //test the connection
    
    try{
        
        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ca18035",user,pass);
        myStmt = myConn.createStatement();
        System.out.println("Conncetion Success");
        
    }catch(SQLException e){
        
        System.out.println("Connection fail" + e);
    }
    }

    
}
