package arrays;

public class ExemploArray {

    public static void main(String[] args) {
        int[] vetor = { 14, 17, 26 };
        // System.out.println(vetor[0]);
        for (int index = 0; index < vetor.length; index++) {
            System.out.println(vetor[index]);
        }

        // Array de duas dimensões (Matriz)
        // 0-0 0-1 0-2/ 1-0 1-1 1-2 / 2-0 2-1 2-2 / 3-0 3-1 3-2
        int[][] matriz = { { 67, 68, 79 }, { 70, 801, 45 }, { 73, 16, 78, 9999 }, { 45, 67, 88 } };
        System.out.println(matriz[0][0]);
        for (int linha = 0; linha < matriz.length; linha++) {
            // esotu iterando a linha
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // estou iterando coluna da linha
                System.out.println(matriz[linha][coluna] + " ");
            }

        }
    }

}
