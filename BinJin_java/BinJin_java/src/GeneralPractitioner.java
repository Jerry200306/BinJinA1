public class GeneralPractitioner extends HealthProfessional {
    private boolean hasNursePractitioner;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int ID, String name, String specialty, boolean hasNursePractitioner) {
        super(ID, name, specialty);
        this.hasNursePractitioner = hasNursePractitioner;
    }

    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Type: General Practitioner");
        System.out.println("Has Nurse Practitioner: " + hasNursePractitioner);
    }


    public boolean isHasNursePractitioner() {
        return hasNursePractitioner;
    }

    public void setHasNursePractitioner(boolean hasNursePractitioner) {
        this.hasNursePractitioner = hasNursePractitioner;
    }
}