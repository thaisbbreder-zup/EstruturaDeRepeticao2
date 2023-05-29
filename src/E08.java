public class E08 {
    public static void main(String[] args) {
        System.out.println("********** SOMA DOS Nº IMPARES DE 1 A 50 **********");

        int quantidade = 50;
        int soma = 0;

        for (int i = 1; i < quantidade; i += 2) { //i é iniciado com 1 e é atribuido +2 a cada loop para garantir que o próximo nº seja impar
            System.out.print(soma);
            System.out.print(" + " + i + " = ");
            soma += i;
            System.out.println(soma);

        }
        System.out.println("--------------------------------------------------------------------");
        System.out.print("O resultado final da soma dos números impares de 1 a 50 foi " + soma);
        System.out.println("\n--------------------------------------------------------------------");
    }
}