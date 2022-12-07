package Lista 2;

import java.lang.Math;

public class Ponto2D {
    
    private float x, y;

    public void pontoX( float x ){
        this.x = x;
    }

    public float pontoX(){
        return x;
    }

    public void pontoY( float y ){
        this.y = y;
    }

    public float pontoY(){
        return y;
    }

    public String imprimir(){

        String imprime = "Ponto x: " + x +"\n Ponto y:" + y;

        return imprime;
    }

    public boolean isEixoX( float x ){
       return true;
    }

    public boolean isEixoY( float y ){
        return true;
    }

    public boolean isEixos( float x, float y){

        if( x == 00 && y ==0){
            return true;
        } return false;
    }

    public int quadrante( float x , float y ){

        if( x> 0 && y> 0){
            return 1;
        } else if (x> 0 && y<0){
            return 2;
        }else if( x< 0 && y <0 ){
            return 3;
        }else if( x< 0 && y>0){
            return 4;
        } return 0;
    }

    public float distancia( float x, float y){
        float dx, dy, d;
            dx = this.x - x;
            dy = this.y - y;
            d = (float) Math.sqrt(dx*dx + dy*dy);
            //por que precisa do cast??
            return d;

    }
}
