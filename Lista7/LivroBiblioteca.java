package Lista7;

public class LivroBiblioteca extends Livro {
    
    private Data dataDevolucao;
    private boolean emprestado;

    LivroBiblioteca( String titulo, String autor, int nroPaginas, int anoPublicacao, boolean emprestado, Data dataDevolucao ){
        
        super( titulo, autor, nroPaginas, anoPublicacao );

        emprestado = this.emprestado;
        dataDevolucao = this.dataDevolucao;
    }

    @Override
    public String toString(){
        String text;

        text  = "Emprestado: " + emprestado + "\n Data Devolução: " + dataDevolucao;
            
        text = super.toString() +"\n" + text;
        
        return text;

    }

    public boolean isAvailable(){

        if ( emprestado ){
            return false;
        }
        return true;
    }
      public boolean borrow() {
        return emprestado;
      }   
}
