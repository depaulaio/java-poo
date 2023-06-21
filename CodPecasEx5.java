import java.util.Locale;
import java.util.Scanner;

public class CodPecasEx5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Locale.setDefault(new Locale("en", "US"));

    int codPeca1, codPeca2, nPecas1, nPecas2;
    double valorPeca1, valorPeca2, valoraPagar;

    System.out.println("Informe o código da peça 1: ");
    codPeca1 = sc.nextInt();
    System.out.println("Informe o número de peças 1: ");
    nPecas1 = sc.nextInt();
    System.out.println("Informe o valor da peça 1: ");
    valorPeca1 = sc.nextDouble();
    System.out.println("Informe o código da peça 2: ");
    codPeca2 = sc.nextInt();
    System.out.println("Informe o número de peças 2: ");
    nPecas2 = sc.nextInt();
    System.out.println("Informe o valor da peça 2: ");
    valorPeca2 = sc.nextDouble();

    valoraPagar = ((nPecas1 * valorPeca1)
        + (nPecas2 * valorPeca2));

    System.out.println("Entrada: ");
    System.out.print(codPeca1 + " " + nPecas1 + " ");
    System.out.printf("%.2f \n", valorPeca1);

    System.out.print(codPeca2 + " " + nPecas2 + " ");
    System.out.printf("%.2f \n", valorPeca2);

    System.out.println("Saída: ");
    System.out.printf("VALOR A PAGAR: R$ %.2f", valoraPagar);

  }

}