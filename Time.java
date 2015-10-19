/* 
 * Scanner for input
 * for loop
 * while loop
 * if/else if/else
 * switch
 * array
 */

/*
 * Switch
 */
import java.util.Scanner;

public class Time {
 
  public static void main( String[] args ) {
   
    Scanner s = new Scanner( System.in );
    int time;
    
    System.out.println( "Enter a number to find the time: ");
    time = s.nextInt();
    
    System.out.println( "Time is" +  ": " + getName(time) );
  }
  
  public static String getName( int time ) {
    switch( time ) {
      
      case 1:
        return "One";
      case 2:
        return "Two";
      case 3:
        return "Three";
      case 4:
        return "Four";
      case 5:
        return "Five";
      case 6:
        return "Six";
      case 7:
        return "Seven";
      case 8:
        return "Eight";
      case 9:
        return "Nine";
      case 10:
        return "Ten";
      case 11:
        return "Eleven";
      case 12:
        return "Twelve'o clock";
        
      default:
        return "Error - not a time number";
    }
  }
}
