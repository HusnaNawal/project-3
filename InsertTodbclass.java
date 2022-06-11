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
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;




/**
 *
 * @author Owner
 */
public class InsertTodbclass {
    
    Connection myConn;
    PreparedStatement pstmt;
    
    
public void insertData(){
    
    int ca18035age, ca18035id = 0;
    String ca18035name, ca18035gender;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter Name:");
    ca18035name=scan.next();
    
    System.out.println("Please enter Gender:");
    ca18035gender=scan.next();
    
    System.out.println("Please enter Age:");
    ca18035age=scan.nextInt();
    
    String SQL= "INSERT INTO ca18035users VALUES(?,?,?,?)";
    
    String user="root";
    String pass="";

   
    
    try{
     
      myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ca18035",user,pass);

 
        pstmt = myConn.prepareStatement(SQL);
        
        pstmt.setInt(1, ca18035id);
        pstmt.setString(2, ca18035name);
        pstmt.setString(3, ca18035gender);
        pstmt.setInt(4, ca18035age);
        
       int rowsAffected=pstmt.executeUpdate();

        myConn.close();
        
    }catch (SQLException e){
        
        e.printStackTrace();
         
        
    }
}  
}
