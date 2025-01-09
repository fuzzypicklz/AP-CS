package UsefulPractice.Inheritance.Student;

public class School {
    public static void main (String[] args)
{
Student Frank1 = new Student ("Frank", 4);

AthleticStudent Suki = new AthleticStudent ("Suki", 5, "Soccer");
APStudent Sarah = new APStudent ("Sarah", 4, "Compsci AP");
HonorsStudent Mike = new HonorsStudent ("Mike", 4, "Chem AP",3.8);

BilingualStudent Gerog = new BilingualStudent("Gerog", 7, "Ching");

EliteAthleteStudent Jose = new EliteAthleteStudent("Jose", 1, "football", -392);
System.out.println (Frank1);
System.out.println ();

System.out.println (Suki);
System.out.println ();

System.out.println (Sarah);
System.out.println ();
System.out.println (Mike);
System.out.println ();
System.out.println (Gerog);
System.out.println ();
System.out.println (Jose);
System.out.println ();



// if ( Frank1 == Frank2)
// System.out.println ("These are same students.");
// else
// System.out.println ("These are two different students.");
}
}
