package Lista7;

public class Livro {
    private String titulo , autor;
    private int nroPaginas , anoPublicacao;

    Livro( String titulo, String autor, int nroPaginas, int anoPublicacao ){
        titulo = this.titulo;
        autor = this.autor;
        nroPaginas = this.nroPaginas;
        anoPublicacao = this.anoPublicacao;
    }

    
    public String toString(){

        String text;

        text  = "Titulo: " + titulo + "\nAutor: " + autor+ "\n Numeros Paginas:" + nroPaginas + "\n Ano Publicação: " + anoPublicacao;
        //resultado = super.toString() + "\n" + resultado;
        
        text = super.toString() +"\n" + text;
        
        return text;
   }
    
     public int isOlder(){ 

        return anoPublicacao;
        
     }


}
