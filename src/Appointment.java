
public class Appointment {
    protected int Appointment_id;
    protected String Date;
    protected String Time;
    protected String Status;
    public Appointment(int Appointment_id,
                       String Date,
                       String Time,
                       String Status){
        this.Appointment_id = Appointment_id;
        this.Date = Date;
        this.Time = Time;
        this.Status = Status;
    }
    public String getAppointmentType() {
        return "General Appointment";
    }
    public int getPriority() {
        return 1;  //lowest
    }

    public void performAppointment() {
        System.out.println("Performing a general appointment.");
    }





    public void setAppointment_id(int appointment_id) {
        this.Appointment_id = appointment_id;
    }

    public int getAppointment_id() {
        return Appointment_id;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setTime(String time) {
        this.Time = time;
    }
    public String getTime(){
        return Time;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getStatus() {
        return Status;
    }

}
