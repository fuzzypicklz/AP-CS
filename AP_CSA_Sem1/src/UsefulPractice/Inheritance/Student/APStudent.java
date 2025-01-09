package UsefulPractice.Inheritance.Student;

public class APStudent extends Student {
    private String AP;

public APStudent(String studentName,int courses,String APName)
{
super (studentName, courses);
AP = APName;
}

public String toString()
{
String result = super.toString();
result += "\nAP: " + AP;
return result;
}
}
