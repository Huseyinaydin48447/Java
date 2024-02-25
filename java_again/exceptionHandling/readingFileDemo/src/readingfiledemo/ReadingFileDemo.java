/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readingfiledemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadingFileDemo {

    public static void main(String[] args) throws IOException  {
        BufferedReader reader=null;// dişarda yazdık ki her herde erişim sağlansın...
        int total=0;
        try {
            //dosyayı okumak için BufferedReader kullanılır
             reader=new BufferedReader(new FileReader("C:\\javademos\\exceptionHandling\\readingFileDemo\\src\\readingfiledemo\\sayilar\\sayilar.txt"));
             String line=null;// boş olup olmadığına bakılır
             
             while((line=reader.readLine())!=null){//readLine  her bir satırı 
                 total +=Integer.valueOf(line);  
             }
             System.out.println("Toplam = "+total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            reader.close();
        }
    }
    
}
