package abstracao;

public class Exemplo {

    public static void main(String[] args) {
        // Problema: ligar um carro e saber se esta ligado ou não

        // Ter um carro instanciado
        Carro meuCarro = new Carro("Ford");

        // Ligar esse carro
        meuCarro.ligar();

        // Verificar se eles esta ligado
        if (meuCarro.ligado)
            System.out.println("Carro está ligado");
        else
            System.out.println("Carro NÂO está ligado");
    }

}
