/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneactivty;
import javax.swing.*;


/**
 *
 * @author RC_Student_lab
 */
public class JOptionPaneActivty {

    public static void main(String[] args) {
        
        /* Create a class calucaltor that has  four methods:
       add(),subract(),divide(),mutiple(), all these return a value .
       Using a JOptionPane ,accepts input of two numbers from two user,
       display a menu for a use to choose what calucatlation they want to perfrom on the two numbers .Also
       use a while loop so that a user can choose other operations they  would to perform on the numbers ,
       do nout use an if statement but siwtch cases statements .tour apllcation should run up to zero
       */
        
        
        String number = JOptionPane.showInputDialog("Enter a number ");
        int num1= Integer.parseInt(number);//Change the input string to an integer type.
        
        number = JOptionPane.showInputDialog("Enter second number ");
        int num2 = Integer.parseInt(number);//Change the input string to an integer type.
       
         int choice = -1;//Initialize choice to an invalid option.
        
           // Display menu options to the user
                  String menu = """
              Choose an operation:
              1. Add
              2. Subtract
              3. Multiply
              4. Divide
              0. Exit
               """;
                  //Prompt the user for their choice and convert the input into an integer
            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
            // Process the user's choice using a switch statement
            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 + num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 - num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        JOptionPane.showMessageDialog(null, "Result: " + ((double) num1 / num2));
                    }                   
                    break;
                case 0:
                    //User has the option to end the session.
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    break;
                default:
                    //Respond to invalid user choices
                    JOptionPane.showMessageDialog(null, "Calculation not recorgnized");
                    break;
            }
        }
       
        
    }


