import java.util.Scanner; 

public class areaRetangulo {

  public static void main(String[] args) {
  Scanner var = new Scanner(System.in);
  int altura, base;

  System.out.printf("Informe o primeiro valor para a base: ");
  altura = var.nextInt(); 

  System.out.printf("Informe o segundo valor para a altura: ");
  base = var.nextInt(); 

  System.out.printf("\nArea do Retangulo\n");
  System.out.printf("%d * %d = %3d\n", altura, base, ((base * altura)/2));

  var.close();
  
  }

}