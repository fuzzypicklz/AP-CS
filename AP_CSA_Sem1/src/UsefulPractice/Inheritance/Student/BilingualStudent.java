package UsefulPractice.Inheritance.Student;

public class BilingualStudent extends Student{
    private String language;
    public BilingualStudent(String studentName,int courses,String lang)
{
super (studentName, courses);
language = lang;
}

public String toString()
{
String result = super.toString();
result += "\n Second Language: " + language;
return result;
}
}
