package ExcercicosLogicaProgramacao;
import java.util.Scanner;

public class Jokepo {

    public static void main(String[] args) {
        int jogador, computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos jogar Jokep�!");
        System.out.println("1.Pedra");
        System.out.println("2.Papel");
        System.out.println("3.Tesoura");
        System.out.println("Escolha uma das op��es acima");
        
        //Jogador
        jogador = teclado.nextInt();

        switch (jogador) {
        case 1:
            System.out.println("Jogador escolheu Pedra");
            break;
        case 2:
            System.out.println("Jogador escolheu Papel");
            break;
        case 3:
            System.out.println("Jogador escolheu Tesoura");
            break;
        default:
            System.out.println("Escolha uma op��o v�lida");
            break;
        }
        //Computador
        computador = (int)(Math.random()*3+1);
        teclado.close();
        switch (computador) {
        case 1:
            System.out.println("Computador escolheu Pedra");
            break;
        case 2:
            System.out.println("Computador escolheu Papel");
            break;
        case 3:
            System.out.println("Computador escolheu Tesoura");
            break;
        }
            
        //vencedor
        
        if (jogador == computador) {
            System.out.println("Temos um empate");
        }else {
            if((jogador == 1 && computador == 3) || (jogador ==2 && computador == 1) || (jogador == 3 && computador ==2)) {
                System.out.println("Jogador venceu o jogo");
            }else {
                System.out.println("Computador venceu o jogo");
            }
        }   
    }
}
