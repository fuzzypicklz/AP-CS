package UsefulPractice.recursion;

public class mystery {
    public static int mystery(int a, int b){
        if(b==0) return 0;
        if(b%2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2)+a;

        //try working this out on paper 

        //btw this is literally just multiplication
    }
}
