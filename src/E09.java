import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("********* CALCULADORA DE FATORIAL *********");

        System.out.println("Informe o número que você deseja saber o fatorial");
        int numero = entradaDoUsuario.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial é " + fatorial);
    }
}
