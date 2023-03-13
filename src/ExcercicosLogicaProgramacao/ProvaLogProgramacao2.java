package ExcercicosLogicaProgramacao;

import java.util.Scanner;

public class ProvaLogProgramacao2 {

    public static void main(String[] args) {
        // Elabore um algoritmo que lê um número inteiro e informa se o número lido é negativo ou positivo. O valor zero é considerado positivo. Insira
        // seu código a seguir.
        Scanner scan = new Scanner(System.in);
        int valor = 0;

        System.out.println("Digite um número e vamos verificar se ele é positivo ou negativo, consideramos o zero como positivo");

        valor = scan.nextInt();

        if (valor >= 0) {
            System.out.println("Seu número " + valor + " é positivo");
        } else {
            System.out.println("Seu número " + valor + " é negativo");
        }

    }

}
