package UsefulPractice.Inheritance.Student;

public class HonorsStudent extends APStudent {
    private double Point;

public HonorsStudent(String studentName,int courses,String APName,double GPA)
{
super (studentName, courses, APName);
Point = GPA;
}

public String toString()
{
String result = super.toString();
result += "\n Grade Point Avr: " + Point;
return result;
}
}
