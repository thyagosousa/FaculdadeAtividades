package application;

import java.util.Scanner;

public class Program45 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double idade; 
		double maior_idade = 0;
		double menor_idade = 0;
		double soma = 1;
				
		
		String nome;
		String nome_mais_novo = "";
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Informe o %d nome da pessoa: ", i); 
			nome = sc.next(); 
			
			System.out.printf("Informe a %d idade da pessoa: ", i); 
			idade = sc.nextDouble();	
			
			if(i == 1 || idade > maior_idade) {
				
				maior_idade = idade; 
			}
			
			if(i == 1 || idade < menor_idade) {
				
				menor_idade = idade;
				nome_mais_novo = nome;
			}
			
			soma = soma + idade;
		}
		
		System.out.println("Maior idade: " + maior_idade); 
		System.out.println("Nome da pessoa mais nova: " + nome_mais_novo); 
		System.out.println("Média das idades: " + (soma / 5)); 
		sc.close();

	}

}
