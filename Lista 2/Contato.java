import java.util.Date;

public class Contato {
    String nome, email;
    int telefone;
    Date dataNascimento;

    public static int quantidadeContatos = 0 ;

    public void nome( String nome ){
        this.nome = nome;
    }

    public String nome(){
        return nome;
    }

    public void email( String email ){
        this.email = email;
    }

    public String email(){
        return email;
    }

    public void telefone( int telefone ){
        this.telefone = telefone;
    }

    public int telefone(){
        return telefone;
    }

    public void dataNascimento( Date dataNascimento ){
        this.dataNascimento = dataNascimento;
    }

    public Date dataNascimento(){
        return dataNascimento;
    }

    public void inicializarContato(String nome, String email, int telefone, Date dataNascimento){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;

    }


    public String imprimirContato(){

        String contato = "Nome"+ nome + "\nemail:" + email + "\n telefone:" + telefone + "\n data nascimento: " + dataNascimento;
    
        return contato;

    }
    public int calcularIdade(){

        return 0;
    }


}
