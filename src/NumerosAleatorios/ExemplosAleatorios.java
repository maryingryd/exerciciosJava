package NumerosAleatorios;

import java.util.Random;

public class ExemplosAleatorios {

    public static void main(String[] args) {
        double aleatorio1 = (Math.random() * 10);
        double aleatorioArredondado = Math.round(aleatorio1);
        System.out.println(Math.round(aleatorioArredondado));
        
        Random sorteador = new Random();
        int aleatorio2 = sorteador.nextInt(1000);
        System.out.println(aleatorio2);
        
        
    }
}
