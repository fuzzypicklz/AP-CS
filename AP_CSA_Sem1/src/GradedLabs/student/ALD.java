package GradedLabs.student;
import java.util.ArrayList;

public class ALD {
    public static void main(String[] args){
        ArrayList<Student1> students = new ArrayList<Student1>();
        students.add(new Student1("billy", "joe"));
        students.add(new Student1("jilly", "joe", new Address1("1234 silly lane", "sillytown", "PA", 1234), new Address1("3314 school place", "sillytown", "PA", 1234),96,75,100));
        students.add(new Student1("alex", "stupid", new Address1("6942 stupid lane", "sillytown", "PA", 1234), new Address1("3314 school place", "sillytown", "PA", 1234)));
        
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).toString()+"\n");
        }
    }
}
