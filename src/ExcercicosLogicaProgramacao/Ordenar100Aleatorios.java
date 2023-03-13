package ExcercicosLogicaProgramacao;

import java.util.Random;

public class Ordenar100Aleatorios {

	public static void main(String[] args) {
		int vet[] = new int[100];
		int aux = 0;
		int i = 0;

		Random gerador = new Random();

		System.out.println(" Valores desordenados ");
		for (i = 0; i < vet.length; i++) {
			gerador.nextInt(99);
			vet[i] = gerador.nextInt(99);
			System.out.print(" " + vet[i]);
		}
		System.out.println(" ");
		System.out.println(" Valores ordenados ");
		for (int k = 0; k < vet.length; k++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}

			}
		}
		for (int q = 0; q < vet.length; q++) {
			System.out.print(" " + vet[q]);

		}
	}
}
