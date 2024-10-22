import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite algum número:");

        int numero = entradas.nextInt(); // Ler como int
        int operacao = numero % 2;

        if (operacao == 0) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }
        entradas.close();
    }
}
