/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadingdemo1;

public class KronometreThread implements Runnable{

    private Thread thread;
    private String threadName;
    
    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("Oluşturuluyor : "+threadName);
    }
    
    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : "+threadName);
        
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName +" : "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Kesildi : "+threadName);
        }
        System.out.println("Thread bitti : "+threadName);
    }
    
    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
    
    
}
