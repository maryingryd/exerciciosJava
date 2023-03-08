package ExcercicosLogicaProgramacao;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {
        int tabuada =0;
        Scanner entrada = new Scanner(System.in);       
        System.out.println("Vamos contruir uma tabuada");
        System.out.println("Digite qual tabuada deseja exibir");
        tabuada = entrada.nextInt();
        
        entrada.close();
        
        for (int num=1; num <=10; num++) {
            System.out.println(tabuada*num);
        }

    }

}
