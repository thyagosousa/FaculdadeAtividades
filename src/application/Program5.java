package application;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
	int a, b, c; 
		
		Scanner letra = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: "); 
		a = letra.nextInt(); 
		
		System.out.println("Informe o segundo n�mero: ");
		b = letra.nextInt(); 
		
		System.out.println("Informe o terceiro n�mero: "); 
		c = letra.nextInt(); 
		
		if(a < b) {
			
			if(b < c) {
				
				System.out.println("A ordem �: " + a + "," + b + "," + c);
				
			} else if (a < c) {
				
				System.out.println("A ordem �: " + a + "," + c + "," + b);
				
			} else { 
				
				System.out.println("A ordem �: " + c + "," + a + "," + b);
			}
		} else if(b < c) {
			
			if(a < c) {
				
				System.out.println("A ordem �: " + b + "," + a + "," + c); 
				
			} else {
				
				System.out.println("A ordem �: " + b + "," + c + "," + a); 
			}
			
		} else {
			
			System.out.println("A ordem �: " + c + "," + b + "," + a);
		} 
		
		letra.close();

	}

}
