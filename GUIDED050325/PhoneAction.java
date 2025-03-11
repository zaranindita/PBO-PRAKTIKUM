/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED050325;

/**
 *
 * @author User
 */
public class PhoneAction {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Samsung", 2023);

        System.out.println("Brand: " + myPhone.getBrand());
        System.out.println("Year Released: " + myPhone.getYearRelease());

        myPhone.TurnOn();
        myPhone.Call();
        myPhone.SMS();
        myPhone.TurnOff();
    }
}
