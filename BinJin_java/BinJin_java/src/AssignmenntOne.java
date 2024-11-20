import java.util.ArrayList;
import java.util.Scanner;

public class AssignmenntOne {


        public static void main(String[] args) {
            ArrayList<Appointment> appointments = new ArrayList<>();
            HealthProfessional gp = new GeneralPractitioner(1, "Dr. Smith", "General Info", true);
            HealthProfessional ohp = new Specialist(2, "Dr. Tom", "General Info", "Dietitian");
            appointments.add(new Appointment("John", "1234567890", "08:00", gp));
            appointments.add(new Appointment("Jane", "0987654321", "10:00", gp));
            appointments.add(new Appointment("Alice", "1122334455", "14:30", ohp));
            appointments.add(new Appointment("Bob", "5566778899", "16:00", ohp));
    
            printExistingAppointments(appointments);
            printExistingAppointments(appointments);
    
            System.out.println("------------------------------");
                    Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAppointment System Menu:");
            System.out.println("1. Delete an appointment by phone number");
            System.out.println("2. Print existing appointments");
            System.out.println("3. Exit the system");
            System.out.print("Enter your choice (1/2/3): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the phone number to delete appointment: ");
                    String mobileToDelete = scanner.next();
                    cancelBooking(appointments, mobileToDelete);
                    break;
                case 2:
                    printExistingAppointments(appointments);
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }

    
        public static void printExistingAppointments(ArrayList<Appointment> appointments) {
            if (appointments.isEmpty()) {
                System.out.println("No existing appointments.");
            } else {
                for (Appointment appointment : appointments) {
                    appointment.printAppointmentDetails();
                }
            }
        }
    
        public static void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
            appointments.removeIf(appointment -> appointment.patientMobile.equals(mobile));
    }


}
