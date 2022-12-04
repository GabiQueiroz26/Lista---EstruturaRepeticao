import java.util.Scanner;

public class ProblemaDentroFora {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numero;
    int dentro = 0;
    int fora =0;

    System.out.print("Digite a quantidade de numeros ");
    numero = sc.nextInt();
  
    
    for (int i = 0; i < numero; i++) {
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        if (n > 9 && n <21){
            dentro++;
        }
        else{
            fora++;
        }
    }

    System.out.println(" Possui " + dentro + " numeros dentro");
    System.out.println(" Possui " + fora + " numeros fora");

    sc.close();
  }


    

}
