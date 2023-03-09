package ExcercicosLogicaProgramacao;

import java.util.Scanner;

public class LeiaNumeroDoWhile {

	public static void main(String[] args) {
		System.out.println(" Vamos ler todos os números que você digitar até acertar o mesmo que escolhermos");
		Scanner entrada = new Scanner(System.in);
		int num = 10;
		int digitadoUsuario = entrada.nextInt();

		while (digitadoUsuario != num) {
			System.out.println("Tente novamente para acertar");
			entrada = new Scanner(System.in);
			digitadoUsuario = entrada.nextInt();
		}
		System.out.println("Parabéns vc acertou o número 10");
		entrada.close();
	}
}
