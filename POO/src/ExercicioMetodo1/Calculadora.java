package ExercicioMetodo1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    // 15) Crie uma classe Calculadora que fa�a as opera��es de soma,
    // subtra��o, multiplica��o, divis�o e potencia��o. Cada opera��o
    // deve ser um m�todo e todos os m�todos devem ser est�ticos.
    // Para fazer a escolha das opera��es use como base o exerc�cio 4.

    static double numero1;
    static double numero2;
    static String operador;

    static double resultado;

    static void calcular() {
        switch (operador) {
        case "+":
            somar();
            break;
        case "-":
            subtrair();
            break;
        case "*":
            multiplicar();
            break;
        case "/":
            dividir();
            break;
        case "^":
            potencializar();
            break;
        default:
            System.out.println("Opera��o � inv�lida");
            break;
        }
    }

    static void somar() {
        resultado = numero1 + numero2;
    }

    static void subtrair() {
        resultado = numero1 - numero2;
    }

    static void multiplicar() {
        resultado = numero1 * numero2;
    }

    static void dividir() {
        resultado = numero1 / numero2;
    }

    static void potencializar() {
        resultado = Math.pow(numero1, numero2);
    }
}