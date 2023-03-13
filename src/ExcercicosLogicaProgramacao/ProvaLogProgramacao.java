package ExcercicosLogicaProgramacao;

public class ProvaLogProgramacao {

    public static void main(String[] args) {

        // Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e
        // a variável B passe a possuir o valor da variável A. Apresente os valores trocados. Insira seu código a seguir.

        int a = 30;
        int b = 50;
        int aux = 0;

        System.out.println("O valor inicial da variável A é :" + a + " e a variável B é " + b);
        System.out.println(" Vamos trocar as váriaveis de valores entre si:");

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        } else {
            aux = b;
            b = a;
            a = aux;
        }

        System.out.println("Agora variável A é :" + a + " e a variável B é " + b);

    }

}
