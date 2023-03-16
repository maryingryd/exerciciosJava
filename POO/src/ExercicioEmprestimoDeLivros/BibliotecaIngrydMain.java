package ExercicioEmprestimoDeLivros;

public class BibliotecaIngrydMain {

    public static void main(String[] args) {
        
        Livros policial = new Livros ("Bom dia, Verônica ", "Rafael Montes", 150, "policial");
        
        String texto = policial.resumoLivro ();
        
        System.out.println("As informações do Livro são: " + texto );
        
        policial.secao();
        
        
        System.out.println("Vamos verificar se o livro esta disponível pra emprestimo:");
        
        if (policial.estaEmprestado()) {
            
            System.out.println("Este livro esta INDISPONIVEL, pois esta emprestado");
            
        } else {
            System.out.println("Este livro esta DISPONIVEL para locação");
        }
        
        
        
         

    }

}
