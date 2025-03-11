/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED050325;

/**
 *
 * @author User
 */
public class Phone {
    private String brand;
    private int yearRelease;

    // Constructor
    public Phone(String brand, int yearRelease) {
        this.brand = brand;
        this.yearRelease = yearRelease;
    }

    // Getter dan Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    // Method untuk aksi di HP
    public void Call() {
        System.out.println("Calling...");
    }

    public void SMS() {
        System.out.println("Sending SMS...");
    }

    public void TurnOn() {
        System.out.println("Turning On " + brand);
    }

    public void TurnOff() {
        System.out.println("Turning Off " + brand);
    }
}



    
