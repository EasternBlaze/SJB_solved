import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int counter = 1; counter <= 9; counter++){
      System.out.println(n + " * " + counter + " = " + counter*n);
    }
  }
}
