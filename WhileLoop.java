/*
 * WhileLoop
 */

import java.util.Scanner;

public class WhileLoop {
  
  public static void main( String[] args ) {
    Scanner s = new Scanner( System.in );
    System.out.println( "Enter a number" );
    int a = s.nextInt();
    
    while(a==0||a==2||a==1||a==3||a==4||a==5) {
      System.out.println( "Your input is 0, 1, 2, 3, 4, 5 try again " );
      a = s.nextInt();
    }
    
  } // end main method
  
} // end class