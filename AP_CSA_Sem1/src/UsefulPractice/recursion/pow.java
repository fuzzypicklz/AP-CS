package UsefulPractice.recursion;

public class pow {
    public static int Power(int base, int exp){
        int result;

        if(exp==0) return 1;
        else result = base*Power(base, exp);
        
        return result;
    }
}
