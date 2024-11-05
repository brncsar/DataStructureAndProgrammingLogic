import java.util.Objects;
import java.util.Scanner;

public class LoopsLoginExercise {

    public static final String senha = "password";

    public static final String usuario = "user";

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        int close = 0;

        while(close != 3){
            System.out.println("Enter with your user");
            String login = entradas.nextLine();
            System.out.println("Enter with your password");
            String password = entradas.nextLine();

            if(Objects.equals(login, usuario) && Objects.equals(password, senha)){
                System.out.println("Access permitted");
                close = 3;
                System.out.println("End program");
            }else{
                System.out.println("Access Denied");
            }

        }

    }
}
