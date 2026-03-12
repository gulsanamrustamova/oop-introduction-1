/**
 * OOP Introduction: Procedural vs Object-Oriented approach.
 * Demonstrates WHY OOP is better with a real example.
 */
public class OopIntroductionBasic {

    // ─── Procedural approach (before OOP) ──────────────────────────
    static String getFullName(String first, String last) { return first + " " + last; }
    static void printEmployeeProc(String name, String dept, double salary) {
        System.out.printf("[Procedural] Employee: %-15s Dept: %-12s Salary: $%,.0f%n",
            name, dept, salary);
    }

    // ─── OOP approach: data + behavior in one unit ──────────────────
    static class Employee {
        String firstName;
        String lastName;
        String department;
        double salary;

        Employee(String firstName, String lastName, String department, double salary) {
            this.firstName  = firstName;
            this.lastName   = lastName;
            this.department = department;
            this.salary     = salary;
        }

        String getFullName()   { return firstName + " " + lastName; }
        double getAnnualPay()  { return salary * 12; }
        void   raiseSalary(double percent) { salary += salary * percent / 100; }

        void print() {
            System.out.printf("[OOP]        Employee: %-15s Dept: %-12s Salary: $%,.0f%n",
                getFullName(), department, salary);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Procedural Approach ===");
        printEmployeeProc(getFullName("Alice","Smith"), "Engineering", 5000);
        printEmployeeProc(getFullName("Bob","Jones"),   "Marketing",   4000);

        System.out.println("\n=== OOP Approach ===");
        Employee e1 = new Employee("Alice","Smith","Engineering", 5000);
        Employee e2 = new Employee("Bob","Jones",  "Marketing",   4000);
        e1.print();
        e2.print();

        System.out.println("\n=== OOP Advantage: Behavior with Data ===");
        e1.raiseSalary(10);
        System.out.println(e1.getFullName() + " after 10% raise: $" + e1.salary);
        System.out.printf("Annual pay: $%,.0f%n", e1.getAnnualPay());

        System.out.println("\n=== Why OOP? ===");
        System.out.println("1. Encapsulation  — data and methods together");
        System.out.println("2. Reusability    — create many Employee objects");
        System.out.println("3. Maintainability— change Employee class once");
        System.out.println("4. Modeling       — mirrors real-world entities");
    }
}
