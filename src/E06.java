import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("******* CALCULADORA DE NÚMEROS IMPARES *******");
        System.out.println("Informe o valor inicial do intervalo");
        int inicio = entradaDoUsuario.nextInt();

        System.out.println("Informe o valor final do intervalo");
        int fim = entradaDoUsuario.nextInt();

        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("\nO intervalo informado é de " + inicio + " a " + fim);
        System.out.println("A soma dos números impares desse intevalo resultou em " + soma);
    }
}

