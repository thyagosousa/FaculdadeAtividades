package application;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int x, cont = 0;
		
		System.out.println("Informe um número para x: ");
		x = sc.nextInt();
		
		while(cont < 6) {
			
			if(x % 2 == 1) {
				
				System.out.println(x);
				cont++;
			}
			
			x++;
		}

		sc.close();
	}

}
