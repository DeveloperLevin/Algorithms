import java.util.Scanner;

public class Main {
  // Function to recursively print numbers from till the value of n is equal to 0
  public static void printNumb(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printNumb(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printNumb(n);
  }
}