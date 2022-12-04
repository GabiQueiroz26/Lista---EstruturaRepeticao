import java.util.Locale;
import java.util.Scanner;

public class ProblemaCrescente {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int x = 0;
    int y = 1;

    while (x != y){
      System.out.println("Digite dois números: ");
      x = sc.nextInt();
      y = sc.nextInt();

      if(y < x){
        System.out.println("Decrescente");
      }else if(x < y){
        System.out.println("Crescente");
      }
    }

    sc.close();
  }
}
