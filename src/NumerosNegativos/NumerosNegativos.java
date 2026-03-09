package NumerosNegativos;

import java.util.Scanner;
import java.util.Locale;

public class NumerosNegativos {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce irá digitar: ");
		int x = sc.nextInt();
		int[] vetor = new int[x];
		for(int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < x; i++) {
			if(vetor[i] <= -1) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}
}	
