package GradedLabs.inheritanceHospital;

public class HospitalDriver {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 123, 50000);
        OperationsStaff opsStaff = new OperationsStaff("Jane Smith", 456, 60000, "Operations");
        Surgeon surgeon = new Surgeon("Dr. Brown", 789, 150000, "Surgery", "MD", "Cardiology");
        Janitor janitor = new Janitor("Mike Johnson", 101, 30000, "Maintenance", 15);
        MedicalStaff medStaff = new MedicalStaff("Dr. Green", 202, 120000, "General", "PhD");

        System.out.println(emp);
        System.out.println();
        System.out.println(opsStaff);
        System.out.println();
        System.out.println(surgeon);
        System.out.println();
        System.out.println(janitor);
        System.out.println();
        System.out.println(medStaff);
        System.out.println();
    }
}
