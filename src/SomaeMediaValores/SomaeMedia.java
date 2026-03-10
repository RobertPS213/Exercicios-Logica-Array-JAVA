package SomaeMediaValores;

import java.util.Scanner;
import java.util.Locale;

public class SomaeMedia {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números voce vai digitar: ");
		int x = sc.nextInt();
		Numeros[] vetor = new Numeros[x];
		for(int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			vetor[i] = new Numeros(numero);
		}
		double soma = 0;
		System.out.print("\nVALORES = ");
		for(int i = 0; i < x; i++) {
			soma += vetor[i].getNumeros();
			System.out.print(vetor[i].getNumeros() + " ");
		}
		System.out.printf("%nSOMA = %.2f%nMEDIA = %.2f", soma, soma / x);
		sc.close();
	}
}
