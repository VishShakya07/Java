import java.util.*;
public class Factorial {
static int factorial(int n){
if(n==0){                       // base case
    //System.out.println(1);
    return 1;
}
int smallAns = factorial(n-1);      // 4*3*2*1      //recursive work
int ans = n * smallAns;   // 5*4*3*2*1      //self work                 // return n*ans
return ans;         
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   System.out.println(factorial(n));
}
}
