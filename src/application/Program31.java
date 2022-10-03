package application;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in); 
		
		double nota1, nota2; 
		
		double media; 
		
		System.out.println("Informe a primeira nota: "); 
		nota1 = sc.nextDouble(); 
		
		System.out.println("Informe a segunda nota: "); 
		nota2 = sc.nextDouble(); 
		
		if(nota1 < 0 || nota1 > 10 && nota2 < 0 || nota2 > 10) {
			
			System.out.println("Nota inválida"); 
			
		} else { 
			
			media = (nota1 + nota2) / 2; 
			
			System.out.printf("A Média vai ser: %.2f", media);
			
			if(media < -3.5) {
				
				System.out.println("Média inválida");
			}
			
		}
		sc.close();

	}

}
