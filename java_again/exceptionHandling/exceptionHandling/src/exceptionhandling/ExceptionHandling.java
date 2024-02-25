/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int[] sayilar =new int[]{1,2,3};
            System.out.println(sayilar[3]);
        
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        
        
    }
    
}
