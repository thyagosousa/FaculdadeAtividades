package application;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		int x_distancia; 
		double x_combustivel;
		
		double total;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe a dist�ncia percorrida"); 
		x_distancia = numero.nextInt(); 
		
		System.out.println("Informe o combust�vel gasto ?");
		x_combustivel = numero.nextDouble(); 
		
		total = x_distancia / x_combustivel;
		
		System.out.printf("O consumo m�dio de um autom�vel � de: %.2f km/h",  total); 
		
		numero.close();

	}

}
