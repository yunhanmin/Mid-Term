/*
 * if
 */

import java.util.Scanner;

public class SmallerOne {
 
  public static void main( String[] args ) {
   
    Scanner s = new Scanner( System.in );
    int num1, num2;
    
    System.out.println( "Enter the first number: ");
    num1 = s.nextInt();
    System.out.println( "Enter the second number: ");
    num2 = s.nextInt();
    
    System.out.println( isSmaller( num1, num2 ) + " is the smaller number." );
    
  }
  
  public static int isSmaller( int x, int y) {
   
    if ( x==y ) {
     return x; 
    } else if ( x < y ) {return x;}
     else return y;
    }
    
  }
  
