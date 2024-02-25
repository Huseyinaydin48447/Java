/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractdemo;

public class AbstractDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new sqlDatabaseManager();
        customerManager.getCustomers();
    }
    
}
