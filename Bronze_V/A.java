import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    if(0<A && A<10 && 0<B && B <10){
      double result = (double) A / B;
          System.out.print(result);
    }
  }
}

/*
"Why did the division resulted in 0?""
When simply writing print(A/B),
the division is performed with two integers,
which would result the answer also being integer.
*/
