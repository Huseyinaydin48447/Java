/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
//        EmailLogger logger=new EmailLogger();
//        logger.Log("log mesaj");

//toplu atmak için yani annesi olarak tabir ettiğimiz Baseden yola çıkarak istediğimize toplu log yapabiliriz
//        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.Log(("log mesajı"));
//            
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }

}
