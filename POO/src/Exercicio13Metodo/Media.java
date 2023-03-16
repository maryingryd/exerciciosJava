package Exercicio13Metodo;

public class Media {

    static double nota1;
    static double nota2;
    static double somaDasNotas = (nota1 + nota2) ;
    static double media = somaDasNotas;
            
    double media () {
            return this.somaDasNotas/2;
            
        if ( media >6 ) {
            System.out.println("Você teve média maior que 6 e está APROVADO");
        } else if(media >4 && media < 6) {
            System.out.println("Você teve média entre 4 e 6, você precisa de VERIFICAÇÃO SUPLEMENTAR");
        } else {
            System.out.println("Você teve média abaixo de 4, você está REPROVADO");
        }
            }
}
