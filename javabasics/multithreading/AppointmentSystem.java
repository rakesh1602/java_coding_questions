package javabasics.multithreading;

public class AppointmentSystem {

    private volatile boolean isSlotAvailable = true;

    public synchronized void bookAppointment(String patientName) {
        System.out.println(patientName + " is trying to book appointment");

        while (!isSlotAvailable) {
            try {
                System.out.println("Slot not available for " + patientName + "waiting..");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(patientName + "was interrupted");
            }
        }

        System.out.println("appointment book for "+ patientName);
        isSlotAvailable = false;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println(patientName + " 's appointment is done, slot is now free");
        isSlotAvailable = true;
        notify(); // notify one waiting thread
    }
}
