/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import javax.swing.*;
/**
 *
 * @author Karl Butler
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //veriables 
        String gInput;
        String reverse = ""; 
//getting user input
       gInput = JOptionPane.showInputDialog("Please enter a word to see if it is a Palindrome \ndo not enter any uper case letters or punctuation");
       
//the try catch is looking for common punctuation 
       try{
           if( gInput.contains(".") || gInput.contains("?") || gInput.contains("!")|| gInput.contains(":") ){
              throw new Exception ();
           }else{
                for(int i = gInput.length() - 1; i >= 0; i--)
        {
            reverse = reverse + gInput.charAt(i);
        }
       
        System.out.println(reverse);
        System.out.println(gInput);
       
        if( gInput.equals(reverse)){
         System.out.println(gInput + " is a palindrome");
        } else{
            System.out.println(gInput + " is not a palindrome");
        }
       

           }
       }catch (Exception e){
           System.out.println("pleas do not input any punctuation or capidle letters");
       }
        
       
    }
    
}
