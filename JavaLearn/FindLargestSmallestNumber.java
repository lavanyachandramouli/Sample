
/**
 * TODO: Find Largest and Smallest Number in an Array Example.
 * This Java Program show how to find Largest and Smallest number in an Array. 
 */
public class FindLargestSmallestNumber {
  public static void main (String args[]){
    // Array of 10 numbers. 
    int numbers[] = {99, 15, 25, 78, 55, 10, -10, 55, 25, 26};

    // Assign first element of an array to largest and smallest. 
    int smallest = numbers[0];
    int largest = numbers[0];

    for ( int i=1; i< numbers.length; i++){
      if(numbers[i] > largest)
        largest = numbers[i];
      else if(numbers[i] < smallest)
        smallest = numbers[i];   
    }
    System.out.println("Largest Number is : " + largest);
    System.out.println("Smallest Number is : " + smallest);
  }

}

