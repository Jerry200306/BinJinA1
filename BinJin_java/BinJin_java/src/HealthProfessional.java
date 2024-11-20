

public class HealthProfessional {
    private int ID;
    private String name;
    private String specialty;

    public HealthProfessional() {
    }

    public HealthProfessional(int ID, String name, String specialty) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
    }

    public void printinfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

