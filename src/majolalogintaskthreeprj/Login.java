/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package majolalogintaskthreeprj;

import javax.swing.JOptionPane;
import static majolalogintaskthreeprj.MajolaLoginTaskThreePrj.objLogin;


/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Create attributes/instance variables
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    
    //Create the constructors - to set the default values to the attributes
    public Login() {
      this.firstName = "";
      this.lastName = "";
      this.userName = "";
      this.password = "";
    }
     // Create the getters/accessor methods
    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getuserName() {
        return userName;
    }

    public String getpassword() {
        return password;
    }
    //create setters/mutator methods
      public void setfirstName(String firstName) {
    this.firstName = firstName;
    }
    public void setlastName( String lastName) {
     this.lastName = lastName;
    }
    public void setuserName(String userName) {
    this.userName = userName;
    }
    public void setpassword(String password) {
    this.password =  password;
    }
    
    //methods to ensure that the code meets good coding standards 
    public void verifyUser(){
    if(userName.length()>=5 && userName.contains("_") && password.matches(".*[A-Z].*") && password.matches(".*[!@#%&*<>?/-~:+=^$]*."))
        JOptionPane.showMessageDialog(null, "welcome " +firstName+lastName+ "Great to see you again"  );
    
    }
    public boolean checkuserName(){
      if(userName.length()>=5 && userName.contains("_")){
          JOptionPane.showMessageDialog(null, "Username successfully captured");
          return true;
      }
      else{JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore "
                                                                 + "and is no more than 5 characters in length.");
      return false;
              }
    }
    public boolean checkpasswordComplexity(){
        if(password.length()>=8 && password.contains(".*[0,1,2,3,4,5,6,7,8,9]*.") && password.contains(".*[A-Z].*") && password.contains(".*[!@#%&*<>?/-~:+=^$]*.")){
             JOptionPane.showMessageDialog(null, "Password successfully captured");
             return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters"
                                                                       + " a capital letter, a number and a special character.");
            return false;
        }
        }
    public String registerUser(){
    if (checkpasswordComplexity() != checkpasswordComplexity()) {
        JOptionPane.showMessageDialog(null, "Password does not meet the complexity requirements");
        return password;
    }
    else if(checkuserName() != checkuserName()){
        JOptionPane.showMessageDialog(null, "The username is incorrectly formatted");
       return userName;}
    else {
     JOptionPane.showMessageDialog(null, "User registered successfully");
        return password;
   }
   }
   boolean returnLoginStatus(){
   if(password.length()>=8 && password.contains(".*[09]*.") && password.contains(".*[A-Z].*") && password.contains(".*[!@#%&*<>?/-~:+=^$]*.")){
             JOptionPane.showMessageDialog(null, "successfully loged in");}
             else{
   JOptionPane.showMessageDialog(null, "failed login");
           }
        return false;
   
       
   
   }
   public void Registration(){
   for (int x = 0; x<2; x++)
   { 
    objLogin.setfirstName(JOptionPane.showInputDialog("Please enter your first name"));
    objLogin.setlastName(JOptionPane.showInputDialog("Please enter your last name"));
    objLogin.setuserName(JOptionPane.showInputDialog("Please enter your username"));
    
    if  (userName.length()>=5 && userName.contains("_")){
          JOptionPane.showMessageDialog(null, "Username successfully captured");
          break;
   }
   else{JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore "
                                                                 + "and is no more than 5 characters in length.");
   }
   
}
}
}

    
    
      
    
    

