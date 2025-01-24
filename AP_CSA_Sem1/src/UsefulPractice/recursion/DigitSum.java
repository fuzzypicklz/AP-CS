package UsefulPractice.recursion;

public class DigitSum {
    public static int SumDigit(int input){
        if(input<10){
            return input;
        }
        return input%10+SumDigit(input/10);
    }
}
