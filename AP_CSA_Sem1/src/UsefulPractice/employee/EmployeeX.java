package UsefulPractice.employee;
public class EmployeeX
{
String FirstName, LastName;
int SS_Num;
Address HomeAddress;


public EmployeeX(String F_name, String L_name, int SSN, Address H_address)
{
FirstName=F_name;
LastName=L_name;
SS_Num=SSN;
HomeAddress=H_address;
}

public EmployeeX(String F_name, String L_name)
{
FirstName=F_name;
LastName=L_name;
}

public int getSSN()
{
return SS_Num;
}
// public String getFname()
// public String getLname()
// public String changeName()
// public int getAge()
// public void empSalary()
// public void getOccupation()


public String getFname()
{
return FirstName;
}





public String toString()
{
String result;
result= FirstName + "\t"+ LastName+ "\t";
result += SS_Num + "\n";
result += HomeAddress;
return result;
}




}