package application;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		String nome; 
		double salario_fixo; 
		double vendas_mes; 
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe o nome do Funci�nario: "); 
		nome = numero.nextLine(); 
		
		System.out.println("Informe o sal�rio fixo: "); 
		salario_fixo = numero.nextDouble(); 
		
		System.out.println("Informe as vendas no m�s: "); 
		vendas_mes = numero.nextDouble(); 
		
		double total_vendas_mes = salario_fixo + vendas_mes * 0.15 ; 
		
		System.out.println("O Funcionario: " + nome);
		System.out.printf("Vai receber no de Total que o funcion�rio vai receber: R$ %.2f", total_vendas_mes);

		numero.close();
		
	}

}
