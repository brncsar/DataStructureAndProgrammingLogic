import java.util.Scanner;

public class CalculadorDePorcentagem {
    public static void main (String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Entre com o salario do funcionario R$ :");

        double salario = entradas.nextInt();

        System.out.println("Entre com a porcentagem escolhida % :");

        int porcetagemSelecionada = entradas.nextInt();

        double operacao = porcetagemSelecionada / 100.0 * salario;
        System.out.println("A porcentagem sobre o salario é : " + operacao);
    }
}