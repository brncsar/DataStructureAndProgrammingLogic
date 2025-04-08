import java.util.Scanner;

public class ReverseCount {
    public static void main(String[] args) throws InterruptedException {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Diite o numero que deseja contar de forma regressiva.");
        int choiceNumber = entradas.nextInt();
        System.out.println("Você digitou: " + choiceNumber);



        for (int i = choiceNumber; i >= 0 ; i--){
            System.out.println(i);
            System.out.println("_____");
            Thread.sleep(1000);

        }
    }
}
