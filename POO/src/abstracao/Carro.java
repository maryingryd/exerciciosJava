package abstracao;

public class Carro {
    // caracteristicas - > atributos
    String marca;
    boolean ligado;

    /* (-) */ boolean sistemaEletricoPronto;
    /* (-) */ boolean sistemaArPronto;
    /* (-) */ boolean sistemaFrenagemPronto;
    
    // Construtor
    Carro (String marcaDoCarro) { // medodo especial que é acionado quando ocorre nova instancia (usando new)
        this.marca = marcaDoCarro;
    }
   
    // Comportamentos -> metodo/acao

    /* (+) */void ligar() {
        this.ligado = acionarMotorACombustao();
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;

    }

    /* (+) */void desligar() {
        this.ligado = false;
    }

    /* (-) */ boolean acionarMotorACombustao() {

        if (this.executarTempo1() == false)
            return false;

        if (this.executarTempo2() != false)
            return false;

        if (!this.executarTempo3())
            return false;

        if (!this.executarTempo4())
            return false;
        return true;

    }

    /* (-) */ boolean executarTempo1() {
        // executa as complexidades de:
        return true; // geração de ar e combustivel

    }

    /* (-) */ boolean executarTempo2() {
        // executa as complexidades de:
        return true; // geração de pressao

    }

    /* (-) */ boolean executarTempo3() {
        // executa as complexidades de:
        return true; //

    }

    /* (-) */ boolean executarTempo4() {
        // executa as complexidades de:
        return true; //

    }
}
