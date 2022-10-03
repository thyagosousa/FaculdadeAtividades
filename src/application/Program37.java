package application;

import java.util.Scanner;

public class Program37 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[2]; 
		int[] numero = new int[2]; 
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("[%d] nome: ", i);
			nome[i] = sc.next(); 
			
			System.out.printf("[%d] número: ", i); 
			numero[i] = sc.nextInt();
		}
		
		if(numero[0] % 2 == 0 || numero[1] % 2 == 0) {
			
			int soma = numero[0] + numero[1]; 
			
			System.out.println("Par");
			System.out.println("Somátorio vai ser: " + soma); 
			System.out.println("Ganhador: " + nome[1]);
			
		} else {
			
			int soma = numero[0] + numero[1]; 
			
			System.out.println("Impar");
			System.out.println("Somátorio vai ser: " + soma); 
			System.out.println("Ganhador: " + nome[0]);
		}
		sc.close();

	}

}
