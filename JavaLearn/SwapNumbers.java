
/**
 * TODO: Insert description here. (generated by sreenivasa)
 */
public class SwapNumbers {
//  public static void main (String args[]){
//    int n1 = 10;
//    int n2 = 20;
//    System.out.println("Number Before Swap");
//    System.out.println("First Interger: " +n1);
//    System.out.println("Second Interger: " +n2);
//    swapTest(n1,n2);    
//  }    
//   public static void swapTest(int n1, int n2){
//     
//     int temp = n1;
//     temp = n2;
//     n2=temp;
//     System.out.println("Number After Swap");
//     System.out.println("First Interger: " +n1);
//     System.out.println("Second Interger: " +n2);
//     
//   }
  
  // Without using swape without using third variable.
  public static void main (String args[]){
  int n1 = 10;
  int n2 = 20;
  System.out.println("Number Before Swap");
  System.out.println("First Interger: " +n1);
  System.out.println("Second Interger: " +n2);
  
  n2 = n2-n1;
  n1 = n1+n2;
  
  System.out.println("Number After Swap");
  System.out.println("First Interger: " +n1);
  System.out.println("Second Interger: " +n2);
  }      
  
  
}

