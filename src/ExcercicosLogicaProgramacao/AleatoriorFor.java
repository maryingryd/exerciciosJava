package ExcercicosLogicaProgramacao;

import java.util.Random;
import java.util.Scanner;

public class AleatoriorFor {
    // Gere 10 números aleatórios entre 0 e 100; mostre todos na tel (em uma única linha); identifique o menor e o maior deles.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random sorteador = new Random();

        int var1 = 0;
        int maior = 0;
        int menor = 100 ;

        entrada.close();

        for (int num = 0; num <= 10; num++) {
            var1 = sorteador.nextInt(101);

            if (var1 > maior) {
                maior = var1;
            }
            if (var1 < menor) {
                    menor = var1;
                }

            
            System.out.print(var1 + "  ");
        }
        ;

        System.out.print((maior) + "Maior ");
        System.out.print((menor) + "Menor ");
    }
}
