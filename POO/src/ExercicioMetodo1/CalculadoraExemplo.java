package ExercicioMetodo1;

import java.util.Scanner;

public class CalculadoraExemplo {

    public static void main(String[] args) {

        // Problema: Classe calculadora capaz de calcular soma, subtra��o, divis�o, multiplica��o e potencia��o

        Scanner scanner = new Scanner(System.in);

        // Utilizando recursos est�ticos
        /*
         * System.out.println("Informe o 1� n�mero:"); Calculadora.numero1 = scanner.nextDouble();
         * 
         * System.out.println("Informe a opera��o desejada:"); Calculadora.operador = scanner.next();
         * 
         * System.out.println("Informe o 2� n�mero"); Calculadora.numero2 = scanner.nextDouble();
         * 
         * Calculadora.calcular();
         * 
         * System.out.println("Resultado: " + Calculadora.resultado);
         */

        // ----------------------------------------------------------

        // Utilizando recursos de inst�ncia
        Calculadora2 calc = new Calculadora2();

        System.out.println("Informe o 1� n�mero:");
        double num1 = scanner.nextDouble();

        System.out.println("Informe a opera��o desejada:");
        String op = scanner.next();

        System.out.println("Informe o 2� n�mero");
        double num2 = scanner.nextDouble();

        double resultado = calc.calcular(num1, num2, op);

        System.out.println("Resultado: " + resultado);

        scanner.close();

    }

}
