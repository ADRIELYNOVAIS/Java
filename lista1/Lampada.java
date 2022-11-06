package lista1;

public class Lampada {

    private float valor;
    private int voltagem, quantidade;

        public void vender(){

            quantidade -= 1;
            voltagem = 110;
            valor = 55.50;            

        }

        public void fazerPedido(){
            
            quantidade = 10 ;
            

        }

        public void mostraEstoque(){

            if( quantidade == 0 ){

                System.out.print( " Precisa fazer pedido de lampada." );

            } else {

                System.out.print( " Ainda tem lampada no estoque." );
            }
        }
    }


