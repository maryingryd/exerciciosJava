package ExcercicosLogicaProgramacao;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ordenar100Aleatorios {

	public static void main(String[] args) {
		int vet[] = new int[100];
		int aux = 0;
		int i = 0;
		int j = 0;
		Random gerador = new Random();

		System.out.println(" Valores desordenados ");
		for (i = 0; i < vet.length; i++) {
			gerador.nextInt(99);
			vet[i] = gerador.nextInt(99);
			System.out.print(" " + vet[i]);
		}

		// ordenar

		for (j = 0; j < vet[i]; j++) {
			for (int k = 0; k < vet[i]; k++) {
				if (vet[j] < vet[k]) {
					aux = vet[j];
					vet[j] = vet[k];
					vet[k] = aux;
				}
			}
			System.out.println(aux + " ");
		}
	}
}
