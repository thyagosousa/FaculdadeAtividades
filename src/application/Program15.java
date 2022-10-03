package application;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n, a = 0, p = 0, atual = 1;
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		for(int i = 0; i < n; i++) {
			
			if(i == n) {
				
				System.out.println(a); 
				
			} else {
				
				System.out.println(a + " "); 
				
				p = a + atual;
				a = atual;
				atual = p;
			}
		}

		sc.close();
	}

}
