package ExcercicosLogicaProgramacao;

public class ProvaLogProgramacao {

    public static void main(String[] args) {

        // Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�vel A passe a possuir o valor da vari�vel B e
        // a vari�vel B passe a possuir o valor da vari�vel A. Apresente os valores trocados. Insira seu c�digo a seguir.

        int a = 30;
        int b = 50;
        int aux = 0;

        System.out.println("O valor inicial da vari�vel A � :" + a + " e a vari�vel B � " + b);
        System.out.println(" Vamos trocar as v�riaveis de valores entre si:");

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        } else {
            aux = b;
            b = a;
            a = aux;
        }

        System.out.println("Agora vari�vel A � :" + a + " e a vari�vel B � " + b);

    }

}
