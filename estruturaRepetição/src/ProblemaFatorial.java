import java.util.Scanner;

public class ProblemaFatorial {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numero;
    int fatorial = 1;

    System.out.println("Informe o numero para calcular o fatorial: ");
    numero = sc.nextInt();

    if(numero > 15){
      System.out.println("Não aceita numeros maiores que 15");
    } else{
      for (int i = numero; i > 0; i--) {
        fatorial = fatorial * i;
      }
    }
    
    System.out.println("Fatorial de "+ numero + " = " + fatorial);
    
    sc.close();
  }
}
