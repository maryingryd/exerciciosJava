package ExercicioEmprestimoDeLivros;

public class BibliotecaIngrydMain {

    public static void main(String[] args) {
        
        Livros policial = new Livros ("Bom dia, Ver�nica ", "Rafael Montes", 150, "policial");
        
        String texto = policial.resumoLivro ();
        
        System.out.println("As informa��es do Livro s�o: " + texto );
        
        policial.secao();
        
        
        System.out.println("Vamos verificar se o livro esta dispon�vel pra emprestimo:");
        
        if (policial.estaEmprestado()) {
            
            System.out.println("Este livro esta INDISPONIVEL, pois esta emprestado");
            
        } else {
            System.out.println("Este livro esta DISPONIVEL para loca��o");
        }
        
        
        
         

    }

}
