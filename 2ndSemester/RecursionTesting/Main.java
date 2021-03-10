public class Main {
  public BigInteger n;
  public void Main();

  // recursive
  public void factorial(BigInteger n) {
    if (n == 1) {
      return n;
    } else {
      return n * factorial(n - 1);
    }
  }

  // Traditional
  public void traditionalFactorial(BigInteger n) {
    for(int i = n; i <= 100; i++) {
      traditionalFactorial = traditionalFactorial * i;
    }
    return traditionalFactorial;
  }

  // Traditional Fibonacci
  public void traditionalFibonacci(BigInteger n) {
    if (n == 1 || n == 0) {
      return n;
    }
    return traditionalFibonacci(n - 1) + traditionalFibonacci(n - 2);
  }

  // Recursive Fibonacci
  public void recursiveFibonacci(BigInteger n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
  }
}
