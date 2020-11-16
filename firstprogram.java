// This program takes to number inputs from the user and multiplies them out using the Scanner class.


import java.util.*;

public class FirstProgram {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in); 
      System.out.print("Enter first number- ");  
      int a= sc.nextInt();  
      System.out.print("Enter second number- ");  
      int b= sc.nextInt(); 
    
      int c=a*b;

      System.out.println("Multiplication of x+y = " + c);
    }
}
