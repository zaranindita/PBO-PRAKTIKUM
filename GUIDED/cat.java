/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED;

/**
 *
 * @author User
 */
public class cat extends animal{
    @Override
    public void bark(){
        System.out.println("bark bark cihuyy");
    }
    public static void main(String[] args){
        cat gureme = new cat();
        gureme.bark();
    }
    
}
