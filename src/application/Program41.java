package application;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		double altura, peso, pesoideal = 0;
		double total = 0;
		
		System.out.println("Informe a altura da pessoa: ");
		altura = sc.nextDouble();
		
		System.out.println("Informe o peso da pessoa: "); 
		peso = sc.nextDouble(); 
		
		if(altura <= 1.50) {
			
			pesoideal = 50;
			
		} else if(altura > 1.50 && altura <= 1.90) {
			
			pesoideal = 70;
			
		} else {
			
			pesoideal = 100;
		}
		
		calcular_peso(peso, pesoideal, total);
		
	}

	private static void calcular_peso(double peso, double pesoideal, double total) {
		
		
		total = peso - pesoideal;
		
		if(total > 0) {
			
			System.out.println("Emagreça: " + total + " kg "); 
		}
		
		if(total < 0) {
			
			System.out.println("Engorde: " + Math.abs(total) + " kg ");
			
		} else {
			
			System.out.println("Parabens, peso ideal"); 
			
		}
	

	}
	

}
