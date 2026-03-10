package DadosPessoaisExercicio;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas: ");
		int x = sc.nextInt();
		sc.nextLine();
		DadosPessoais[] vetor = new DadosPessoais[x];
		for(int i = 0; i < x; i++) {
			System.out.print("Dados da " + (i + 1) + "a pessoa: \n");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			vetor[i] = new DadosPessoais(nome, idade, altura);
		}
		double soma = 0;
		double qnt = 0;
		for(int i = 0; i < x; i++) {
			soma += vetor[i].getAltura();
			if(vetor[i].getIdade() < 16) {
				qnt += 1.0;
			}
		}
		System.out.printf("Altura média: %.2f", soma / x);
		System.out.print("\nPessoas com menos de 16 anos: " + ((qnt / x) * 100) + "%\n");
		for(int i = 0; i < x; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		sc.close();
	}
}
