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

public class Patient {
    private String nama;
    private int umur;
    private Doctor Doctorr;

    public Patient(String nama, int umur, Doctor Doctorr) {
        this.nama = nama;
        this.umur = umur;
        this.Doctorr = Doctorr;
    }

    public void displayInfo() {
        System.out.println("Pasien: " + nama + " | Umur: " + umur);
        System.out.print("Dokter yang bertugas: ");
        Doctorr.displayInfo();
    }

    public String getNama() {
        return nama;
    }
}

