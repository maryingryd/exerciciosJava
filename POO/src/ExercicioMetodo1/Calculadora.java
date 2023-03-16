package ExercicioMetodo1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    // 15) Crie uma classe Calculadora que faça as operações de soma,
    // subtração, multiplicação, divisão e potenciação. Cada operação
    // deve ser um método e todos os métodos devem ser estáticos.
    // Para fazer a escolha das operações use como base o exercício 4.

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
            System.out.println("Operação é inválida");
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