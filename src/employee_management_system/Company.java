package employee_management_system;




import java.util.ArrayList;

public class Company {


private String companyName;
private ArrayList<Employee> employeeList;   // can store ANY type of Employee

public Company(String companyName) {
    this.companyName  = companyName;
    this.employeeList = new ArrayList<>();
}


public void addEmployee(Employee emp) {
    employeeList.add(emp);
    System.out.println("\n  ✅ Employee \"" + emp.getName() + "\" added successfully!");
}


public void displayAllEmployees() {
    System.out.println("\n  ==========================================");
    System.out.println("  COMPANY : " + companyName);
    System.out.println("  TOTAL EMPLOYEES : " + employeeList.size());
    System.out.println("  ==========================================");

    if (employeeList.isEmpty()) {
        System.out.println("  No employees found!");
        return;
    }

 
    for (Employee emp : employeeList) {
        emp.displayDetails();   
    }
}


public void displayAllSalaries() {
    System.out.println("\n  ==========================================");
    System.out.println("  SALARY REPORT - " + companyName);
    System.out.println("  ==========================================");

    if (employeeList.isEmpty()) {
        System.out.println("  No employees found!");
        return;
    }

    double totalPayroll = 0;

    for (Employee emp : employeeList) {
        System.out.println("  " + emp.getName()
                           + " (ID: " + emp.getId() + ")"
                           + "  =>  Rs. " + emp.calculateSalary());  
        totalPayroll += emp.calculateSalary();
    }

    System.out.println("  ------------------------------------------");
    System.out.println("  Total Payroll  :  Rs. " + totalPayroll);
    System.out.println("  ==========================================");
}
}