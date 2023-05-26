public class E01 {
    public static void main(String[] args) {
        System.out.println("****** CONTADOR COM FOR ******");

        for(int i = 0 ; i <= 100 ; i++){
            System.out.println("A contador está em " + i);
        }

        System.out.println("\n\n****** CONTADOR COM WHILE ******");
        int i = 0;
        while (i <= 100){
            System.out.println("O contador está em " + i);
            i++;
        }
    }
}
