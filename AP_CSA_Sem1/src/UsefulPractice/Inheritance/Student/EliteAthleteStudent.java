package UsefulPractice.Inheritance.Student;

public class EliteAthleteStudent extends AthleticStudent{
    
    private int div;
    public EliteAthleteStudent(String studentName,int courses,String sport,int division)
{
    super (studentName, courses, sport);
div = division;
}

public String toString()
{
String result = super.toString();
result += "\n Division: " + div;
return result;
}
}
