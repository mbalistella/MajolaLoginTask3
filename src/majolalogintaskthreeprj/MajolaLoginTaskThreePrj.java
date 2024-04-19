/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package majolalogintaskthreeprj;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class MajolaLoginTaskThreePrj {
    // Create the learner object = instantiation/instatiate
   static  Login objLogin = new Login();
     
    
    public static void main(String[] args) {
       
        //call a method to login the user
        Login();
    }
    public static void Login(){
    objLogin.Registration();
    objLogin.setpassword(JOptionPane.showInputDialog("please enter your password"));
    objLogin.checkpasswordComplexity();
    objLogin.getuserName();
    objLogin.returnLoginStatus();
    }
    
       
    
    
    }
     
     
   
        
    

   
   

  
    
    




    
     
     
     
     
     
    
    

