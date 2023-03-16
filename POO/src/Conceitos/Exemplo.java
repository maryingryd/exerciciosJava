package Conceitos;

public class Exemplo {

    public static void main(String[] args) {
        Pessoa renato = new Pessoa(); // Instancia uma nova pessoa (um novo objeto da classe Pessoa)
        renato.nome = "Renato";
        renato.gostaDeBiscoito = false;
        
        Pessoa joao = new Pessoa(); // Instancia mais uma pessoa (outro novo objeto da classe Pessoa)
        joao.nome = "Jo�o";
        joao.gostaDeBiscoito = true;
        
        Forno fornoCasa = new Forno();
        fornoCasa.tipo = "metal";
        System.out.println(fornoCasa.ligado + " em " + fornoCasa.temperatura  + " graus");
        fornoCasa.ligar(joao, 150);
        System.out.println(fornoCasa.ligado + " em " + fornoCasa.temperatura  + " graus");
        
        // Criar diferentes biscoitos a partir de sua f�rma
        Biscoito biscoitoDeNatal = new Biscoito(); // Instancia um novo objeto
        biscoitoDeNatal.forma = "Redondo";
        biscoitoDeNatal.ingredientes[0] = "Farinha de trigo";
        biscoitoDeNatal.ingredientes[1] = "Leite";
        biscoitoDeNatal.ingredientes[2] = "A��car";
        biscoitoDeNatal.ingredientes[3] = "Granulado colorido";
        System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);
        fornoCasa.assar(biscoitoDeNatal);
        System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);
        
        Biscoito amanteigado = new Biscoito(); // Instancia um novo objeto
        amanteigado.forma = "Quadrado";
        amanteigado.ingredientes[0] = "Farinha de trigo";
        amanteigado.ingredientes[1] = "Leite";
        amanteigado.ingredientes[2] = "A��car";
        amanteigado.ingredientes[3] = "Manteiga";
        System.out.println("Amanteigado pronto? " + amanteigado.pronto);
        fornoCasa.assar(amanteigado);
        System.out.println("Amanteigado pronto? " + amanteigado.pronto);
        
        boolean comeu = joao.comer(amanteigado);
        if (comeu == true) {
            System.out.println(joao.nome + " comeu o amanteigado");
        } else {
            System.out.println(joao.nome + " N�O comeu o amanteigado");
        }
        
        boolean comeu2 = renato.comer(biscoitoDeNatal);
        if (comeu2 == true) {
            System.out.println(renato.nome + " comeu o amanteigado");
        } else {
            System.out.println(renato.nome + " N�O comeu o amanteigado");
        }
    }

    }

}
