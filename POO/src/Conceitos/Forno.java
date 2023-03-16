package Conceitos;

public class Forno {

    /* Características */
    String tipo = ""; // metal ou barro
    boolean ligado = false;
    double temperatura = 0;
    
    /* Comportamentos */
    void ligar(Pessoa cozinheiro, double temperatura) {
        System.out.println("Quem ligou o forno foi " + cozinheiro.nome);
        this.temperatura = temperatura;
        this.ligado = true;
    }
    
    void assar(Biscoito item) {
        // [...]
        item.pronto = true;
    }

}
