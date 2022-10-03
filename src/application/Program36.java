package application;

import java.util.Scanner;

public class Program36 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in); 
		
		int ho; 
		
		System.out.println("Informe a quantidade de Hos para o papai Noel: "); 
		ho = sc.nextInt();
		
		for(int i = 0; i < ho; i++) {
			
			System.out.print(" HO! "); 
		}
		sc.close();

	}

}
