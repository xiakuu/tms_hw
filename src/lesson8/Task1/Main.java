package lesson8.Task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int threatCode;
        Patient patient1 = new Patient();
        Therapist therapist = new Therapist();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите код лечения пациента");
        threatCode = sc1.nextInt();
        patient1.setThreatmentCode(threatCode);
        therapist.checkTreatmentCode(patient1);
    }
}
