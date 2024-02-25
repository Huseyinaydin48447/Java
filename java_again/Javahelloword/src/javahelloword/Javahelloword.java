/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javahelloword;

public class Javahelloword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
        //System.out.println("hello");
        int sayi1 = 100;
        int sayi2 = 15;
        int sayi3 = 5;

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("sayi1>sayi2>sayi3");
            } else {
                System.out.println("sayi1>sayi3>sayi2");
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {

            if (sayi1 > sayi3) {
                System.out.println("sayi2>sayi1>sayi3");
            } else {
                System.out.println("sayi2>sayi3>sayi1");
            }
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {

            if (sayi1 > sayi2) {
                System.out.println("sayi3>sayi1>sayi2");
            } else {
                System.out.println("sayi3>sayi2>sayi1");
            }
        }
         */

//diziler
/*
        String[] ogrenciler = new String[3];//diziyi tanımlama
        ogrenciler[0] = "mehmet";
        ogrenciler[1] = "salih";
        ogrenciler[2] = "merve";
//        for (int i = 0; i < ogrenciler.length; i++) {
//            System.out.println("ogrenciler:  " + ogrenciler[i]);
//        }   

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
 */

/*
        double[] mylist = {1.2, 1.3, 4.3, 5.6};
        double toplam = 0;
        double max = mylist[0];
        for (double d : mylist) {
            if (max < d) {
                max = d;
            }
            toplam += d;
            System.out.println(d);
        }
        System.out.println(toplam);
        System.out.println(max);
*/

//string
/*
        String mesaj="Bugün hava çok güzel.";
        System.out.println("5.elaman: "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın."));
        System.out.println(mesaj.startsWith("B"));
        
        char[] karakterler=new char[5];
        mesaj.getChars(0,4 , karakterler, 0);
        System.out.println(karakterler);
        
*/
/*
        String mesaj="Bugün hava çok güzel.";
        for (String kelime:mesaj.split(" ")) {
            System.out.println(kelime);
        }
*/

  //asal sayı olup olmadığına bakma
 /* 
        int number = -1;
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı ");
            return;
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
*/
 
    //Mükemmel sayi bulma
/*    
        int sayi = 28;
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println("Mükemmel sayidir");
        } else {
            System.out.println("Mükemmel sayi değildir.");

        }
*/

        
    }

}
