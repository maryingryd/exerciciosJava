package ExcercicosLogicaProgramacao;
import java.util.Scanner;


public class Idade {
    public static void main(String[] args) {
        System.out.println("Digite sua idade");
        Scanner idade = new Scanner(System.in);
        int anos = idade.nextInt();
        if (anos<18) {
            System.out.println("Voc� � menor de idade");        
        }else {
            System.out.println("Voc� � maior de idade");
        }
        idade.close();

    }
}
