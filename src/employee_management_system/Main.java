package employee_management_system;




import java.util.Scanner;

public class Main {

public static void main(String[] args) {

   
    Scanner scanner = new Scanner(System.in);


    Company company = new Company("Empliz Innvations Pvt. Ltd.");

    System.out.println("  ==========================================");
    System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
    System.out.println("   Empliz Innovatons Pvt. Ltd.");
    System.out.println("  ==========================================");

    int choice = 0;


    while (choice != 5) {

        
        System.out.println("\n  ---------- MAIN MENU ----------");
        System.out.println("  1. Add Full-Time Employee");
        System.out.println("  2. Add Intern");
        System.out.println("  3. Display All Employees");
        System.out.println("  4. Display Salary Report");
        System.out.println("  5. Exit");
        System.out.print("\n  Enter your choice: ");

        choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {

            
            case 1:
                System.out.println("\n  --- Add Full-Time Employee ---");

                System.out.print("  Enter Employee ID     : ");
                int ftId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("  Enter Employee Name   : ");
                String ftName = scanner.nextLine();

                System.out.print("  Enter Base Salary     : ");
                double ftSalary = scanner.nextDouble();

                System.out.print("  Enter Bonus Amount    : ");
                double ftBonus = scanner.nextDouble();
                scanner.nextLine();

            
                FullTimeEmployee fte = new FullTimeEmployee(ftId, ftName, ftSalary, ftBonus);
                company.addEmployee(fte);
                break;

         
            case 2:
                System.out.println("\n  --- Add Intern ---");

                System.out.print("  Enter Intern ID       : ");
                int inId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("  Enter Intern Name     : ");
                String inName = scanner.nextLine();

                System.out.print("  Enter Stipend Amount  : ");
                double inStipend = scanner.nextDouble();
                scanner.nextLine();

              
                InternEmployee intern = new InternEmployee(inId, inName, inStipend);
                company.addEmployee(intern);
                break;

            case 3:
                company.displayAllEmployees();
                break;

          
            case 4:
                company.displayAllSalaries();
                break;

            case 5:
                System.out.println("\n  👋 Thank you! Exiting the system. Goodbye!");
                break;

           
            default:
                System.out.println("\n  ❌ Invalid choice! Please enter a number between 1 and 5.");
        }
    }

    scanner.close(); 
}
}
