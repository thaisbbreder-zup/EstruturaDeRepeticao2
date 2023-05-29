import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("******* VERIFIQUE SE O NÚMERO É PRIMO *******");

        System.out.println("Informe o número que você deseja verificar");
        int numero = entradaDoUsuario.nextInt();

        //variável boolean que armazena se o número é primo
        boolean numPrimo = true;

        //se for menor que 1, atribui false a variável
        if (numero < 1) {
            numPrimo = false;
            System.out.println("O número informado não é primo!");
        } else {
            for (int i = 2; i < numero; i++) {
                //verifica se o número é divisível por i e atribui false a variável se houver sobra na divisão
                if (numero % i == 0)
                    numPrimo = false;
            }

            // Verifica o que foi atribuído a "numPrimo"
            if (numPrimo) {
                System.out.println("O número informado é primo!");
            } else {
                System.out.println("O número informado não é primo!");
            }
        }
    }
}
