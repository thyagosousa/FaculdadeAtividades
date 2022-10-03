package application;

import java.util.Scanner;

public class Program38 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); 
		
		int tot = 0; 
		int n; 
		
		int i; 
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		for(i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				
				tot++; 
			}
		}
		
		if(tot == 2) {
			
			System.out.printf("O Número [%d] é primo ", n);
			
		} else {
			
			System.out.printf("O Número [%d] não é primo", n);
		}
		sc.close();
	}

}
