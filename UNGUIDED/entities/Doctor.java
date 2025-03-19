/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED.entities;

/**
 *
 * @author User
 */
public class Doctor {
    private String nama;
    private String spesialisasi;

    public Doctor(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void displayInfo() {
        System.out.println("Dokter: " + nama + " | Spesialisasi: " + spesialisasi);
    }

    
    public String diagnosapasien(Patient patient) {
        return "Diagnosa untuk " + patient.getNama() + ": " + generateDiagnosis();
    }

    
    private String generateDiagnosis() {
        switch (spesialisasi.toLowerCase()) {
            case "Jantung":
                return "hypertension";
            case "Saraf":
                return "epilepsy";
            case "Kulit":
                return "eczema";
            case "Anak":
                return "chickenpox";
            default:
                return "perlu periksa secara menyeluruh";
        }
    }
}



