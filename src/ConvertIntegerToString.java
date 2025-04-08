import java.util.Scanner;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number");
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        System.out.println(s);

        if (n == Integer.parseInt(s) ){
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong answer.");
        }
    }
}
