import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("***** CALCULADORA DE MÉDIA *****");

        System.out.println("Informe a quantidade de números ");
        int quantidade = entradaDoUsuario.nextInt();

        System.out.println("Agora informe os números");

        double soma = 0;

        for (int i = 0; i <= quantidade; i++) {
            System.out.println("Número:");
            double numeros = entradaDoUsuario.nextDouble();
            soma += numeros;
            i++;

        }
        double media = (double) soma / quantidade;
        System.out.println("A média dos números é: " + media);
    }
}
