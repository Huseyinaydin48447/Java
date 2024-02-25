/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınheritance;

public class Inheritance {

    public static void main(String[] args) {
        // TODO code application logic here
       KrediUI krediUI=new KrediUI();
       krediUI.KrediHesapla(new OgretmenKrediManager());//bellekte bunu:OgretmenKrediManager oluştur
       krediUI.KrediHesapla(new TarimKrediManager());//bellekte bunu:OgretmenKrediManager oluştur

    }
    
}
