/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca18035;



/**
 *
 * @author Owner
 */
public class CA18035 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TestdbConnectionClass t = new TestdbConnectionClass();
        t.setConnection("root","");
        
       
        
        QueryFromdb q = new QueryFromdb();
        q.showMenu();
        
    }
    
}
