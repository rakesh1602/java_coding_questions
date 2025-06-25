package javabasics.multithreading;

public class Patient extends Thread {
    private final AppointmentSystem appointmentSystem;
    private final String patientName;
    ;

    public Patient(AppointmentSystem appointmentSystem, String patientName) {
        this.appointmentSystem = appointmentSystem;
        this.patientName = patientName;
    }

    @Override
    public void run() {
        appointmentSystem.bookAppointment(patientName);
    }
}
