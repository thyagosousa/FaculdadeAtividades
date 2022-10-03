package application;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
	
Scanner n = new Scanner(System.in); 
		
		double[] notas = {100, 50, 20, 10, 5, 2, 1}; 
		
		int cont = 0; 
		
		double N = 0;
		
		System.out.println("Informe um número"); 
		N = n.nextInt(); 
		
		for(int i = 0; i < notas.length; i++) {
			
			cont = (int) (N / notas[i]);
			N %= notas[i]; 
			
			System.out.println(cont + " notas(s) de R$: " + notas[i]);
		}
		
     n.close(); 
     
	}

}
