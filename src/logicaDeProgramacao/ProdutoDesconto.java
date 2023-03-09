package logicaDeProgramacao;

import java.util.Scanner;

public class ProdutoDesconto {

    public static void main(String[] args) {
        
        String nomeProduto;
        double preco=0, valorTotal;
        int quantidade=0;
        
        
        
        Scanner entrada = new Scanner(System.in);
   
        System.out.println("Vamos verificar se voc� tem direito a desconto");
        System.out.println("Digite o nome do produto comprado");
        nomeProduto=entrada.next();
        System.out.println("Digite o pre�o do produto comprado");
        preco = entrada.nextDouble();
        System.out.println("Digite a quantidade do produto comprado");
        quantidade = entrada.nextInt();
        
        valorTotal= (preco*quantidade);
        
        if (quantidade <= 10 ) { 
            System.out.println("Voc� pagar� o valor total dos produtos sem desconto = R$ " + valorTotal);        
        }else {
            if (quantidade >10 && quantidade <=20) {
                System.out.println("Voc� pagar� o valor total dos produtos com desconto de 10% = R$ " + (valorTotal*0.90));
            }else {
                if (quantidade >20 && quantidade <=50 ) {
                    System.out.println("Voc� pagar� o valor total dos produtos com desconto de 20% = R$ " + (valorTotal*0.80));                             
                } else {
                    System.out.println("Voc� pagar� o valor total dos produtos com desconto de 25% = R$ " + (valorTotal*0.75));
                }
            }
        }
                
        entrada.close();
   

    }

}
