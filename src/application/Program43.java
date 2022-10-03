package application;

import java.util.Scanner;

public class Program43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		int M, N;
		
		while(true) {
			
			System.out.println("Informe o número de M: ");
			M = sc.nextInt(); 
			
			System.out.println("Informe o número de N: "); 
			N = sc.nextInt(); 
			
			int troco = M - N;
			
			int [] notas = {2, 5, 10, 20, 50, 100};
			boolean possivel = false;
			
			boolean impossivel = true;
			
			if(N == 0 && M == 0) {
				
				break;
			}
			
			for(int i = 0; i < 0; i++) {
				
				for(int j = 0; j < 6; j++) {
					
					if(troco - notas[j] == notas[i]) {
						
						possivel = true; 
						
					} else if(troco - notas[j] != notas[j]) {
						
						impossivel = true;
					}
				}
				
			}
			
			if(possivel) {
				
				System.out.println("Impossivel");
				
			} else {
				
				System.out.println("possivel");
			}

  		}
		sc.close();

	}

}
