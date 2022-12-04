package Lista 7;

public class LivroLivraria extends Livro {

    private float preco;
    private int estoque;

    public void preco ( float preco ){
        this.preco = preco;
    }

    public Float preco(){
        return preco;
    }

    public void estoque( int estoque ){
        this.estoque = estoque;
    }

    public int estoque(){
        return estoque;
    }

    public void isAvailable(){

    }

    public void sell(){

    }

    //precisa fazer sobreposicao de metodos?
    
}
