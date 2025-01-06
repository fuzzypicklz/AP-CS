package UsefulPractice.classes.employee;
public class EmployeeXDr
{
public static void main(String args[])
{

Address HomeAddress = new Address("123 silver Spur Rd","PV","Ca",90274);
EmployeeX employee_1 = new EmployeeX("John","Smith",123456789, HomeAddress);
System.out.println(employee_1);
employee_1.getSSN();
System.out.println(employee_1.getFname());
employee_1.ChangeName("NewJohn","NewSmith");
System.out.println(employee_1.getFname());
System.out.println(employee_1);
}
}