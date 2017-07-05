//The purpose of this program is to get a little more practice
//with the Scanner class and combining its methods

package javafundamentalsch2;
//Imports Scanner class in from util library
import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class JavaFundamentalsCh2
{//Begin Class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {//Start main
        
        //Declare Variables
        
        String name; //Holds the user's name
        int age; // Holds the users age int
        double income;// Holds the users income
        double dblIncomePerWeek;//Holds user income per week
        
        //Create a Scanner object to get User input
        Scanner kbd = new Scanner(System.in);
        
        
        
        //Ask User for Name FIRST EXAMPLE WHICH WORKS IN THIS ORDER
        //System.out.println("What is your name?:  ");
        //name = kbd.nextLine();//Store User input into name variable
        
        //Ask User for Age
        System.out.println("How old are you?:  ");
        age = kbd.nextInt();
        
        //Ask User for Income
        System.out.println("How much do you make a year?:  ");
        income = kbd.nextDouble();
        
        /* If you are going to have nextInt or other types run before a 
        nextLine() method is called then it will count the newline character
        in the previous method calls and finish the program 
        you must comsume the newline character by calling the 
        kbd.nextLine() method again before the assignment of the String
        variable takes place
         example below this removes the newline character from the keyboard buffer
         */
        kbd.nextLine();
        
        System.out.println("What is your name?:  ");
        name = kbd.nextLine();//Store User input into name variable
        
        //Display the information back to the user
        System.out.println("Hello " + name + ". Your age is " + age + 
                " and your income is " + income);
        //The income of the User divided by 52 weeks to get the user income per week
        // Uses the Math.round() method to round the divided double 
        System.out.println("Your income per week is $" + Math.round(income/52.00));
        
        /*                                              \\
            JOptionPane class (Dialog Boxes) (GUI)
        
                                                            
        */                                              //
        
        
        //Declare variables
        
        String nameBox;
        
        JOptionPane.showMessageDialog(null, "Hello, lets get started");
        
        nameBox = JOptionPane.showInputDialog("Please enter your name");
        
        JOptionPane.showMessageDialog(null, "It is nice to meet you " + nameBox);
        
        //Call the method created to quickly make MessageDialog boxes
        
        MsgBox(null, "I am going to ask you a couple questions now");
        
        //Call InputBox() method to create Input dialog box quickly
        
        InputBox("How much to you make a year");
        
 
        
        
               
        
        
        
        
        
        
        
        
        
        
    }//END MAIN METHOD
    
    
    //Create method to create a Message boxes without all the typing every time
    static void MsgBox(Component o, String s)
    {
         /*Creates a method that can be used to quickly create messages boxs
        //with out typing all extra arguments must be null, followed by 
        The string to display*/
        
        JOptionPane.showMessageDialog(o,s);
        
        
    }
            
    
    //Create a method to create a Input box quickly
    static void InputBox(String s)
    {
        
        JOptionPane.showInputDialog(s);
        
    }
    
}//END
