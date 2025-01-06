package UsefulPractice.integers;

public class PlusPlus {
    public static void main(String[] args){
        int x = 1;
        x++; // the addition operation runs AFTER the line
        System.out.println(x);
        System.out.println(x++); // this returns the value of x BEFORE addition and then adds AFTER printing the value
        System.out.println(x); // so this should return 3

        int y = x+++x; // this is really x+(x+1)
        System.out.println(y);
        System.out.println(y--); // again this prints the value
    }
}
