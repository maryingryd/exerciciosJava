package ExcercicosLogicaProgramacao;

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double valor1, valor2, valor3;
        int cont;
        
        System.out.println("Vamos efetuar o seu calculo");
        System.out.println("Digite o primeiro valor");
        valor1= scan.nextDouble();
        
        System.out.println("Digite o segundo valor");
        valor2= scan.nextDouble();
        
        System.out.println("Agora, informe a opera��o que deseja fazer");
        System.out.println("1.Soma");
        System.out.println("2.Subtra��o");
        System.out.println("3.Multiplica��o");
        System.out.println("4.Divis�o");
        
        cont = scan.nextInt();
        scan.close();
        
        switch (cont) {
        case 1:
            valor3 = valor1+valor2;
            System.out.println(valor3);
        break;
        case 2:
            valor3 = valor1-valor2;
            System.out.println(valor3);
        break;
        case 3:
            valor3 = valor1*valor2;
            System.out.println(valor3);
        break;
        case 4:
            valor3 = valor1/valor2;
            System.out.println(valor3);
        break;
        default: 
            System.out.println("Informe uma op��o v�lida");
        }
    }
}

