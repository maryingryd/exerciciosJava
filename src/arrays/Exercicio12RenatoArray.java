package arrays;

public class Exercicio12RenatoArray {

    public static void main(String[] args) {
        // Problema 2: Criar dois arrays de uma dimens�o (vetores) de 50 posi��es com n�meros aleat�rios
        // orden�-los individualmente, combin�-los em uma �nica estrutura, e ap�s, orden�-la novamente

        // Criar o 1� array (50 posi��es) com aleat�rios
        int[] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 100);
        }

        // Orden�-lo
        for (int i = 0; i < array1.length; i++) {
            for (int i2 = i; i2 < array1.length; i2++) {
                if (array1[i] > array1[i2]) {
                    int aux = array1[i];
                    array1[i] = array1[i2];
                    array1[i2] = aux;
                }
            }
        }

        // Criar o 2� array (50 posi��es) com aleat�rios
        int[] array2 = new int[50];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.round(Math.random() * 100);
        }

        // Orden�-lo
        for (int i = 0; i < array2.length; i++) {
            for (int i2 = i; i2 < array2.length; i2++) {
                if (array2[i] > array2[i2]) {
                    int aux = array2[i];
                    array2[i] = array2[i2];
                    array2[i2] = aux;
                }
            }
        }

        // Criar um 3� array (100 posi��es) combinando os valores dos dois anteriores
        int[] array3 = new int[100];

        // // Percorrer array1 atribuindo seus valores ao novo array (pos 0 � 49)
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // // Percorrer array2 atribuindo seus valores tamb�m ao novo array (pos 50 � 99)
        for (int i = 0; i < array2.length; i++) {
            array3[50 + i] = array2[i];
        }

        // Orden�-lo
        for (int i = 0; i < array3.length; i++) {
            for (int i2 = i; i2 < array3.length; i2++) {
                if (array3[i] > array3[i2]) {
                    int aux = array3[i];
                    array3[i] = array3[i2];
                    array3[i2] = aux;
                }
            }
        }

        // Resultado final
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

}
