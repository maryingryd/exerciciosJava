package Conceitos;

public class Pessoa {
 static String especie = "Humano";
    
    String nome = "";
    boolean gostaDeBiscoito;

    boolean comer(Biscoito biscoito) {
        if (this.gostaDeBiscoito) {
            // come o biscoito
            return true;
        } else {
            // N�o vai comer
            return false;
        }
    }

}
