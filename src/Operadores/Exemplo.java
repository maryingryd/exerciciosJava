package Operadores;

public class Exemplo {

    public static void main(String[] args) {
        // Operadores de Atribuição
        int numero1 = 2;
        System.out.println(numero1);
        int numero2 ;
        numero2 = numero1;
        System.out.println(numero2);
        numero1 = 0;
        System.out.println(numero1);
        System.out.println(numero2);
        
        // Operadores Aritmeticos
        
        // Soma
        int soma = 5+5;
        System.out.println(soma);
        int soma2 = soma+10;
        System.out.println(soma2);
        System.out.println(soma + soma2);
        
        //Extra
        String primeiroNome = "Ingryd";
        String segundoNome = "Mary";
        String nome = primeiroNome + " " + segundoNome;
        System.out.println(nome);
        
        
        //Subtracação
        int sub = 10-5;
        System.out.println(sub);
        int sub2 = sub-2;
        System.out.println(sub2);
        
        //Multiplicação
        int mult =3^3;
        System.out.println(mult);
        int mult2 = 3^mult;
        System.out.println(mult2);
        
        //Divisão
        double div = 10.0/5;
        System.out.println(div);
        double div2 = 10.0/3 ;
        System.out.println(div2);
        
        
        // Módulo
       double mod = 10.0 % 3;
       System.out.println(mod);
       
       // Operadores de incremento / decremento 
       int contador = 0;
       System.out.println(contador);
       int contador2 = ++contador;
       System.out.println(contador2);
       int contador3 = 10;
       System.out.println(--contador3);
       System.out.println(contador3--);
       System.out.println(contador3);
       
       // Operadores de atribução e aritiméticos
       int numeroSoma = 1;
       //numeroSoma += 7;
       numeroSoma = numeroSoma + 7;
       System.out.println(numeroSoma);
       int numeroDivisao = 10;
       numeroDivisao /= 5;
       System.out.println(numeroDivisao);
       
       // Operadores de Igualdade (ou diferença)
       //expressao = bloco com o objetivo de retornar um resultado boolean, lógico
       boolean expr1 = 1 == 1;
       boolean expr2 = -7 !=0;
       System.out.println(expr1);
       System.out.println(expr2);
       
       //Operadores Relacionais 
       boolean expr3 = 1 <=10; // true
       boolean expr4 = 1 >=10; // false
       System.out.println(expr3);
       System.out.println(expr4);
       int numeroRel1 =8;
       int numeroRel2 =7;
       System.out.println(numeroRel1 < numeroRel2);
       
       //Operadores Lógicos
       boolean expr5 = true;
       boolean expr6 = 5 > 10; //false
       boolean expr7 = "AB" != "BA";//true
       boolean resExpr = expr5 && expr6 && expr7; // E
       System.out.println(resExpr);
       
       boolean expr8 = true;
       boolean expr9 = 5 > 10; //false
       boolean expr10 = "AB" != "BA";//true
       boolean res2Expr = expr8 || expr9 || expr10; // OU
       System.out.println(res2Expr);
       
       int numSelecionado = 8;
       boolean res3Expr = numSelecionado == 0 || (numSelecionado <=10 && numSelecionado > 0);
       System.out.println(res3Expr);
       
       
    }

}
