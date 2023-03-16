package ExercicioMetodo1;

public class Calculadora2 {
    /* (-) */ private double numero1;
    /* (-) */ private double numero2;

    /* (+) */ double calcular(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;

        switch (operador) {
        case "+":
            return this.somar();
        case "-":
            return this.subtrair();
        case "*":
            return this.multiplicar();
        case "/":
            return this.dividir();
        case "^":
            return this.potencializar();
        default:
            return -1;
        }
    }

    /* (-) */ double somar() {
        return this.numero1 + this.numero2;
    }

    /* (-) */ double subtrair() {
        return this.numero1 - this.numero2;
    }

    /* (-) */ double multiplicar() {
        return this.numero1 * this.numero2;
    }

    /* (-) */ double dividir() {
        return this.numero1 / this.numero2;
    }

    /* (-) */ double potencializar() {
        return Math.pow(this.numero1, this.numero2);
    }


}
