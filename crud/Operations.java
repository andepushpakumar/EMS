package crud;

import java.util.*;

public class Operations {

    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Create  2.Read  3.Update  4.Delete  5.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: create(); break;
                case 2: read(); break;
                case 3: update(); break;
                case 4: delete(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    //CREATE
    static void create() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        list.add(new Employee(id, name, salary));
        System.out.println("Employee Added!");
    }

    //READ
    static void read() {
        if (list.isEmpty()) {
            System.out.println("No records found!");
            return;
        }

        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }

    //UPDATE
    static void update() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("Enter new name: ");
                e.name = sc.next();

                System.out.print("Enter new salary: ");
                e.salary = sc.nextDouble();

                System.out.println("Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    // DELETE
    static void delete() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            if (e.id == id) {
                it.remove();
                System.out.println("Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }
}
