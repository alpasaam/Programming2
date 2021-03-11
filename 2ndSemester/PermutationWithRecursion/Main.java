import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String aWord = "";
    PermutationIterator s = new PermutationIterator();
    Scanner in = new Scanner(System.in);
    aWord = in.nextLine();
    in.close();
    System.out.println(s.permutations(aWord));
  }
}
