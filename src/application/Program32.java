package application;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in); 
		
		int opcao = 0; 
		int alcool = 0; 
		int diesel = 0; 
		int gasolina = 0; 
		
		double liquido_alcool = 0;
		double liquido_diesel = 0;
		double liquido_gasolina = 0;
		
		while(opcao != 4) {
			
			System.out.println("Informe um número diferente de 4: "); 
			opcao = sc.nextInt(); 
			
			while(opcao < 1 || opcao > 4) {
				
				System.out.println("Informe: 1 - Alcool, 2 - diesel, 3 - Gasolina: "); 
				opcao = sc.nextInt(); 
			
			}
			
			switch (opcao) {
			
			case 1: 
				
				alcool++;
				
				System.out.println("Informe o liquido do alcool: "); 
				liquido_alcool = sc.nextDouble();
				
				break; 
				
			case 2: 
				
				diesel++;
				
				System.out.println("Informe o liquido do diesel: "); 
				liquido_diesel = sc.nextDouble();
				
				break; 
				
			case 3: 
				
				gasolina++; 
				
				System.out.println("Informe o Liquido da Gasolina: "); 
				liquido_gasolina = sc.nextDouble();
				
				break; 
			}
			
		}
	
		System.out.println("Alcool: " + alcool + " Liquido do Alcool: " + liquido_alcool); 
		
		System.out.println("Diesel: " + diesel + " Liquido do Diesel: " + liquido_diesel); 
		
		System.out.println("Gasolina: " + gasolina + " Liquido da Gasolina: " + liquido_gasolina);

		sc.close();
	}

}
