import java.util.Scanner;

public class LoopsLoginExrcise2 {

    // Constantes para login e senha
    public static final String SENHA = "password";
    public static final String USUARIO = "user";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        final int LIMITE_TENTATIVAS = 3;

        while(tentativas < LIMITE_TENTATIVAS){
            System.out.println("Digite seu usuário:");
            String login = scanner.nextLine();
            System.out.println("Digite sua senha:");
            String password = scanner.nextLine();

            if(login.equals(USUARIO) && password.equals(SENHA)){
                System.out.println("Acesso permitido");
                break; // Encerra o loop
            } else {
                tentativas++;
                System.out.println("Acesso negado");

                if(tentativas == LIMITE_TENTATIVAS) {
                    System.out.println("Número máximo de tentativas alcançado. Encerrando o programa.");
                }
            }
        }
    }
}
