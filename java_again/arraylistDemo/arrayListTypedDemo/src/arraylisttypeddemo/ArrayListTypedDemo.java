/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylisttypeddemo;

import java.util.ArrayList;

public class ArrayListTypedDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        
        sehirler.remove("İstanbul");
        
        for (String string : sehirler) {
            System.out.println(string);
            
        }
    }
    
}
