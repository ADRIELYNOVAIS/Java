public class LivroBiblioteca extends Livro{

    private Data emprestado;
    private Data dataDevolucao;

    LivroBiblioteca( String title , String author , int numPgs , int anoPubli, Data emprestimo, Data dtDevolucao ){

        super( title, author, numPgs, anoPubli );
        emprestado = emprestimo;
        dataDevolucao  = dtDevolucao;

    }

    @Override
    public boolean isAvailable(){

        if(super()){
            return true;
        }

    }
    
    @Override
    borrow(){

    }

    @Override

    public String toString(){

        String text;
        text = super.toString() + "\n Emprestimo :" + emprestado + "\n Data de Devolução: " + dataDevolucao;

        return text;
    }
    
}
