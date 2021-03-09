import java.util.Random;
public class Main {
  public static void main(String[] args) {

    Random rand = new Random();

    int[] numbers = new int[100];

    // Populating the array with numbers between -99 and 99;

    for(int i = 0; i < 100; i++) {
      numbers[i] = rand.nextInt(199) - 99;
    }

    // Testing the methods
    CommonArrayAlgorithms m = new CommonArrayAlgorithms();

    System.out.println("\nThe sum of all elements of the array is: " + m.sum(numbers));
    System.out.println("\nThe average of all elements is: " + m.average(numbers));
    System.out.println("\nThe minimum value of all elements is: " + m.min(numbers));
    System.out.println("\nThe maximum value of all elements is: " + m.max(numbers));
    System.out.println("\nHere is a formatted version of the array: " + m.seperators(numbers));
    System.out.println("\nI found the value 52 in the array: " + m.linearSearch(numbers));
    System.out.println("\nHere is an array with the value at the 4nd index removed: " + m.seperators(m.remove(numbers)));
    System.out.println("\nHere is an array with a value at the 2nd index inserted: " + m.seperators(m.insert(numbers)));
    System.out.println("\nI swapped the values at the second and fourth indexes: " + m.seperators(m.swap(numbers)));
    System.out.println("\nI copied the entire array: " + m.seperators(m.copy(numbers)));

  }
}
