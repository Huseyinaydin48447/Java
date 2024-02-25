package javaTemelleri;

public class doubleUs {

	

	    public static double power(double sayi1, double sayi2) {
	        return Math.exp(sayi2 * Math.log(sayi1));
	    }

	
	public static void main(String[] args) {
		 System.out.println(power(3.5, 5.6)); 

	}

}
