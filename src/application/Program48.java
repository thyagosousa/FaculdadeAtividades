package application;

import java.util.Scanner;

public class Program48 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int idade;
		double peso; 
		
		double dosagem;
		double gotas = 0;
		
		System.out.println("Informe a idade do paciente: "); 
		idade = sc.nextInt(); 
		
		System.out.println("Informe o peso do paciente: ");
		peso = sc.nextDouble(); 
		
		if(idade >= 12 && peso >= 60) {
			
			dosagem = 1000;
			
			gotas = dosagem / 25;
			
		} else if(idade >= 12 && peso <= 60) {
			
			dosagem = 875; 
			
			gotas = dosagem / 25;
		}
		
		if(idade < 12 && peso > 5 && peso < 9) {
			
			dosagem = 125; 
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 9.1 && peso < 16) {
			
			dosagem = 250; 
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 16.1 && peso < 24) {
			
			dosagem = 375; 
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 24.1 && peso < 29.9) {
			
			dosagem = 500;
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 30) {
			
			dosagem = 750;
			
			gotas = dosagem / 25;
		}
		
		System.out.println("Quantidade de gotas: " + gotas + " gotas ");
		sc.close();

	}

}
