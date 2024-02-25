/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingwithfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkingWithFiles {

    public static void main(String[] args) {
        // TODO code application logic here
        readFile();
        writeFile();
                readFile();

    }

    public static void createFile() {
        File file = new File("C:\\javademos\\files\\students.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu. ");
            } else {
                System.out.println("Dosya zaten mevcut. ");

            }

        } catch (IOException ex) {
            Logger.getLogger(WorkingWithFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\javademos\\files\\students.txt");

        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu:  " + file.getAbsoluteFile());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya okunabilir mi: " + file.canRead());
            System.out.println("Dosya boyutu: " + file.length());

        }
    }
     public static void readFile(){
       File file = new File("C:\\javademos\\files\\students.txt");
         try {
             Scanner reader=new Scanner(file);
             while( reader.hasNextLine()){
                 String line=reader.nextLine();
                 System.out.println(line);
                 
             }
         } catch (Exception e) {
         }
     }
     
    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosya yazıldı.");
            writer.close();
        } catch (Exception e) {
        }
    }  
    

}
