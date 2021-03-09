public class CommonArrayAlgorithms {
  public int sum(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return sum;
  }

  public double average(int[] numbers) {
    double average = 0;
    for (int num : numbers) {
      average += num;
    }
    average = average / numbers.length;
    return average;
  }

  public int min(int[] numbers) {
    int min = 99;
    for (int num : numbers) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }

  public int max(int[] numbers) {
    int max = -99;
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public String seperators(int[] numbers) {
    String newFormat = "";
    for (int i = 0; i < numbers.length; i++) {
      if (i > 0) {
        newFormat += " | ";
      }
      newFormat += numbers[i];
    }
    return newFormat;
  }

  public boolean linearSearch(int[] numbers) {
    int searchFor = 52;
    int position = 0;
    boolean found = false;
    while (!found && position < numbers.length) {
      if (numbers[position] == searchFor) {
        found = true;
      } else {
        position ++;
      }
    }
    if (found) {
      System.out.println("52 was found at index: " + position);
    }
    return found;
  }

  public int[] remove(int[] numbers) {
    int[] newArray = new int[numbers.length - 1];
    int position = 4;
    for (int i = 0, j = 0; i < numbers.length; i++) {
      if (i != position) {
        newArray[j++] = numbers[i];
      }
    }
    return newArray;
  }

  public int[] insert(int[] numbers) {
    int[] newArray = new int[numbers.length + 1];
    int position = 2;
    for (int i = 0; i < numbers.length + 1; i++) {
      if (i < position) {
          newArray[i] = numbers[i];
      } else if (i == position) {
          newArray[i] = 1000;
      } else {
        newArray[i] = numbers[i - 1];
      }
    }
    return newArray;
  }

  public int[] swap(int[] numbers) {
    int[] newArray = copy(numbers);
    int index1 = 2;
    int index2 = 4;
    int temp = newArray[index1];
    newArray[index1] = newArray[index2];
    newArray[index2] = temp;
    return newArray;
  }

  public int[] copy(int[] numbers) {
    int[] newArray = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      newArray[i] = numbers[i];
    }
    return newArray;
  }
}
