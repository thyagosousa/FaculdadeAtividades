package application;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in); 
		
		int n; 
		int a, b, d;
		int cont; 
		
		System.out.println("Informe um n�mero: "); 
		n = sc.nextInt(); 
		
		for(a = 0; a < n; a++) {
			
			cont = 1; 
			
			System.out.println("Informe um outro n�mero: "); 
			b = sc.nextInt();  
			
			for(d = 2; d < b; d++) {
				
				if(b % d == 0) {
					
					cont++; 
				}
			}
			
			if(cont == 1 &&  b!= 1) {
				
				System.out.println("O n�mero: " + b + " � primo"); 
				
			} else {
				
				System.out.println("O n�mero: " + b + " n�o � primo");
			}
		}
sc.close();
	}

}
