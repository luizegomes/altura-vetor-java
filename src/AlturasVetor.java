/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem 
de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. */
import java.util.Locale;
import java.util.Scanner;

public class AlturasVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + altura[i];
        }

        double contagem = 0.0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                contagem++;
            }
        }
        double percent = contagem * 100.0 / n;

        System.out.printf("%nAltura média: %.2f%n", (soma / n));
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s%n", nome[i]);
            }
        }
        sc.close();
    }

}
