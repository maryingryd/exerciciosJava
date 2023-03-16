package ExercicioEmprestimoDeLivros;

public class Emprestimo extends Livros implements IBibliotecaIngryd {

    boolean emprestado;

    public Emprestimo(String titulo, String autor, int qntPag, String secao) {
        super(titulo, autor, qntPag, secao);
        emprestado = false;
        this.secao = secao;
    }

    public boolean estaEmprestado() {
        if (emprestado) {
            return true;
        } else {
            return false;
        }
    }

    public void empresta() {
        emprestado = true;

    }

    public void devolve() {
        emprestado = false;

    }

}
