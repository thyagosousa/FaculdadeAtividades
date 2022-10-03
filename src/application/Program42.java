package application;

import java.util.Scanner;

public class Program42 {

	public static void main(String[] args) {
		
double A, B, p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: "); 
		A = sc.nextDouble(); 
		
		System.out.println("Informe o segundo valor: "); 
		B = sc.nextDouble(); 
		
		p = ((B * 100 / A) - 100.00);
		
		System.out.println(p + "%");
		
		sc.close();

	}

}
