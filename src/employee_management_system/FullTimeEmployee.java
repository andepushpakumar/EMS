package employee_management_system;

//================================================================
//FILE: FullTimeEmployee.java
//OOP CONCEPTS USED: Inheritance, Polymorphism
//================================================================

/*
*  INHERITANCE:
*  - FullTimeEmployee "extends" Employee
*  - This means FullTimeEmployee automatically gets all the
*    fields and methods from the Employee class (parent).
*  - We only add what is EXTRA for a full-time employee (bonus).
*
*  POLYMORPHISM:
*  - We OVERRIDE the calculateSalary() method here.
*  - The @Override tag tells Java we are replacing the parent version.
*  - For FullTimeEmployee: Salary = baseSalary + bonus
*/

public class FullTimeEmployee extends Employee {


private double bonus;


public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
    super(id, name, baseSalary); 
    this.bonus = bonus;
}

public double getBonus() { return bonus; }


public double calculateSalary() {
    return getBaseSalary() + bonus;
}


@Override
public void displayDetails() {
    System.out.println("  ------------------------------------------");
    System.out.println("  Employee Type : Full-Time Employee");
    System.out.println("  Employee ID   : " + getId());
    System.out.println("  Employee Name : " + getName());
    System.out.println("  Base Salary   : Rs. " + getBaseSalary());
    System.out.println("  Bonus         : Rs. " + bonus);
    System.out.println("  Total Salary  : Rs. " + calculateSalary());
    System.out.println("  ------------------------------------------");
}
}
