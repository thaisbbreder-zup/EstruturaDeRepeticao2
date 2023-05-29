import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("***** CALCULADORA *****");

        System.out.println("Informe a quantidade de números");
        int quantidade = entradaDoUsuario.nextInt();

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Solicitação dos números
        System.out.println("Agora informe os números");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Número:");
            int numero = entradaDoUsuario.nextInt();
            // Adição do número à variável soma
            soma += numero;
        }
        // Exibição do resultado da soma
        System.out.println("A soma desses números resultou em " + soma);
    }
}