import java.util.Scanner;

public class IfElse{
    public static void main (String[] args){

        double salario = 4501;
        double operacao;

        if(salario > 4500){
            operacao = 30 / 100.0 * salario;
            System.out.println("Salario maior que 4500 - porcentagem escolhida 30% :" + operacao);
        }else{
            operacao = 15 / 100.0 * salario;
            System.out.println("Salario menor que 4500 - porcentagem escolhida 15% :" + operacao);

        }

    }
}