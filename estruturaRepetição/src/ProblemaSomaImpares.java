import java.util.Scanner;

public class ProblemaSomaImpares {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int soma = 0;
    int x;
    int y;

    System.out.println("Informe o valor de x: ");
    x = sc.nextInt();
    System.out.println("Informe o valor de Y");
    y = sc.nextInt();

    if (x < y) {
      for (int i = x + 1; i < y; i++) {
        if (i % 2 != 0) {
          soma += i;
        }
      }
    } else {
      for (int i= y + 1; i < x; i++) {
        if (i % 2 != 0) {
          soma += i;
        }
      }
    }

    System.out.println("Soma dos impares: " + soma);

    sc.close();
  
  }
}
