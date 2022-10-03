package application;

import java.util.Scanner;

public class Program39 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("Informe um número para a sua tabuada: ");
		n = sc.nextInt(); 
		
		for(i = 0; i < 10; i++) {
			
			System.out.printf(" %d * %d = %d \n", i, n, (i * n));
		}
		sc.close();

	}

}
