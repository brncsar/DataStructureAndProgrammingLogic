import java.util.Scanner;

public class LoopsMenu {
    public static void main(String[] args) {
        int option = 0;
        Scanner entrada = new Scanner(System.in);
        while (option != 3){
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.println("Digite a opção desejada");
            option = entrada.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
