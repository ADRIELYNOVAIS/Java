package Lista 7;

public class AlunoPosgraduacao extends Aluno {

    AlunoPosgraduacao alunoPosgraduacao = new AlunoPosgraduacao();

    private String nomeOrientador, nomePesquisa, nivel;

    public void nomeOrientador( String nomeOrientador ){
        this.nomeOrientador = nomeOrientador;
    }

    public String nomeOrientador(){
        return nomeOrientador;
    }

    public void nomePesquisa( String nomePesquisa ){
        this.nomePesquisa = nomePesquisa;
    }

    public String nomePesquisa(){
        return nomePesquisa;
    }

    public void tipoCurso( String tipoCurso ){
        this.tipoCurso = tipoCurso;
    }

    public String tipoCurso(){
        return tipoCurso;
    }

    public float custo( float mensalidade ){
         float valor;

         valor= 0;

         return valor;
    }
    
}
