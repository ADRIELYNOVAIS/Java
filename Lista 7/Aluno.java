package Lista 7;

public class Aluno {

    private String nome, tipoCurso;
    private int matricula, semestre;
    private Date dataAdmissao;
    private float mensalidade;

    public void nome( String nome ){
        this.nome = nome;
    }

    public String nome(){
        return nome;
    }

    public void tipoCurso( String tipoCurso ){
        this.tipoCurso = tipoCurso;
    }
    public String tipoCurso(){
        return tipoCurso;
    }

    public void matricula( int matricula ){
        this.matricula = matricula;
    }

    public int matricula(){
        return matricula;
    }

    public void semestre( int semestre ){
        this.semestre = semestre;
    }

    public int semestre(){
        return semestre;
    }

    public void dataAdmissao( Date dataAdmissao ){
        this.dataAdmissao = dataAdmissao;
    }

    public Date dataAdmissao(){
        return dataAdmissao;
    }

    public void mensalidade( float mensalidade ){
        this.mensalidade = mensalidade;
    }

    public float mensalidade(){
        return mensalidade;
    }

    public String imprimeDadosAluno(){
        
        String dados;
        dados ="nome : "+ nome +"\n tipoCurso: "+ tipoCurso +"\n matricula"+ matricula +"\n semestre"+ semestre +"\n dataAdmissao"+ dataAdmissao +"\n mensalidade "+ mensalidade;
        return dados;

    }
        
}
