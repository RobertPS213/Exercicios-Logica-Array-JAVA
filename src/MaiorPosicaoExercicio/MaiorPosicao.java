package MaiorPosicaoExercicio;

import java.util.Scanner;
import java.util.Locale;

public class MaiorPosicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		double maior = vetor[0];
		int posMaior = 0;
		for(int i = 1; i < n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		System.out.printf("%nMAIOR VALOR = %.1f%n", maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posMaior);
		sc.close();
	}
}
