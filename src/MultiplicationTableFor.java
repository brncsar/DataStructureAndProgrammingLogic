import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type in the number you want to operate on: ");
        int num = input.nextInt();
        System.out.println("The mutiplication table is : ");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*num);

        }
        System.out.println("Finish Program");
    }
}
