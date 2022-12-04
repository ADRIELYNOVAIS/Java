package Lista 7;

import java.util.Date;

public class LivroBiblioteca extends Livro {

    LivroBiblioteca(String title, String author, int numPgs, int anoPubli) {
        super(title, author, numPgs, anoPubli);
    }

    private Boolean emprestado;
    private Date dataDevolucao;

    public void emprestado( boolean emprestado ){
        this.emprestado = emprestado;
    }

    public boolean emprestado(){
        return emprestado;
    }

    public void dataDevolucao( Date dataDevolucao ){
        this.dataDevolucao = dataDevolucao;
    }
    
    public Date dataDevolucao(){
        return dataDevolucao;
    }

    public void isAvailable(){

    }

    public void borrow(){
        
    }
}
