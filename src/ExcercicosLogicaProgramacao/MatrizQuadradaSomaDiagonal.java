package ExcercicosLogicaProgramacao;

public class MatrizQuadradaSomaDiagonal {

	public static void main(String[] args) {
		// 10) leia uma matriz quadrada e determine a soma da diagonal
		// principal.
		int matriz[][] = { { 5, 10, 15, 20 }, { 25, 30, 35, 40 }, { 45, 50, 55, 60 }, { 65, 70, 75, 80 } };

		int linha, coluna = 0, soma = 0, diagonalPrincipal = 0;

		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					diagonalPrincipal = matriz[linha][coluna];
					soma = soma + matriz[linha][coluna];
				}
			}
			System.out.println(diagonalPrincipal);
		}
		System.out.println("A soma da diagnoal princial da Matriz é :");
		System.out.println(soma);

	}
}
