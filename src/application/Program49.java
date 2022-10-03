package application;

import java.util.Scanner;

public class Program49 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in); 
		
		double peso; 
		double altura; 
		double imc;
		
		System.out.println("informe o peso da pessoa: ");
		peso = sc.nextDouble(); 
		
		System.out.println("Informe a altura da pessoa: "); 
		altura = sc.nextDouble(); 
		
		imc = (peso / (altura * altura)); 
		
		System.out.println("Seu Imc é: " + imc);
		
		if(imc <= 20) {
			
			System.out.println("Abaixo do Peso");
			
		} else if(imc > 20 && imc <= 24.9) {
			
			System.out.println("Peso Normal"); 
			
		} else if(imc > 25 && imc <= 29.9) { 
			
			System.out.println("Sobrepeso");
			
		} else if(imc > 30 && imc <= 39.9) {
			
			System.out.println("Obeso");
			
		} else if(imc >= 40) {
			
			System.out.println("Obeso Mórbido");
		}
		sc.close();

	}

}
