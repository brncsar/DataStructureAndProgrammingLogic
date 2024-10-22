import java.util.Scanner;

public class AlistamentoMilitar{
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Qual seu sexo ? /b Responda com M para Masculino ou F para Feminino : ");
        String sexo = entradas.nextLine().toUpperCase();
        System.out.println("Você digitou: " + sexo);
        System.out.println("Qual sua idade ? : ");
        int idade = entradas.nextInt();
        System.out.println("Você digitou: " + idade);


        if(sexo.equals("M") && idade >= 18){
            System.out.println("Alistamento obrigatorio");
        }else if(sexo.equals("M") && idade < 18){
            System.out.println("Alistamento não obrigatorio");
        }else{
            System.out.println("Alistamento não obrigatorio");
        }
    }
}