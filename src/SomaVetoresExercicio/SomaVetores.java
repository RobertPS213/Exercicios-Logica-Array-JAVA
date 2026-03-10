package SomaVetoresExercicio;

import java.util.Scanner;
import java.util.Locale;

public class SomaVetores {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter em cada vetor: ");
		int x = sc.nextInt();
		int[] vetor = new int[x];
		int[] vetor2 = new int[x];
		SomaAuxiliar[] vetor3 = new SomaAuxiliar[x];
		System.out.print("Digite os valores do vetor A: \n");
		for(int i = 0; i < x; i++) {
			vetor[i] = sc.nextInt();
		}
		System.out.print("Digite os valores do vetor B: \n");
		for(int i = 0; i < x; i++) {
			vetor2[i] = sc.nextInt();
		}
		for(int i = 0; i < x; i++) {
			vetor3[i] = new SomaAuxiliar(vetor[i], vetor2[i]);
		}
		System.out.print("\n\nVETOR RESULTANTE: \n");
		for(int i = 0; i < x; i++) {
			System.out.print(vetor3[i].soma() + "\n");
		}
	}
}
