import java.util.Scanner;

public class SwitchExercice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte dia;

        while (true) {
            System.out.println("Enter a number that corresponds to the day of the week, taking Sunday as day 1 (or 0 to exit): ");
            dia = input.nextByte();

            if (dia == 0) {
                System.out.println("Exit Program");
                break;
            }

            switch (dia) {
                case 1:
                    System.out.println(dia + " Domingo  -" + " Final de semana");
                    break;
                case 2:
                    System.out.println(dia + " Segunda  -" + " Dia útil");
                    break;
                case 3:
                    System.out.println(dia + " Terça  -" + " Dia útil");
                    break;
                case 4:
                    System.out.println(dia + " Quarta  -" + " Dia útil");
                    break;
                case 5:
                    System.out.println(dia + " Quinta  -" + " Dia útil");
                    break;
                case 6:
                    System.out.println(dia + " Sexta  -" + " Dia útil");
                    break;
                case 7:
                    System.out.println(dia + " Sábado  -" + " Final de semana");
                    break;
                default:
                    System.out.println("Número inválido! Digite um número de 1 a 7 ou 0 para sair.");
            }
        }

        input.close(); // Fecha o scanner ao final do programa
    }
}