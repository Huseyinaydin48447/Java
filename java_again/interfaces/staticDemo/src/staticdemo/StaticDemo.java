/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.id=5;
        product.name="";
        product.price=10;
        manager.add(product);
        
        DatabaseHelper.Crud.Delete();
    }
    
}
