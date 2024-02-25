/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

public class Overriding {

    public static void main(String[] args) {
        // TODO code application logic here
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new BaseKrediManager(),
        new TarimKrediManager(),new OgrenciKrediManager()};
        
        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
            
        }
    }
    
}
