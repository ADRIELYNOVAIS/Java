package lista2;

public class Data {

    private int dia;
    private int  mes;
    private int  ano;
    

    public void inicializarData( int Dia,  int Mes, int Ano){
        dia = Dia;
        mes = Mes;
        ano = Ano;

        //setter
    }

    public void verificarData(){

        if (dia > 0 || dia > 32 ){
            if ( mes > 0 || mes > 12 ){
                if( ano > 0 ){
                //como posso retornar os tres?
                }
            }
        }

    }

    public void imprimirData(){

        System.out.println("Data: " + dia + "/" + mes + "/" + ano );

    }

    public void imprimirDataExtenso( int mes ){

       switch(mes){

       case 1:
       System.out.println("Data: " + dia + " de " + "janeiro" + " de " + ano );
       break;

       case 2:
       System.out.println("Data: " + dia + " de " + "fevereiro" + " de " + ano );
       break;

       case 3:
       System.out.println("Data: " + dia + " de " + "março" + " de " + ano );
       break;

       case 4:
       System.out.println("Data: " + dia + " de " + "abril" + " de " + ano );
       break;

       case 5:
       System.out.println("Data: " + dia + " de " + "maio" + " de " + ano );
       break;

       case 6:
       System.out.println("Data: " + dia + " de " + "junho" + " de " + ano );
       break;

       case 7:
       System.out.println("Data: " + dia + " de " + "julho" + " de " + ano );
       break;

       case 8:
       System.out.println("Data: " + dia + " de " + "agosto" + " de " + ano );
       break;

       case 9:
       System.out.println("Data: " + dia + " de " + "setembro" + " de " + ano );
       break;

       case 10:
       System.out.println("Data: " + dia + " de " + "outubro" + " de " + ano );
       break;

       case 11:
       System.out.println("Data: " + dia + " de " + "novembro" + " de " + ano );
       break;

       case 12:
       System.out.println("Data: " + dia + " de " + "dezembro" + " de " + ano );
       break;

       default:
       System.out.println("opção inválida!");
    }

    }
    
}
