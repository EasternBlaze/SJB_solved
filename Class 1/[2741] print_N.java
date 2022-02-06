import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(read.readLine());
    for(int calc = 1; calc <= n; calc++){
      System.out.println(calc);
    }
  }
}
