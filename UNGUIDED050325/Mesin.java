/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED050325;

/**
 *
 * @author User
 */
public class Mesin {
    private boolean menyala;
    public Mesin() {
        this.menyala = false; // mesin mati saat pertama kali 
    }

    // untuk menyalakan mesin
    public void nyalakan() {
        if (!menyala) {
            menyala = true;
            System.out.println("Mesin dinyalakan.");
        } else {
            System.out.println("Mesin sudah menyala.");
        }
    }

    // untuk mematikan mesin
    public void matikan() {
        if (menyala) {
            menyala = false;
            System.out.println("Mesin dimatikan.");
        } else {
            System.out.println("Mesin sudah mati.");
        }
    }

    // Method untuk mengecek status mesin
    public boolean isMenyala() {
        return menyala;
    }
    
    // memanggil Car untuk menjalankan mesin
    public void jalankan(String merek, String model, String warna) {
        if (menyala) {
            System.out.println(merek + " " + model + " warna " + warna + " sedang berjalan.");
        } else {
            System.out.println("Nyalakan mesin dulu sebelum berkendara.");
        }
    }
}

