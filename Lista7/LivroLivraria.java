package Lista7;

public class LivroLivraria extends Livro {
    
    private float preco;
    private int estoque;

    LivroLivraria( String titulo, String autor, int nroPaginas, int anoPublicacao, float preco, int estoque  ){
        super( titulo, autor, nroPaginas, anoPublicacao );

        preco = this.preco;
        estoque = this.estoque;

    }

    public float vender( ){
        return preco;
    }

    public int disponivel(){
       return 0;
    }

    @Override
    public String toString(){
        String text;

        text  = "Preco: " + preco + "\n Estoque: " + estoque;
            
        text = super.toString() +"\n" + text;
        
        return text;

    }
}
