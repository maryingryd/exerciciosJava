package ExcercicosLogicaProgramacao;

import java.util.Scanner;

public class ProvaLogProgramacao2 {

    public static void main(String[] args) {
        // Elabore um algoritmo que l� um n�mero inteiro e informa se o n�mero lido � negativo ou positivo. O valor zero � considerado positivo. Insira
        // seu c�digo a seguir.
        Scanner scan = new Scanner(System.in);
        int valor = 0;

        System.out.println("Digite um n�mero e vamos verificar se ele � positivo ou negativo, consideramos o zero como positivo");

        valor = scan.nextInt();

        if (valor >= 0) {
            System.out.println("Seu n�mero " + valor + " � positivo");
        } else {
            System.out.println("Seu n�mero " + valor + " � negativo");
        }

    }

}
