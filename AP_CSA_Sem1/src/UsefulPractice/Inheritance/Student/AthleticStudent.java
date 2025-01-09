package UsefulPractice.Inheritance.Student;

public class AthleticStudent extends Student {
    private String sport;

public AthleticStudent(String studentName,int courses,String sportName)
{
super (studentName, courses);
sport = sportName;
}

public String toString()
{
String result = super.toString();
result += "\nSport: " + sport;
return result;
}
}
