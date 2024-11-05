import java.util.Scanner;

public class DoWhileGame {
    public static void main(String[] args) {
        int desejaContinuar = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Player 1: Digite um número de 1 a 10");
            int num1 = input.nextInt();
            System.out.println("Player 2: Digite um número de 1 a 10 ");
            int num2 = input.nextInt();
            System.out.println("Acertou: " + (num1 == num2));
            System.out.println("Desired continue play ? ");
            System.out.println("1. yes");
            System.out.println("2. no");
            desejaContinuar = input.nextInt();

        }while (desejaContinuar == 1);

        System.out.println("Finish Program");

    }
}
