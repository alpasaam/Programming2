// author Saam Naeini
// version 1.0
// since 2020-09-30

public class Counter {
  int value;

  // defult constructor
  /**
  * This method is use to decalre an initial Value of 0
  */
  public Counter() {
    value = 0;
  }

  // 2nd constructor for passing in an int
  /**
  * This method is use to decalre an initial Value
  * @param inivtialValue This is the initial value you set
  */
  public Counter(int initialValue) {
    value = initialValue;
  }

  /**
  * This method is used to add two integers
  * @return int This is the value.
  */
  public int getValue() {
    return value;
  }

  /**
  *This method is used to add one to the value
  */
  public void click() {
    value++;
  }

  /**
  *This method is used to reset the value to one
  */
  public void reset() {
    value = 0;
  }

  /**
  *This method is used to minus one from the value
  */
  public void undo() {
    value--;
  }



}
