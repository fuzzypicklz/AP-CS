package UsefulPractice.recursion;

public class fibbonacci {
    public static long Fib(long n){
        if(n == 0 || n == 1) return n;
        else return Fib(n-1)+Fib(n-2);
    }
}
