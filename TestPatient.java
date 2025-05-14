public class TestPatient extends Patient {

    public static void setPatient(Patient patient){
        patient.setAge(patient.getAge());
        patient.setName(patient.getName());
        System.out.println(patient.getAge() + " " + patient.getName());
    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setName("dsnjkdgndsj");
        patient.setAge(33L);
        setPatient(patient);
    }
}
