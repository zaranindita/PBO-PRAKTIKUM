/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED.entities;

/**
 *
 * @author User
 */
import UNGUIDED.entities.Doctor;
import UNGUIDED.entities.Patient;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public void displayInfo() {
        System.out.println("Janji temu: " + date);
        doctor.displayInfo();
        patient.displayInfo();
        System.out.println("Diagnosa: " + doctor.diagnosapasien(patient));
    }

    // main method
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Mark", "Saraf");
        Patient patient = new Patient("Rachel", 39, doctor);
        Appointment appointment = new Appointment(doctor, patient, "2029-12-02");

        appointment.displayInfo();
    }
}


