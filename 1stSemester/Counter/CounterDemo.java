public class CounterDemo {
  public static void main(String[] args) {
    Counter tally = new Counter();

    System.out.println("Initial value: " + tally.getValue());

    tally.click();
    System.out.println("Value: " + tally.getValue());

    tally.click();
    System.out.println("Value: " + tally.getValue());

    tally.undo();
    System.out.println("Value: " + tally.getValue());

    tally.reset();
    System.out.println("Value: " + tally.getValue());


  }
}
