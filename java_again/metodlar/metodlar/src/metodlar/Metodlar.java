/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodlar;

public class Metodlar {

    public static void main(String[] args) {
        // TODO code application logic here
        int sayi=topla(1,5,36,5);
        System.out.println(sayi);
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    
}
