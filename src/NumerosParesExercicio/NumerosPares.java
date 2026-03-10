package NumerosParesExercicio;

import java.util.Scanner;
import java.util.Locale;

public class NumerosPares {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números voce irá digitar: ");
		int x = sc.nextInt();
		int[] vetor = new int[x];
		int pares = 0;
		for(int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		System.out.print("\nNUMEROS PARES: \n");
		for(int i = 0; i < x; i++) {
			if(vetor[i] % 2 == 0) {
				pares += 1;
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.print("\n\nQUANTIDADE DE PARES: " + pares);
		sc.close();
	}
}	
