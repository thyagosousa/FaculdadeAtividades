package application;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		

		double salario_atual; 
		double novo_salario; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio do funcion�rio: "); 
		salario_atual = sc.nextDouble();  
		
		if(salario_atual >= 500.00) {
			
			novo_salario = salario_atual + (salario_atual * 10) / 100;
			
		} else if(salario_atual >= 300.00) {
			
			novo_salario = salario_atual +  (salario_atual * 7) / 100; 
			
		} else {
			
			novo_salario = salario_atual +  (salario_atual * 5) / 100; 
		}
		
		System.out.printf("O Sal�rio do funcion�rio � de: %.2f", novo_salario);

		sc.close();
	}

}
