import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    String input = read.readLine();
    String inputArr[] = input.split(" ");
    int a = Integer.parseInt(inputArr[0]); 
    int b = Integer.parseInt(inputArr[1]);
    int c = Integer.parseInt(inputArr[2]); 
    int d = Integer.parseInt(inputArr[3]);
    int e = Integer.parseInt(inputArr[4]);
    int exponentialSum = a*a + b*b + c*c + d*d + e*e;
    //This seems to be a terrible attempt.
    //Would definitely try other one ASAP.
    int result = exponentialSum % 10;
    System.out.println(result);
  }
}
