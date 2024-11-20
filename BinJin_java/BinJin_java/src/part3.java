

//Part 3 – Using classes and objects
public class part3 {

    public static void main(String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Medicine", false);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "Family Practice", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Lee", "Internal Medicine", false);

        Specialist spec1 = new Specialist(4, "Dr. Williams", "Cardiology", "Heart Specialist");
        Specialist spec2 = new Specialist(5, "Dr. Brown", "Neurology", "Brain Specialist");


        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        spec1.printDetails();
        spec2.printDetails();

        System.out.println("------------------------------");
    }
}