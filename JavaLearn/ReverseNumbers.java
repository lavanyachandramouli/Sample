
/**
 * Reverse Number uing Java
 * This Java Reverse Number Example show
 */
public class ReverseNumbers {
  public static void main (String args[]){
    int[] n = {1,2,3,4};
    String temp = "";
    
    for (int i=3; i>=0; i--){
      System.out.println(n[i]);
      temp = temp+n[i];
      }
    System.out.println(temp);    
  }
}

