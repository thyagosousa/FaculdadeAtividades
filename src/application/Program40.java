package application;

import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); 
		
		int a, b, c; 
		
		System.out.println("informe um n�mero para a letra A: "); 
		a = sc.nextInt(); 
		
		System.out.println("Informe um n�mero para a letra B: "); 
		b = sc.nextInt(); 
		
		System.out.println("Informe um n�mero para a letra C: "); 
		c = sc.nextInt(); 
		
		if(a + b > c && b + c > a && c + a > b) {
			
			if(a == b && b == c) {
				
				System.out.println("Equil�tero"); 
				
			} else if(a == b || b == c || c == a) {
				
				System.out.println("Is�sceles"); 
				
			} else {
				
				System.out.println("Escaleno");
			}
			
		} else {
			
			System.out.println("Valores n�o formam um tri�ngulo");
		}
		sc.close();

	}

}
