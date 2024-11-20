public class Specialist extends HealthProfessional {
 
    private String fieldOfExpertise;

    public Specialist() {
        super();
    }

  
    public Specialist(int ID, String name, String specialty, String fieldOfExpertise) {
        super(ID, name, specialty);
        this.fieldOfExpertise = fieldOfExpertise;
    }

    // 打印健康专业人员详细信息的方法，包括健康专业人员类型
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Type: Specialist");
        System.out.println("Field of Expertise: " + fieldOfExpertise);
    }

    // Getter 和 Setter 方法
    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }
}