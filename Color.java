/*
 * for loop
 */
public class Color {
 
  public static void main( String[] args ) {
   
    String[] color = { "pink", "red", "blue", "skyblue" };
    for( int i = 0; i < color.length; i++) {
     System.out.println( color[i] ); 
    }
    change( color );
    System.out.println( "New color: " + color[0] );
  }
  
  public static void change( String[] s ) {
   
    s[0] = "yellow";
    
  }
}