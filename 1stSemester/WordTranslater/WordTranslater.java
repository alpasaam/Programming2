import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WordTranslater {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Enter a random word.");
    String UserWord = input.nextLine();


    for (int x = 0; x < UserWord.length(); x++) {
      int i = ThreadLocalRandom.current().nextInt(0, UserWord.length() - 2);
      int j = ThreadLocalRandom.current().nextInt(i + 1, UserWord.length() - 1);
      System.out.println("i: " + i);
      System.out.println("j: " + j);
      String first = UserWord.substring(0, i);
      String middle = UserWord.substring(i + 1, j);
      String last = UserWord.substring(j+1,UserWord.length());
      String newWord = (first + UserWord.charAt(j) + middle  + UserWord.charAt(i) + last);
      System.out.println(newWord);
    }
  }
}
