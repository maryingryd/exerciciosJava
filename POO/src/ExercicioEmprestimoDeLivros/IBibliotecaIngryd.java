package ExercicioEmprestimoDeLivros;

public  interface IBibliotecaIngryd {
    
    int maxDiasEmprestado = 30;
    
    boolean estaEmprestado ();
    
    void empresta();
    
    void devolve ();
    
    void secao();
    
    String resumoLivro ();
    

    
}
