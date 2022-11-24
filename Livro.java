public class Livro{

    private String titulo;
    private String autor;
    private int numerosPaginas;
    private int anoPublicacao;


    Livro(String title , String author , int numPgs , int anoPubli ){

        titulo = title;
        autor = author;
        numerosPaginas = numPgs;
        anoPublicacao = anoPubli;

    }  
    
    @Override
    public String toString(){

        String frase;
        frase = " Titulo: "+ titulo +" Autor: " + autor + " Numeros Paginas: " + numerosPaginas + " Ano Publicacao: " + anoPublicacao;

        return frase;

    } 
    
    @Override
    public int isOlder(){

    }
}