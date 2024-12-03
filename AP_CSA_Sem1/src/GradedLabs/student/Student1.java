package GradedLabs.student;

public class Student1 {
    private String firstName, lastName;
    private Address1 homeAddress, schoolAddress;
    private int test1, test2, test3;

    public Student1(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public Student1(String first, String last, Address1 homeAddress, Address1 schoolAddress, int t1, int t2, int t3) {
        firstName = first;
        lastName = last;
        homeAddress = homeAddress;
        schoolAddress = schoolAddress;
        test1 = t1;
        test2 = t2;
        test3 = t3;
    }

    public Student1(String first, String last, Address1 home, Address1 school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    public String getname(String X, String Y) {
        return firstName + " " + lastName;
    }

    public double getAverage() {
        double avg = (test1 + test2 + test3) / 3.0;
        return avg;
    }

    public void setTestScore(int test, int score) {
        if (test == 1)
            test1 = score;
        else if (test == 2)
            test2 = score;
        else if (test == 3)
            test3 = score;
    }

    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test#1 " + test1 + "\n" + "Test#2 " + test2 + "\n" + "Test#3 " + test3+"\n";
        if(test1>0&&test2>0&&test3>0){
            result+="TestAverage: "+getAverage();
        }

        return result;
    }
}
