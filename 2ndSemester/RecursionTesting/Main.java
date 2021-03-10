public class Main {
  public BigInteger n;

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
      tFactorial = tFactorial * i;
    }
    return tFactorial;
  }

  // Traditional Fibonacci
  public void tFibonacci(BigInteger n) {
    if (n == 1 || n == 0) {
      return n;
    }
    return tFibonacci(n - 1) + tFibonacci(n - 2);
  }

  // Recursive Fibonacci
  public void rFibonacci(BigInteger n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return rFibonacci(n - 1) + rFibonacci(n - 2);
    }
  }
}
