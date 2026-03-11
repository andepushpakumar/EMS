package employee_management_system;

//================================================================
//FILE: InternEmployee.java
//OOP CONCEPTS USED: Inheritance, Polymorphism
//================================================================

/*
*  INHERITANCE:
*  - InternEmployee also "extends" Employee (same parent class).
*  - It reuses all the common fields (id, name, baseSalary)
*    without rewriting them.
*
*  POLYMORPHISM:
*  - InternEmployee has its OWN version of calculateSalary().
*  - For Interns: Salary = stipend only (no baseSalary used)
*  - Same method name, different behavior = Polymorphism!
*/

public class InternEmployee extends Employee {


private double stipend;


public InternEmployee(int id, String name, double stipend) {
    super(id, name, 0);   
    this.stipend = stipend;
}

public double getStipend() { return stipend; }


@Override
public double calculateSalary() {
    return stipend;
}


@Override
public void displayDetails() {
    System.out.println("  ------------------------------------------");
    System.out.println("  Employee Type : Intern");
    System.out.println("  Employee ID   : " + getId());
    System.out.println("  Employee Name : " + getName());
    System.out.println("  Stipend       : Rs. " + stipend);
    System.out.println("  Total Salary  : Rs. " + calculateSalary());
    System.out.println("  ------------------------------------------");
}
}
