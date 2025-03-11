/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED050325;

/**
 *
 * @author User
 */
public class Car {
    private String merek;
    private String model;
    private int tahun;
    private String warna;  
    private Mesin mesin; 


    public Car(String merek, String model, int tahun, String warna) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
        this.mesin = new Mesin(); 
    }

   
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // memanggil Mesin untuk menyalakan dan mematikan mesin
    public void nyalakanMobil() {
        mesin.nyalakan();
    }

    public void matikanMobil() {
        mesin.matikan();
    }

    // memanggil Mesin untuk menjalankan mobil
    public void jalankan() {
        mesin.jalankan(merek, model, warna);
    }

    // menjalankan program
    public static void main(String[] args) {
        Car mobilSaya = new Car("Mercedes", "Audi RS5", 2018, "Hitam");

        // informasi mobil
        System.out.println("Mobil: " + mobilSaya.getMerek() + " " + mobilSaya.getModel());
        System.out.println("Tahun: " + mobilSaya.getTahun());
        System.out.println("Warna: " + mobilSaya.getWarna());

       
        mobilSaya.nyalakanMobil();
        mobilSaya.jalankan();
        mobilSaya.matikanMobil();
    }
}
