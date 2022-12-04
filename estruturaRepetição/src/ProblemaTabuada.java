import java.util.Locale;
import java.util.Scanner;

public class ProblemaTabuada {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      int valor, tabuada;

      System.out.print("Deseja a tabuada para qual valor? ");
      valor = sc.nextInt();
    

      for (int i = 0; i < 10; i++) {
        tabuada = i * valor;
        System.out.print(valor + " x " + i + " = ");
        System.out.println(valor * i);
      }


      sc.close();
    }
  }
  
