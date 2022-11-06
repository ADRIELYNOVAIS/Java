package lista1;

public class LampadaTresEstados {

    private boolean estadoLamapada; 

    public void acende(){ 

        this.estadoLamapada = true;
        
    }

    public void apagada(){
        
        this.estadoLamapada = false;

    }

    public void mostraEstado(){

        if( estadoLamapada == true ){

            System.out.print("A lampada está acensa");

        } else if ( estadoLamapada == false ){

            System.out.print("A lampada está apagada");

        } else {

            System.out.print("A lampada está em meia luz");

        }
}

}
