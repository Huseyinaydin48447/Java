package javaTemelleri;

public class logicalOperators {

	public static void main(String[] args) {
		
           boolean a =true;
           boolean b=false;
           
           System.out.println("a&&b = "+(a&&b));// her iki değişkenin aynı olması demektir ve sağlaması demektir.

           System.out.println("a||b = "+(a||b));//a'in veya b'in bir tanesi sağlanırsa true olması
           System.out.println("!(a&&b) = "+!(a&&b));//sonucun değilini alır false true , true ise false alır.
           System.out.println("a&b = "+(a&b));//hem a hemde b aynı olması demektir
           System.out.println("a|b = "+(a|b));//a'in veya b'in true olması
           System.out.println("a^b = "+(a^b));// a ve b birbirinden farklı demektir

           
	}

}
