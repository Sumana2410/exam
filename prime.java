package exam;
class Prime {
  public static void main(String[] args) {
      int n = 29;
      boolean isPrime = true;
      for (int i = 2; i <= n / 2; ++i) {
          if (n % i == 0) {
              isPrime = false;
              break;
          }
      }
      if (isPrime) {
          System.out.println(n + " is a prime number.");
      } else {
          System.out.println(n + " is not a prime number.");
      }
  }
}