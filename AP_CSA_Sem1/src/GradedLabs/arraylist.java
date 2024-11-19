package GradedLabs;
import java.util.ArrayList;
public class arraylist {
    public static void ArrayListIncrement(ArrayList<String> list){
        list.forEach((n) -> System.out.println(n));

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void ArrayIncrement(String[] list){
        for (String n : list){
            System.out.println(n);
        }

        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args){
        ArrayList<String> AL = new ArrayList<>();

        AL.add("hi");
        AL.add("ih");
        AL.add("test");
        AL.add("words");
        AL.add("more words");
        AL.add("these");
        AL.add("are");
        AL.add("strings");
        AL.add("!!!");
        AL.add("end of transmission");

        String[] A = {"hi","ih","test","words","more words","these","are","strings","!!!","end of transmission"};

        ArrayListIncrement(AL);

        ArrayIncrement(A);
    }
}
