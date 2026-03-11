package employee_management_system;



public abstract class Employee {

private int id;
private String name;
private double baseSalary;

public Employee(int id, String name, double baseSalary) {
    this.id         = id;
    this.name       = name;
    this.baseSalary = baseSalary;
}


public int getId()         { return id; }
public String getName()       { return name; }
public double getBaseSalary() { return baseSalary; }


public abstract double calculateSalary();


public void displayDetails() {
    System.out.println("  ------------------------------------------");
    System.out.println("  Employee ID   : " + id);
    System.out.println("  Employee Name : " + name);
    System.out.println("  Base Salary   : Rs. " + baseSalary);
    System.out.println("  Total Salary  : Rs. " + calculateSalary());
    System.out.println("  ------------------------------------------");
}
}