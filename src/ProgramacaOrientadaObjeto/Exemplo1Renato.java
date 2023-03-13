package ProgramacaOrientadaObjeto;

public class Exemplo1Renato {

    public static void main(String[] args) {
        forno fornoCasa = new forno();
        fornoCasa.tipo = "metal";
        fornoCasa.ligar(150);
        System.out.println(fornoCasa.ligado + fornoCasa.temperatura + "graus");
        
        // Criar diferentes biscoitos a partir de sua fôrma
        biscoito biscoitoDeNatal = new biscoito();
        biscoitoDeNatal.forma = "Redondo";
        biscoitoDeNatal.ingredientes[0] = "Farinha de trigo";
        biscoitoDeNatal.ingredientes[1] = "Leite";
        biscoitoDeNatal.ingredientes[2] = "Açúcar";
        biscoitoDeNatal.ingredientes[3] = "Granulado colorido";
        // biscoitoDeNatal.pronto

        biscoito amanteigado = new biscoito();
        amanteigado.forma = "Quadrado";
        amanteigado.ingredientes[0] = "Farinha de trigo";
        amanteigado.ingredientes[0] = "Leite";
        amanteigado.ingredientes[0] = "Açúcar";
        amanteigado.ingredientes[0] = "Manteiga";
        // biscoitoDeNatal.pronto
    }

}
