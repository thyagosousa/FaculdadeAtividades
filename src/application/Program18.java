package application;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
	
		int n; 
		int j = 0; 
		
		System.out.println("Informe um n�mero: "); 
		n = sc.nextInt(); 
		
		while(n > j) {
			
			j *= 10;
			j += (n % 10); 
			n /= 10; 
			
		}
		
		System.out.println("N�mero invertido: " + j);

		sc.close();
	}

}
