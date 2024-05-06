package titio;

import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicao[] = new int[9];
        int j = 0;
        int cont = 0;
        int i = 0;
        boolean primo = false;

        for (i = 0; i < 8; i++) {
            System.out.println("Na posição " + (i + 1) + ", digite um número: ");
            posicao[i] = sc.nextInt();
        }

        for (i = 0; i < 9; i++) {
            cont = 0;
            for (j = 1; j <= posicao[i]; j++) {
                if (posicao[i] % j == 0) {
                    cont++;
                }
            }
            
            if (cont == 2) {
                System.out.println("Na posição " + (i + 1) + ", temos um número primo: " + posicao[i]);
                primo = true;
            } 
        } 
        if (primo == false) {
        	 System.out.println("O vetor não possui números primos.");
        }
        sc.close();
    }
}