package dogkeyboard;

import java.io.*;
import java.util.*;

// Implements the keyboard class
public class Keyboard {
		
    Scanner keyboard;

    public Keyboard(){
        keyboard = new Scanner(System.in);
    }
	
    public void enterToContinue(){
       getString();
    }
    
    public String getString(){
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";
        try{
            inputString = buffRead.readLine();
        }
        catch(IOException e){
            System.out.println(e);
        }
        return inputString; 
    }
     
    public String getString(String prompt){
     	BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";
          try{
          	  System.out.print(prompt);
          	  inputString = buffRead.readLine();
          }
          catch(IOException e){
               System.out.println(e);
          }
          return inputString;        
    }   

    public char getChar(String prompt){
       char temp_char = ' ';
    boolean validInput = false;
    
    do {
        System.out.print(prompt);
        String input = keyboard.next();
        
        if (input.length() == 1) {
            temp_char = input.charAt(0);
            validInput = true;
        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }
    } while (!validInput);
    
    return temp_char;
}

    public char getChar(){
       String input = "";
       char temp_char = ' ';
       input = keyboard.next();
       temp_char = input.charAt(0);     
       return temp_char;
    }
        	 
     
    public int getInt(){
       int temp_int = 0;
       temp_int = keyboard.nextInt();
       return temp_int;
    }

    public int getInt(String prompt){
    int temp_int = 0;
    boolean validInput = false;
    
    do {
        try {
            System.out.print(prompt);
            temp_int = keyboard.nextInt();
            validInput = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            keyboard.next(); // Clear the invalid input
        }
    } while (!validInput);
    
    return temp_int;
}

    public double getDouble(){
       double temp_double = 0D;
       temp_double = keyboard.nextDouble();
       return temp_double;
    }

     public double getDouble(String prompt){
       double temp_double = 0D;
       System.out.print(prompt);
       temp_double = keyboard.nextDouble();
       return temp_double;
     } 
     
     public boolean getBool(String prompt){
    	 boolean temp_bool = false;
    boolean validInput = false;
    
    do {
        System.out.print(prompt);
        String temp = getString();
        temp = temp.toLowerCase(); // Convert to lowercase to ignore case
        
        if (temp.equals("true") || temp.equals("false")) {
            temp_bool = Boolean.parseBoolean(temp);
            validInput = true;
        } else {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
        }
    } while (!validInput);
    
    return temp_bool;
}
     
     public boolean getBool(){
    	 boolean temp_bool = false;
    	 String temp = getString();
    	 temp_bool = (temp.equals("true") ? true : false);
    	 return temp_bool;
     }     
}