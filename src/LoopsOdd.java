import java.util.Scanner;

public class LoopsOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired value");
        int value = input.nextInt();
        int i = 0;
        while(i <= value){
            if(i % 2 != 0){
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}
