package GradedLabs.student;

public class AD {
    public static void main(String[] args){
        Student1[] students = new Student1[3];
        students[0] = new Student1("billy", "joe");
        students[1] = new Student1("jilly", "joe", new Address1("1234 silly lane", "sillytown", "PA", 1234), new Address1("3314 school place", "sillytown", "PA", 1234),96,75,100);
        students[2] = new Student1("alex", "stupid", new Address1("6942 stupid lane", "sillytown", "PA", 1234), new Address1("3314 school place", "sillytown", "PA", 1234));
        
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString()+"\n");
        }
    }
}
