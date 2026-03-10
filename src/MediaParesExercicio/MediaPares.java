package MediaParesExercicio;

import java.util.Scanner;
import java.util.Locale;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        int somaPares = 0;
        int contPares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                contPares++;
            }
        }
        if (contPares > 0) {
            double media = (double) somaPares / contPares;
            System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}