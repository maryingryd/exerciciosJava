package ExcercicosLogicaProgramacao;

import java.util.Scanner;

public class FibonacciFor {

	public static void main(String[] args) {
		// Calcular fibonaci para um numero inteiro , positivo. Usuário digita e soma à
		// sequencia
		System.out.println("Vamos calcular a série Fibonacci, digite um número inteiro positivo");
		Scanner entrada = new Scanner(System.in);
		int inicialf0 = 0;
		int incialf1 = 1;
		int digitadoUsuario = entrada.nextInt();
		entrada.close();

		for (int index = 0; index < digitadoUsuario; index++) {
			int somaCalc = inicialf0 + incialf1;
			System.out.print(somaCalc + " ");
			inicialf0 = incialf1;
			incialf1 = somaCalc;		
		}

	}
}
