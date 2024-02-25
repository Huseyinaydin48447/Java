/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadingdemo1;

public class ThreadingDemo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        KronometreThread thread1 = new KronometreThread("thread1");
        KronometreThread thread2 = new KronometreThread("thread2");
        KronometreThread thread3 = new KronometreThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
