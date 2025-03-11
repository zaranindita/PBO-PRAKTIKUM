/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED050325;

/**
 *
 * @author User
 */
public class MobilAction {
    public static void main(String[] args) {
        Mobil mobill = new Mobil("Honda", "Merah", 2020);

        // Menampilkan informasi mobil
        System.out.println("Merek  : " + mobill.getMerek());
        System.out.println("Warna : " + mobill.getWarna());
        System.out.println("Tahun : " + mobill.getTahun());
    }
}
