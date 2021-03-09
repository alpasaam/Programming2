import java.awt.Rectangle;

public class CopyDemo{
  public static void main(String[] args){
    Rectangle box = new Rectangle(5,10,20,30);
    Rectangle box2 = box;

    System.out.println("box: " + box);
    System.out.println("box 2: " + box2);


    int luckynumber = 13;
    int luckynumber2 = luckynumber;

    System.out.println("luckynumber: " + luckynumber);
    System.out.println("luckynumber2: " + luckynumber2);

    luckynumber2 = 7;



  }
}
