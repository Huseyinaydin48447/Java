/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classs;

public class Classs {

    public static void main(String[] args) {
       
//        Product product =new Product();
//        product.setName("bilgisayar");
//        product.setId(5);
//        product.setDescription("asus laptop");
//        

        Product product =new Product(1,"mehmet","nasılsın",200);
        
        ProductManager product1=new ProductManager();
        product1.Add(product);
    }
    
}
 