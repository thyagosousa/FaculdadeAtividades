package application;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		
		double popA; 
		double popB;
		
		double contador = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a Taxa de Popula��o do pa�s A: "); 
		popA = sc.nextDouble(); 
		
		System.out.println("Informe a Taxa de Popula��o do pa�s B: "); 
		popB = sc.nextDouble(); 
		
		while(popB > popA) {
			
			popA += (popA * 3) / 100; 
			popB += (popB * 1.5) / 100; 
			
			contador++; 
		}
		
		System.out.println("Taxa de Anos da Popula��o: " + contador + " anos."); 
		
		sc.close();

	}
	
	
}
