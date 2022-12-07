package Lista 2;

import java.lang.Math;

public class Circunferencia {
    private double x, y, r;
    final static private double PI = 3.14;

        public Circunferencia(double x, double y, double r){
                if (ValidaCircunferencia(r)) {
                this.x = x;
                this.y = y;
                this.r = r;
                }
                else{
                System.out.println("Error: Circunferencias com radios negativos nao podem ser criadas!!!");
                this.x = 0;
                this.y = 0;
                this.r = 0;
                }
    }
        public Circunferencia(){
             this( 0.0, 0.0, 1.0);
    }
         public Circunferencia(double r){
            this(0.0, 0.0, r);
    }

        public Circunferencia(double x, double y){
            this(x, y, 1.0);
            }

        public Circunferencia(Circunferencia c){
            this(c.x, c.y, c.r);
            }

        private boolean ValidaCircunferencia(double r){
            return (r>=0);
            }

        public void imprimirCircunferencia(){
            System.out.println("Centro: ("+x+", "+y+") Radio: "+r);
            }

        public double calcularArea(){
            return PI*r*r;
            }

        public double calcularPerimetro(){
            return 2*PI*r;
            }

        public boolean verificaPontoInterno(double x, double y){
            double dx, dy, d;
            dx = this.x - x;
            dy = this.y - y;
            d = Math.sqrt(dx*dx + dy*dy);
            if (d <= r)
            return true;
            else
            return false;
            }
            
}
