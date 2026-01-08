public class RegularAppointment extends  Appointment{
    private boolean followUp;
    private String visitType;    // Check-up or//  Consultatio

    public   RegularAppointment(int Appointment_id,
                                String Date,
                                String time,
                                boolean followUp,
                                String visitType,
                                String status){
        super(Appointment_id,Date,time,status);
        this.followUp = followUp;
        this.visitType = visitType;
    }
    @Override
    public String getAppointmentType() {
        return "Regular Appointment";
    }
    

    @Override
    public int getPriority() {
        return followUp ? 2 : 1;
    }


}
