import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("***** CALCULADORA DE MÉDIA *****");

        System.out.println("Informe a quantidade de números");
        int quantidade = entradaDoUsuario.nextInt();

        // Leitura do primeiro número inserido pelo usuário
        int primeiroNumero = entradaDoUsuario.nextInt();
        int maior = primeiroNumero;
        int menor = primeiroNumero;

        // Solicitação dos demais números
        System.out.println("Agora informe os números");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Número:");
            int numero = entradaDoUsuario.nextInt();
// Verifica se o número atual é menor que o valor atual de 'menor' e atualiza
            if (numero < menor) {
                menor = numero;
            }
            // Verifica se o número atual é maior que o valor atual de 'maior' e atualiza, se necessário
            if (numero > maior) {
                maior = numero;
            }

        }
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
    }
}


