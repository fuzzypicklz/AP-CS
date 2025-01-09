package UsefulPractice.Inheritance.Student;

public class Student {
    private String name;
private int numCourses;

public Student (String studentName, int courses)
{
name = studentName;
numCourses = courses;
}

public String toString()
{
String result = "Student name: " + name + "\n";
result += "Number of courses: " + numCourses;
return result;
}
}
