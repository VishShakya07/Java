/*import java.util.*;
public class SumN{
void printIncrease(int n) {
    if(n==1){       //base condition = terminate the infinite loop
        System.out.println(1);
        return;
    }
    printIncrease(n-1); // sub problem in recursion    //recursive call

    System.out.println(n);      //print after recursion
}
public static void main(String[] args) {
    SumN stack = new SumN();
    int n = 5;
    stack.printIncrease(n);         //function call
}
}
*/


import java.util.*;
public class SumN{
void printIncrease(int n) {
    if(n==1){       //base condition = terminate the infinite loop
        System.out.println(1);
        return;
    }
    System.out.println(n);      //print after recursion
    printIncrease(n-1); // sub problem in recursion    //recursive call

    
}
public static void main(String[] args) {
    SumN stack = new SumN();
    int n = 5;
    stack.printIncrease(n);         //function call
}
}