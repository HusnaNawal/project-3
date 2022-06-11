/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca18035;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;


/**
 *
 * @author Owner
 */
public class QueryFromdb {
    
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
    PreparedStatement pstmt;

    public void QueryData1(){
        PreparedStatement pstmt=null;
        ResultSet myRs=null;
        String Query="Select * from ca18035users where ca18035age <20";
        
         String user="root";
         String pass="";

        
        try{
         
            
         myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ca18035",user,pass);
           
         pstmt=myConn.prepareStatement(Query);
         myRs= pstmt.executeQuery(); 
         
         System.out.println("First Query - Age < 20");

         System.out.println("ID\t\tNAME\t\tGENDER\t\tAGE\n ");
         
         while(myRs.next()){
             
             System.out.println(myRs.getInt(1)+ "\t\t"+myRs.getString(2)+"\t\t"+myRs.getString(3)+"\t\t"+myRs.getInt(4));
             System.out.println();



        
         }
            
        }catch (SQLException e){
            
         e.printStackTrace();

        }
        
        
    }
    
    
public void QueryData2(){
        PreparedStatement pstmt=null;
        ResultSet myRs=null;
        String Query="Select * from ca18035users where ca18035gender='Female'";
        
         String user="root";
         String pass="";

        
        try{
         
            
         myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ca18035",user,pass);
           
         pstmt=myConn.prepareStatement(Query);
         myRs= pstmt.executeQuery();  
         
         System.out.println("Second Query - Female Only");
         System.out.println("ID\t\tNAME\t\tGENDER\t\t AGE\n ");
         
         while(myRs.next()){
             
             
              System.out.println(myRs.getInt(1)+ "\t\t"+myRs.getString(2)+"\t\t"+myRs.getString(3)+"\t\t"+myRs.getInt(4));
              System.out.println();



        
         }
            
        }catch (SQLException e){
            
         e.printStackTrace();

        }
        
        
    }    

   void showMenu()
   {
       char choice='\0';
       Scanner scanner = new Scanner(System.in);
       
       System.out.println(" A. Insert Data");
       System.out.println(" B. Query");
       System.out.println(" C. Exit");
       
       
       do
       {
         System.out.println("********************************************");
         System.out.println(" Enter an option:");
         System.out.println("********************************************");
         choice = scanner.next().charAt(0);
         System.out.println("\n");
         
         switch(choice)
         {
             case 'A':
                 System.out.println("********************************************");
                 System.out.println("Choice =" + choice);
                 System.out.println("********************************************");
                 
                 InsertTodbclass d = new InsertTodbclass();
                  d.insertData();
                 break;
                 
             case 'B':
                 System.out.println("********************************************");
                 System.out.println("Choice =" + choice);
                 QueryFromdb q = new QueryFromdb();
                 q.QueryData1();
                 q.QueryData2();
                 break;
                 
             case 'C':
                 System.out.println("********************************************");
                 break;
                 
             
                     
         }


       }while(choice != 'C');
       
      
  
   }
   


    
}
