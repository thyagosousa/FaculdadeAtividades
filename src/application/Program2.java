package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int funcionario; 
		int horas_trabalhadas; 
		double valor_hora;
			
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe o n�mero do func�onario: ");
		funcionario = numero.nextInt();  
		
		System.out.println("Informe o n�mero de horas trabalhadas: "); 
		horas_trabalhadas = numero.nextInt(); 
		
		System.out.println("Informe o valor que recebe por hora"); 
		valor_hora = numero.nextDouble(); 
		
		double salario_funcionario = horas_trabalhadas * valor_hora;
		
		System.out.println("O n�mero do funcionario �: " + funcionario);
		System.out.printf("O valor do Sal�rio � de: R$ %.2f", salario_funcionario); 
		
		numero.close();
	}

}
