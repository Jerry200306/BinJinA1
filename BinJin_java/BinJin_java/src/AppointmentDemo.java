import java.util.ArrayList;
import java.util.List;




//Part 5 – Collection of Appointments  
public class AppointmentDemo {

    public static void main(String[] args) {
        // Part 5 – Collection of appointments
       
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Medicine", false);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "Family Practice", true);
        Specialist spec1 = new Specialist(4, "Dr. Williams", "Cardiology", "Heart Specialist");
        Specialist spec2 = new Specialist(5, "Dr. Brown", "Neurology", "Brain Specialist");

        Appointment app1 = new Appointment("John Doe", "1234567890", "08:00", gp1);
        Appointment app2 = new Appointment("Jane Doe", "0987654321", "10:00", gp2);
        Appointment app3 = new Appointment("Alice Johnson", "1122334455", "14:30", spec1);
        Appointment app4 = new Appointment("Bob Smith", "5566778899", "16:00", spec2);


        List<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, app1);
        createAppointment(appointments, app2);
        createAppointment(appointments, app3);
        createAppointment(appointments, app4);

        printExistingAppointments(appointments);

        cancelBooking(appointments, "0987654321");

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    public static void createAppointment(List<Appointment> appointments, Appointment appointment) {
        appointments.add(appointment);
    }
    public static void printExistingAppointments(List<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }
    public static void cancelBooking(List<Appointment> appointments, String patientMobile) {
        appointments.removeIf(appointment -> appointment.getPatientMobile().equals(patientMobile));
    }
}