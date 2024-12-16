package GradedLabs;
import java.util.Scanner;

public class SortMatrix {
    public static void print_me(int[][] input) {
        for (int[] i : input) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sort_meRow(int[][] input) {
        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            for (int k = 0; k < input[i].length; k++) {
                boolean breaker = false;
                for (int j = 0; j < input[i].length - k - 1; j++) {
                    if (input[i][j] > input[i][j + 1]) {
                        temp = input[i][j + 1];
                        input[i][j + 1] = input[i][j];
                        input[i][j] = temp;
                        breaker = true;
                    }
                }
                if (!breaker) {
                    break;
                }
            }
        }
        return input;
    }

    public static int[][] sort_meCol(int[][] input) {
        int temp = 0;
        for (int i = 0; i < input[0].length; i++) {
            for (int k = 0; k < input.length; k++) {
                boolean breaker = false;
                for (int j = 0; j < input.length - k - 1; j++) {
                    if (input[j][i] > input[j + 1][i]) {
                        temp = input[j + 1][i];
                        input[j + 1][i] = input[j][i];
                        input[j][i] = temp;
                        breaker = true;
                    }
                }
                if (!breaker) {
                    break;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            { 5, 12, 17, 12, 23 },
            { 1, 2, 4, 6, 8 },
            { 21, 14, 7, 19, 27 },
            { 3, 18, 9, 15, 25 },
            { 3, 8, 19, 5, 35 }
        };
        System.out.println("Array Before Sorting is : ");
        print_me(arr);
        arr.equals(sort_meCol(arr));
        System.out.println("Array After Sorting Col is : ");
        print_me(arr);
        arr = sort_meRow(arr);
        System.out.println("Array After Sorting Row is : ");
        print_me(arr);
    }
}