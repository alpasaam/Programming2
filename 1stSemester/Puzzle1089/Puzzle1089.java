public class Puzzle1089{
  int digit, digits, firstReversed, difference, differences, secondReverse, sum, number;


  Puzzle1089(int input) {
    digits = Math.abs(input) % 1000;
    digit = digits;
  }

  public int firstReversed() {
    while (digits > 0) {
      firstReversed = firstReversed * 10 + digits % 10;
      digits = digits / 10;
    }
    return firstReversed;
  }

  public int difference() {
    difference = Math.abs(digit - firstReversed);
    differences = difference;

    return difference;
  }

  public int secondReverse() {
    while (difference > 0) {
      secondReverse = secondReverse * 10 + difference % 10;
      difference = difference / 10;
    }
    return secondReverse;
  }

  public int sum() {
    sum = secondReverse + differences;
    return sum;
  }

  public int getDigits() {
    return digits;
  }



}
