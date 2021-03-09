import javax.swing.*;

public class RectangleViewer {
  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setSize(500,450);
    frame.setTitle("Days until family member");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    RectangleComponent component = new RectangleComponent();
    frame.add(component);

    frame.setVisible(true);


  }
}
