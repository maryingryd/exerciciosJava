package ExercicioEmprestimoDeLivros;

public class Livros  {
    
    private String titulo;
    private String autor;
    public String secao;
    private int qntPag;
    

    public Livros(String titulo, String autor, int qntPag, String secao) {
        this.titulo = titulo;
        this.autor = autor;
        this.qntPag = qntPag;
        this.secao = secao;

    }
    
    public String getTitulo () {
        return titulo;
        
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
        
    }
    
    public String getAutor () {
        return autor;
        
    }
    
    public void setAutor( String autor) {
        this.autor = autor;
        
    }
    
    public int getQntPag () {
        return qntPag;
        
    }
    
    public void setQntPag( int qntPag) {
        this.qntPag = qntPag;
        
    }

    public String resumoLivro() {
        return getTitulo() + ";" + getAutor() + ";" + getQntPag();

    }

    public void secao() {
        System.out.println("O livro esta na Seção " + secao);

    }

    public boolean estaEmprestado1() {
        boolean emprestado = false;
        if (emprestado) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaEmprestado() {
        return false;
    }

    
}
