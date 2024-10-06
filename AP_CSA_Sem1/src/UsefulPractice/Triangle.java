package UsefulPractice;

public class Triangle {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while(x<=10){
            y = 0;
            while(y<=x){
                System.out.print("x");
                y++;
            }
            System.out.print("\n");
            x++;
        }

        x = 10;
        while(x>=0){
            y = 0;
            while(y<=10){
                if(y-x<0)
                    System.out.print(" ");
                else System.out.print("x");
                y++;
            }
            System.out.print("\n");
            x--;
        }


    }
}
