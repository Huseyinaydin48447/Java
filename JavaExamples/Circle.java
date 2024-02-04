package javaTemelleri;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int r;
		double Hacim,Alan, pi=3.14;
		
		System.out.print("Yarı Çapını Giriniz:");
		r=input.nextInt();
		
		Alan=2*pi*r;
		Hacim=pi*(r*r);
		System.out.println("ALAN: "+Alan);
		System.out.print("HACİM: "+Hacim);

		

	}

}
