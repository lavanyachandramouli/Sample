import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java Factorial Example
 * This java Factorial Example Shows how to calculate factorial of a given 
 * number using Java. 
 */
public class NumberFactorial {

  /*
   * Factorial using Normal For loop  
   */

  //  public static void main (String args[]){
  //    int number = 5;
  //   
  //    int factorial = number;
  //    // Factorial of any number !n = 5*4*3*2*1
  //    for ( int i=(number - 1); i>1; i--){
  //      factorial = factorial * i;
  //      }
  //    System.out.println("Factorial of number is :" +factorial);\

  /*
   * Factorial using recursion.  
   */
  public static void main (String args[]) throws NumberFormatException, IOException{
    System.out.println( " Enter Number: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int result = fact(a);
    System.out.println("Factorial of number is : " +result);       

  }        
  static int fact(int b){
    if (b<=1)
      return 1;
    else 
      return b * fact (b-1);     
  }

}

