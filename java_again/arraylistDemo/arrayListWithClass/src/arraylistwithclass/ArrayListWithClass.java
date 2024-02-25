/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistwithclass;

import java.util.ArrayList;

public class ArrayListWithClass {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "meryem", "aydın"));
        customers.add(new Customer(2, "ahmet", "aydın"));
        customers.add(new Customer(3, "tunc", "aydın"));
        
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
            
        }

    }

}
