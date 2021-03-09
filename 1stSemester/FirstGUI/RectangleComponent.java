import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Color;


public class RectangleComponent extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Day today = new Day();
    int year = today.getYear();
    Day myB = new Day(year + 1, 4, 22);
    Day neginB = new Day(year + 1, 5, 2);
    Day momB = new Day(year + 1, 10, 6);
    Day dadB = new Day(year + 1, 9, 23);
    Day sabB = new Day(year + 1,9,3);

    int myBx = myB.daysFrom(today);
    int neginBx = neginB.daysFrom(today);
    int momBx = momB.daysFrom(today);
    int dadBx = dadB.daysFrom(today);
    int sabBx = sabB.daysFrom(today);

    if (myBx > 365) {
      myBx = myBx - 365;

    }

    if (neginBx > 365) {
      neginBx = neginBx - 365;

    }

    if (momBx > 365) {
      momBx = momBx - 365;

    }

    if (dadBx > 365) {
      dadBx = dadBx - 365;

    }

    if (sabBx > 365) {
      sabBx = sabBx - 365;

    }


    Rectangle my = new Rectangle(100, 100, myBx,25);
    Rectangle negin = new Rectangle(100, 150, neginBx,25);
    Rectangle mom = new Rectangle(100, 200, momBx, 25);
    Rectangle dad = new Rectangle(100, 250, dadBx, 25);
    Rectangle sab = new Rectangle(100, 300, sabBx, 25);

    g2.setColor(Color.MAGENTA);
    g2.fill(my);

    g2.setColor(Color.GREEN);
    g2.fill(negin);

    g2.setColor(Color.BLUE);
    g2.fill(mom);

    g2.setColor(Color.RED);
    g2.fill(dad);

    g2.setColor(Color.CYAN);
    g2.fill(sab);

    g2.setColor(Color.BLACK);

    g2.drawString(Integer.toString(myBx), myBx + 110 , 115);
    g2.drawString(Integer.toString(neginBx), neginBx + 110 , 165);
    g2.drawString(Integer.toString(momBx), momBx + 110 , 215);
    g2.drawString(Integer.toString(dadBx), dadBx + 110 , 265);
    g2.drawString(Integer.toString(sabBx), sabBx + 110 , 315);


    g2.drawString("Saam", 50, 115);
    g2.drawString("Negin", 50, 165);
    g2.drawString("Mom", 50, 215);
    g2.drawString("Dad", 50, 265);
    g2.drawString("Sabrina", 50, 315);







    //writes the title of the chart
    g2.drawString("Days until family member's birthday", 150,30);
    g2.drawString("Days", 300, 375);
    g2.drawString("Names", 5, 225);

    //draw line for the Graphics
    Line2D.Double vertAxis = new Line2D.Double(100, 75, 100, 350);
    g2.draw(vertAxis);

    Line2D.Double HorizAxis = new Line2D.Double(100, 350, 465, 350);
    g2.draw(HorizAxis);





  }
}
