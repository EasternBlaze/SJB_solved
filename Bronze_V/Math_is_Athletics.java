//print out the perimeter of the pyramid.
//the pyramid is made up of squares, and the number of squares
//increase by 1 for every floor it expands.

/*
피라미드의 둘레 구하기.
1. 밑면이 n개일 때, 위아래의 둘레는 n이다.
2. 양옆 역시 n이다.
3. 답은 늘 4n이 나올 것이다.
*/

/* 
BigInteger?
: the range of n varied from 0 to 10^9.
Since the range of int is only between +- 2,147,483,647,
it was unable to handle n over it.
meanwhile. the range of BigInteger is infinite!
What an impressive concept I've never heard about before.
*/ 

import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    BigInteger n = scan.nextBigInteger();
    BigInteger four = new BigInteger("4");
    System.out.print(n.multiply(four));
  }
}
