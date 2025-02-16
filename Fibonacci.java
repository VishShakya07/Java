import java.util.*;
public class Fibonacci {
static int fibonacci(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    int sum1 = fibonacci(n-1);    
    int sum2 = fibonacci(n-2); 
    int Sum = sum1 + sum2;
    return Sum;  

}
public static void main(String[] args){
    int n = 10;
    for(int i=0; i<=n; i++){
    System.out.println(fibonacci(i));
    }
}
}
