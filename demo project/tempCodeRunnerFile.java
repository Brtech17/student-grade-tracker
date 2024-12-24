import java.util.*;

// Main Hospital Management System Class
public class HospitalManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Hospital Management System");
        boolean running = true;

        while (running) {
            System.out.println("\nSelect a module:");
            System.out.println("1. Patient Registration");
            System.out.println("2. Appointment Scheduling");
            System.out.println("3. Electronic Health Records (EHR)");
            System.out.println("4. Billing and Invoicing");
            System.out.println("5. Inventory Management");
            System.out.println("6. Staff Management");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    PatientRegistration.registerPatient(scanner);
                    break;
                case 2:
                    AppointmentScheduling.scheduleAppointment(scanner);
                    break;
                case 3:
                    ElectronicHealthRecords.viewEHR(scanner);
                    break;
                case 4:
                    BillingAndInvoicing.generateBill(scanner);
                    break;
                case 5:
                    InventoryManagement.manageInventory(scanner);
                    break;
                case 6:
                    StaffManagement.manageStaff(scanner);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

// Patient Registration Module
class PatientRegistration {
    public static void registerPatient(Scanner scanner) {
        System.out.println("\n--- Patient Registration ---");
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter patient contact number: ");
        String contact = scanner.nextLine();

        System.out.println("Patient Registered: " + name + ", Age: " + age + ", Contact: " + contact);
    }
}

// Appointment Scheduling Module
class AppointmentScheduling {
    public static void scheduleAppointment(Scanner scanner) {
        System.out.println("\n--- Appointment Scheduling ---");
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter doctor name: ");
        String doctor = scanner.nextLine();

        System.out.println("Appointment Scheduled: " + name + " on " + date + " with Dr. " + doctor);
    }
}

// Electronic Health Records (EHR) Module
class ElectronicHealthRecords {
    public static void viewEHR(Scanner scanner) {
        System.out.println("\n--- Electronic Health Records ---");
        System.out.print("Enter patient name to view records: ");
        String name = scanner.nextLine();

        // Placeholder for EHR data
        System.out.println("EHR for " + name + ": [No records found]");
    }
}

// Billing and Invoicing Module
class BillingAndInvoicing {
    public static void generateBill(Scanner scanner) {
        System.out.println("\n--- Billing and Invoicing ---");
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter total amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Bill Generated: Patient: " + name + ", Amount: $" + amount);
    }
}

// Inventory Management Module
class InventoryManagement {
    public static void manageInventory(Scanner scanner) {
        System.out.println("\n--- Inventory Management ---");
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Inventory Updated: Item: " + item + ", Quantity: " + quantity);
    }
}

// Staff Management Module
class StaffManagement {
    public static void manageStaff(Scanner scanner) {
        System.out.println("\n--- Staff Management ---");
        System.out.print("Enter staff name: ");
        String name = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.println("Staff Updated: Name: " + name + ", Position: " + position);
    }
}
