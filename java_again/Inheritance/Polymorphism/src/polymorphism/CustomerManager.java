/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

public class CustomerManager {
    
    private BaseLogger logger;
    public CustomerManager (BaseLogger logger){
        this.logger=logger;
    }
    
    public void add(){
        System.out.println("Müşteri eklendi.");
        this.logger.log("log mesajidır");
    }
}
  