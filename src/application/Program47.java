package application;

import java.util.Scanner;

public class Program47 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] numero = new int[4]; 
		int termos = 0;
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			numero[i] = sc.nextInt(); 
			
		}
		
		for(int i = 0; i < 20; i++) {
			
			termos = i * i;
			System.out.print(" " + termos);
		}
		sc.close();

	}

}
