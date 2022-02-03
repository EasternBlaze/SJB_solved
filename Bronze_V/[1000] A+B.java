/*
take user input of 2 interger A and B,
and print out the sum of them.
conditions: 0<A,B<10
*/


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         int A, B; 
         A = scan.nextInt();
         B = scan.nextInt();
        if(0<A && A < 10 && 0<B && B<10){
            System.out.println(A + B);
        }
    }
}
