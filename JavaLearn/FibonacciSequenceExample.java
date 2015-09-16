
/**
 * Java Program to write Fibonacci Sequence.
 */

public class FibonacciSequenceExample {

  private static int index = 1;
  private static int stoppingPoint = 5;
  
  
  public static void main (String args[]){
    int n1 = 0;
    int n2 = 1;
    System.out.println("index: " + index +  " -> " +n1);    
    febonacciSequence(n1, n2);
  }
    public static void febonacciSequence(int n1, int n2) {      
      System.out.println("index: " + index +  " -> " +n2);
      
      if (index == stoppingPoint)
        return;
        index++;
        febonacciSequence(n2,n1+n2);
    }
}

