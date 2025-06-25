package javabasics.multithreading;

public class HospitalMain {
    public static void main(String[] args) {
        AppointmentSystem appointmentSystem = new AppointmentSystem();

        Patient p1 = new Patient(appointmentSystem, "rakesh");
        Patient p2 = new Patient(appointmentSystem, "virat");
        Patient p3 = new Patient(appointmentSystem, "rohit");

        p1.start();
        p2.start();
        p3.start();
    }
}
