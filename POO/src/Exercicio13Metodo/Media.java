package Exercicio13Metodo;

public class Media {

    static double nota1;
    static double nota2;
    static double somaDasNotas = (nota1 + nota2) ;
    static double media = somaDasNotas;
            
    double media () {
            return this.somaDasNotas/2;
            
        if ( media >6 ) {
            System.out.println("Voc� teve m�dia maior que 6 e est� APROVADO");
        } else if(media >4 && media < 6) {
            System.out.println("Voc� teve m�dia entre 4 e 6, voc� precisa de VERIFICA��O SUPLEMENTAR");
        } else {
            System.out.println("Voc� teve m�dia abaixo de 4, voc� est� REPROVADO");
        }
            }
}
