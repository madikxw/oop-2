public class EmergencyAppointment extends  Appointment {
    private int severityLevel;
    private boolean ambulanceRequired;
    public EmergencyAppointment(int Appointment_id,
                                String Date,
                                String time,
                                int severityLevel,
                                boolean ambulanceRequired,
                                String status){
        super(Appointment_id,Date,time,status);
        this.severityLevel = severityLevel;
        this.ambulanceRequired  =ambulanceRequired;
    }
    @Override
    public String getAppointmentType() {
        return "Emergency Appointment";
    }
    @Override
    public int getPriority() {
        return 5; // highest priority
    }


}
