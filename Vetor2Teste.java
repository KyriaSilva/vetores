package titio;

import java.util.Scanner;

public class Vetor2Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] vet1 = new int[10];
		        int[] vet2 = new int[10];
		        int[] vet3 = new int[20];

		        Scanner scanner = new Scanner(System.in);

			        int i, j;
			        j = 0;
			        
		     
		        for (i = 0; i < 10; i++) {
		            System.out.printf("Digite um valor para vetor 1: ", i);
		            vet1[i] = scanner.nextInt();
		            vet3[j] = vet1[i];
		            j += 1;
		            System.out.printf("DIgite um valor para vetor 2:  ", i);
		            vet2[i] = scanner.nextInt();
		            vet3[j] = vet2[i];
		            j += 1; 
		        }
		        
		        for  (i = 0; i < 20; i++) {
		        	System.out.printf("%d " , vet3[i]);
		        }
	}     
		        
		}
