package GradedLabs;

public class StringSort {
    public static String SortString(String[] input){
        String result = "";
        for(int i = 0;i<input.length;i++){
            result+=input[i];
        }
        
        return result;
    }
    public static void main(String[] args){
        System.out.println(SortString({"a ", "dsafsdaF"+"123123"+"e[qw]e[]"}));
    }
}
