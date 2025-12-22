public class Doctor {
    private String doctorId;
    private String doctorName;
    private int experienceYears;
    private String specialization;

    public Doctor(String doctorId,
                  String doctorName,
                  int experienceYears,
                  String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
        if (experienceYears > 0) {
            this.experienceYears = experienceYears;
        } else {
            this.experienceYears = 0;
        }

    }

    public String getExperienceYears() {
        if (experienceYears == 0) {
            return "don't have experience";
        } else {
            return experienceYears + " years";
        }
    }

    @Override
    public String toString() {
        return
                "ID: " + doctorId +
                "\nNAME: " + doctorName +
                "\nexperience: " + getExperienceYears() +
                "\nspecialization: " + specialization;
    }
}