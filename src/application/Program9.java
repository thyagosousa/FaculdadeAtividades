package application;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
	
int segundos, h, m, s, resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os segundos: "); 
		segundos = sc.nextInt(); 
		
		h = segundos / 3600; 
		resto = segundos % 3600;
		m = resto / 60;
		s = resto % 60;
		
		System.out.printf("%d:%d:%d", h, m, s); 
		
		sc.close();

	}

}
