package lesson8.Task1;

public class Therapist extends Treat{
    @Override
    public void treatment() {
        System.out.println("лечит терапевт");
    }

    public void checkTreatmentCode(Patient patient){
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        if(patient.getThreatmentCode() == 1){
            System.out.println("Пациенту назначен хирург");
            patient.setDoctor("Surgeon");
            surgeon.treatment();
        } else if (patient.getThreatmentCode() == 2) {
            System.out.println("Пациенту назначен дантист");
            patient.setDoctor("Dentist");
            dentist.treatment();
        } else {
            System.out.println("Пациенту назначен терапевт");
            patient.setDoctor("Therapist");
            therapist.treatment();
        }
    }

}
