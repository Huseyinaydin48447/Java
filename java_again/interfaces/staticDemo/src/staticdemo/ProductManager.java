/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticdemo;

public class ProductManager {

    public  void add(Product product) {

//        ProductValidator validator = new ProductValidator();

        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi.");
        }else{
            System.out.println("Ürün bilgileri geçersizdir");
        }
    }

}
