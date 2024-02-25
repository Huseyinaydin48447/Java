/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        System.out.println(sozluk);

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman- " + item + "  Değer-" + sozluk.get(item));

        }

    }

}
